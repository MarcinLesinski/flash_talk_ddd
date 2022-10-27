class Mandate(
    private val amount: Long,
    private val currentRatio: MandateRatio,
) {
    val penaltyPoints: Long
        get() = currentRatio * (amount + 1)
}

