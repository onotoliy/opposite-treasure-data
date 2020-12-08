package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Deposit(
    private val person: Option = Option(),
    val deposit: String = "0.0"
) : HasUUID, HasName {

    override val uuid: String
        get() = person.uuid

    override val name: String
        get() = person.name

    override fun toString(): String = "{\"uuid\": \"$uuid\", \"name\": \"$name\", \"deposit\": \"$deposit\"}"
}
