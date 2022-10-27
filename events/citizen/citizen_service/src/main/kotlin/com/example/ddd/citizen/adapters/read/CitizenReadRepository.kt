package com.example.ddd.citizen.adapters.read

import org.springframework.stereotype.Repository

@Repository
class CitizenReadRepository {
    fun all(): List<CitizenReadDto> = listOf()
    fun find(id: Long): CitizenReadDto = CitizenReadDto()
}
