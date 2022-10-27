class PromoDayExtraPoints(
    private val  promoDayExtraPoints: Points,
) {
    operator fun invoke(day: Day): Points = if (day is Day.WEDNESDAY) promoDayExtraPoints else Points(0)
}
