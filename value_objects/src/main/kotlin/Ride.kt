internal data class Ride(
    private val startingStop: Stop,
    private val finalStop: Stop,
){
    operator fun plus(ride: Ride): Ride = Ride(this.startingStop, ride.finalStop)
    operator fun plus(stop: Stop): Ride = Ride(this.startingStop, stop)

    companion object{
        fun of(startingStop: Stop, finalStop: Stop): Ride = Ride(startingStop, finalStop)
        infix fun from(startingStop: Stop): Stop = startingStop
    }
}

@JvmInline
internal value class Stop(val order: Long) {
    operator fun rangeTo(finalStop: Stop): Ride = Ride(this, finalStop)
    infix fun to(finalStop: Stop) = Ride(this, finalStop)
}





