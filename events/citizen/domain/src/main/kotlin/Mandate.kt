class Mandate(
    private val amount: Long,
    private val currentRatio: MandateRatio,
) {
    val reductionPoints: Long
        get() = currentRatio * (amount + 1)
}

