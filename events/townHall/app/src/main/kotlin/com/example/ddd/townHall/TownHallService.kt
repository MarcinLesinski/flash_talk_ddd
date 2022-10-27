package com.example.ddd.townHall

import TownHall
import org.springframework.stereotype.Service

@Service
class TownHallService {
    fun updateRanking(citizenId: Long, points: Long) {
        val townHall = getTownHall()

        townHall.updateRanking(citizenId, points)

        saveTownHall(townHall)
    }

    private fun getTownHall(): TownHall = TODO()
    private fun saveTownHall(townHall: TownHall) { TODO() }
}
