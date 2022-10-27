@file:Suppress("UNCHECKED_CAST")

package com.example.module_way.citizen.adapters.write

import Citizen
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

fun Citizen.id() = getValue<Long>("id")
fun Citizen.rank(): Long = TODO() //getValue<Rank>("rank")
fun Citizen.points(): Long = TODO()// getValue<Points>("points")


private fun <T> Citizen.getValue(propertyName: String): T = getPropertyValue(property(propertyName)) as T

private fun <T> Citizen.getPropertyValue(property: KProperty1<out Citizen, T>): T {
    property.isAccessible = true
    val result = property.getter.call(this)
    property.isAccessible = false
    return result
}

private fun Citizen.property(name: String): KProperty1<out Citizen, *> =
    this::class.memberProperties.first { it.name == name }


