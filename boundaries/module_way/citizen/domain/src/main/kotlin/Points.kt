@JvmInline
internal value class Points(internal val value: Long) {
    operator fun compareTo(i: Long): Int = (value - i).toInt()
    operator fun minus(reductionValue: Long): Points = Points(value - reductionValue)
    operator fun minus(reductionPoints: Points): Points = Points(value - reductionPoints.value)
    operator fun plus(points: Points): Points = Points(value + points.value)

    infix fun reduce(points: Long): Points = this - points
    infix fun add(points: Points): Points = this + points
}
