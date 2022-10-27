package com.example.ddd

import com.example.ddd.citizen.CitizenService
import com.example.ddd.townHall.TownHallService
import javax.annotation.PostConstruct
import org.springframework.context.annotation.Configuration

@Configuration
internal class Config {

    @PostConstruct
    fun bindServices(citizenService: CitizenService, townHallService: TownHallService) {
        citizenService.onCitizenPointsChanged(townHallService::updateRanking)
    }
}
