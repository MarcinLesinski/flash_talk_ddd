sealed class Day{
    companion object {
        fun of(value: Int): Day = when(value) {
            1 -> MONDAY
            2 -> TUESDAY
            3 -> WEDNESDAY
            4 -> THURSDAY
            5 -> FRIDAY
            6 -> SATURDAY
            7 -> SUNDAY
            else -> error("unknown day")
        }
    }
    object MONDAY: Day()
    object TUESDAY: Day()
    object WEDNESDAY: Day()
    object THURSDAY: Day()
    object FRIDAY: Day()
    object SATURDAY: Day()
    object SUNDAY: Day()
}
