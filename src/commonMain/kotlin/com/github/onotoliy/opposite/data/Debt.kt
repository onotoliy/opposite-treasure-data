package com.github.onotoliy.opposite.data

import kotlinx.serialization.Serializable

@Serializable
class Debt(
    val event: Event = Event(),
    val deposit: Deposit = Deposit()
) {
    override fun toString(): String = "{\"event\": $event, \"deposit\": $deposit}"
}
