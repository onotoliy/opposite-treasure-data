package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasId
import com.github.onotoliy.opposite.data.core.HasName

class Event(private val id: Long = 0 ,
            private val name: String = "",
            private val contribution: String = "",
            private val total: String = "",
            private val creationDate: Long,
            private val deadline: Long) : HasId<Long>, HasName {

    override fun getId(): Long {
        return id
    }

    override fun getName(): String {
        return name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        other as Event

        if (id != other.id) return false
        if (name != other.name) return false
        if (contribution != other.contribution) return false
        if (total != other.total) return false
        if (creationDate != other.creationDate) return false
        if (deadline != other.deadline) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + contribution.hashCode()
        result = 31 * result + total.hashCode()
        result = 31 * result + creationDate.hashCode()
        result = 31 * result + deadline.hashCode()
        return result
    }

    override fun toString(): String {
        return "Event(id=$id, name='$name', contribution='$contribution', total='$total', creationDate=$creationDate, deadline=$deadline)"
    }
}