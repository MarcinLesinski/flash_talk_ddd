sealed class Rank {
    fun recalculate(points: Points): Rank = when {
        points < 10 -> Bronze
        points < 100 -> Silver
        else -> Gold
    }

    object Bronze : Rank()
    object Silver : Rank()
    object Gold : Rank()
}
