class Citizen(
    private val id: Long,
    private var rank: Rank,
    private var points: Points,
    private val mandateRefundPoints: Points,
    private val promoDayExtraPoints: PromoDayExtraPoints,
) : Aggregate() {
    private lateinit var onRankDown: OnRankChanged
    private lateinit var onPointsChanged: OnPointsChanged
    private lateinit var onRankUp: OnRankChanged

    //region event setters
    fun onCitizenPointsChanged(event: OnPointsChanged) {
        onPointsChanged = event
    }

    fun onRankUp(event: OnRankChanged) {
        onRankUp = event
    }

    fun onRankDown(event: OnRankChanged) {
        onRankDown = event
    }
    //endregion

    infix fun getAMandate(mandate: Mandate) {
        points = points reduce mandate.reductionPoints
        onPointsChanged(id, points.value)

        rank = rank.recalculate(points)
        if (rank.degraded) onRankDown()
    }

    infix fun payAMandate(day: Day): DomainEvents {
        points = points + mandateRefundPoints + promoDayExtraPoints(day)
        events += { onPointsChanged(id, points.value) }

        rank = rank.recalculate(points)
        if (rank.promoted) events += { onRankUp() }

        return events
    }
}
typealias OnPointsChanged = (citizenId: Long, points: Long) -> Unit
typealias OnRankChanged = () -> Unit
