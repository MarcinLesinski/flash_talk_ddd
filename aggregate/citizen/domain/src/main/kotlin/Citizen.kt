class Citizen(
    private val id: Long,
    private var rank: Rank,
    private var points: Points,
    private val mandateRefundPoints: Points,
    private val promoDayExtraPoints: PromoDayExtraPoints
) {
    infix fun getAMandate(mandate: Mandate) {
        // zredukuj punkty mieszkańca o wartość równą punktom karnym mandatu
        // punkty karne mandatu zależą od wysokości manatu i aktualnego ratio

        points = points reduce mandate.penaltyPoints

        rank = rank.recalculate(points)
    }

    infix fun payAMandate(day: Day) {
        points = points + mandateRefundPoints + promoDayExtraPoints(day)

        rank = rank.recalculate(points)
    }
}
