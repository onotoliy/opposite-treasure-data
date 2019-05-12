package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasId
import com.github.onotoliy.opposite.data.core.HasName

class Option<I>(private val id: I,
                private val name: String) : HasId<I>, HasName {

    override fun getId() : I {
        return id
    }

    override fun getName() : String {
        return name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        other as Option<*>

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "Option(id=$id, name=$name)"
    }
}