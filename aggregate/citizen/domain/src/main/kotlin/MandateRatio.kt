class MandateRatio(
    private val ratio: Long
) {
    operator fun times(multiplier: Long): Long = ratio * multiplier
}
