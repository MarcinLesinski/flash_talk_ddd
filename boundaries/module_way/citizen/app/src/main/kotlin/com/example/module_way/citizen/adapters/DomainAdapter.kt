package com.example.module_way.citizen.adapters

import java.time.DayOfWeek

fun DayOfWeek.toDomain() = Day.of(this.value)
