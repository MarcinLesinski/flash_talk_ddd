package com.example.module_way.citizen.adapters.read

import org.springframework.stereotype.Repository

@Repository
internal class CitizenReadRepository {
    fun all(): List<CitizenReadDto> = listOf()
    fun find(id: Long): CitizenReadDto = CitizenReadDto()
}
