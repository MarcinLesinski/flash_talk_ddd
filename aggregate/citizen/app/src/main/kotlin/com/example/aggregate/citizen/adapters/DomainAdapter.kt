package com.example.aggregate.citizen.adapters

import java.time.DayOfWeek

fun DayOfWeek.toDomain() = Day.of(this.value)
