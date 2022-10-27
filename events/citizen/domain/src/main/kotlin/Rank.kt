sealed class Rank {
    val promoted: Boolean = true
    val degraded: Boolean = false

    fun recalculate(points: Points): Rank = when {
        points < 10 -> Bronze
        points < 100 -> Silver
        else -> Gold
    }

    object Bronze : Rank()
    internal object Silver : Rank()
    internal object Gold : Rank()
}
