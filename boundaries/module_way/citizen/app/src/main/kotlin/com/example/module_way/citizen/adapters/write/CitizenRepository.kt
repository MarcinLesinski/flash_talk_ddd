package com.example.module_way.citizen.adapters.write

import Citizen
//import Points
//import PromoDayExtraPoints
//import Rank
import org.springframework.stereotype.Repository

@Repository
internal class CitizenRepository {
    fun find(id: Long): Citizen = TODO()// Citizen(1L, Rank.Bronze, Points(15L), Points(25L), PromoDayExtraPoints(Points(34L)))

    fun save(citizen: Citizen) {
//        citizen.id()
//        citizen.points()
//        citizen.rank()
    }
}
