@file:Suppress("UNCHECKED_CAST")

package com.example.aggregate.citizen.adapters.write

import Citizen
import Points
import Rank
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

fun Citizen.id() = getValue<Long>("id")
fun Citizen.rank() = getValue<Rank>("rank")
fun Citizen.points() = getValue<Points>("points")


private fun <T> Citizen.getValue(propertyName: String): T = getPropertyValue(property(propertyName)) as T

private fun <T> Citizen.getPropertyValue(property: KProperty1<out Citizen, T>): T {
    property.isAccessible = true
    val result = property.getter.call(this)
    property.isAccessible = false
    return result
}

private fun Citizen.property(name: String): KProperty1<out Citizen, *> =
    this::class.memberProperties.first { it.name == name }


