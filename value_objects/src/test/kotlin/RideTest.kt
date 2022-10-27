import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RideTest {

    @Test
    fun `should add rides`() {
        val ride1 = Ride(Stop(1), Stop(2))
        val ride2 = Ride(Stop(2), Stop(3))

        val actualRide = ride1 + ride2

        actualRide shouldBe Ride(Stop(1), Stop(3))
    }

    @Test
    fun `should add stop to ride`() {
        val ride = Ride(Stop(1), Stop(2))
        val stop = Stop(8)

        val actualRide = ride + stop

        actualRide shouldBe Ride(Stop(1), Stop(8))
    }

    @Test
    fun `dsl example`() {

        val ride1 = Ride.of(Stop(1), Stop(8))


        val ride2 = Stop(1) .. Stop(8)


        val ride3 = Stop(1) to Stop(8)


        val ride4 = Ride from Stop(1) to Stop(8)







        val actualRide = ride1 + ride2 + ride3 + ride4

        actualRide shouldBe Ride(Stop(1), Stop(3))
    }

}
