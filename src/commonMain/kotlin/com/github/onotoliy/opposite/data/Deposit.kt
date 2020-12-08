package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Deposit(
    override val uuid: String = "",
    override val name: String = "",
    val deposit: String = "0.0"
) : HasUUID, HasName {
    override fun toString(): String = "{\"uuid\": \"$uuid\", \"name\": \"$name\", \"deposit\": \"$deposit\"}"
}
