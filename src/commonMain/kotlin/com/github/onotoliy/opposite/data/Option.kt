package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasUUID
import com.github.onotoliy.opposite.data.core.HasName
import kotlinx.serialization.Serializable

@Serializable
class Option(override val uuid: String = "",
             override val name: String = "") : HasUUID, HasName {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Option

        if (uuid != other.uuid) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = uuid.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "Option(uuid='$uuid', name='$name')"
    }
}