package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasUUID
import com.github.onotoliy.opposite.data.core.HasName
import kotlinx.serialization.Serializable

@Serializable
class Option(
    override val uuid: String = "",
    override val name: String = ""
) : HasUUID, HasName {
    override fun toString(): String = "{\"uuid\": \"$uuid\", \"name\": \"$name\"}"
}