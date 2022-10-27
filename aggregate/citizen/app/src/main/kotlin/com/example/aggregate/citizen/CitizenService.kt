package com.example.aggregate.citizen


import com.example.aggregate.citizen.adapters.toDomain
import com.example.aggregate.citizen.adapters.write.CitizenRepository
import com.example.aggregate.citizen.adapters.write.MandateFactory
import com.example.aggregate.citizen.infrastructure.TimeProvider
import org.springframework.stereotype.Service

@Service
internal class CitizenService(
    private val citizenRepository: CitizenRepository,
    private val mandateFactory: MandateFactory,
    private val time: TimeProvider,
) {
    fun giveMandateToCitizen(citizenId: Long, mandateType: Long, mandateValue: Long) {
        val citizen = citizenRepository.find(citizenId)
        val mandate = mandateFactory.construct(mandateType, mandateValue)

        citizen.getAMandate(mandate)

        citizenRepository.save(citizen)
    }

    fun payMandate(citizenId: Long) {
        val citizen = citizenRepository.find(citizenId)

        citizen.payAMandate(time.day().toDomain())

        citizenRepository.save(citizen)
    }
}

