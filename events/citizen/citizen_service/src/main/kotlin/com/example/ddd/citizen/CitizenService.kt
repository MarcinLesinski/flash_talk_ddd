package com.example.ddd.citizen

import Citizen
import com.example.ddd.citizen.adapters.toDomain
import com.example.ddd.citizen.adapters.write.CitizenRepository
import com.example.ddd.citizen.adapters.write.MandateFactory
import com.example.ddd.citizen.infrastructure.Email
import com.example.ddd.citizen.infrastructure.TimeProvider
import org.springframework.stereotype.Service

@Service
class CitizenService(
    private val citizenRepository: CitizenRepository,
    private val mandateFactory: MandateFactory,
    private val time: TimeProvider,
    private val email: Email,
) {
    fun onCitizenPointsChanged(event: OnCitizenPointsChanged) { onCitizenPointsChanged = event }
    private lateinit var onCitizenPointsChanged: OnCitizenPointsChanged

    fun giveMandateToCitizen(citizenId: Long, mandateType: Long, mandateValue: Long) {
        val citizen = getCitizen(citizenId)
        val mandate = mandateFactory.construct(mandateType, mandateValue)

        citizen.getAMandate(mandate)

        citizenRepository.save(citizen)
    }

    fun payMandate(citizenId: Long) {
        val citizen = getCitizen(citizenId)

        val events = citizen.payAMandate(time.day().toDomain())

        citizenRepository.save(citizen)
        events.publish()
    }

    private fun getCitizen(citizenId: Long): Citizen {
        val citizen = citizenRepository.find(citizenId)
        citizen.onRankUp { email.sendCongratulationsMail() }
        citizen.onRankDown { email.sendImSorryMail() }
        citizen.onPointsChanged(onCitizenPointsChanged)
        return citizen
    }
}

internal typealias OnCitizenPointsChanged = (citizenId: Long, points: Long) -> Unit

