package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasId
import com.github.onotoliy.opposite.data.core.HasName

class Cashbox(private val id: Long = 0,
              private val name: String = "",
              private val money: String = "",
              private val type: CashboxType = CashboxType.NONE,
              private val creationDate: Long = 0,
              private val event: Option<Long>? = null) : HasId<Long>, HasName {

    override fun getId(): Long {
        return id
    }

    override fun getName(): String {
        return name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        other as Cashbox

        if (id != other.id) return false
        if (name != other.name) return false
        if (money != other.money) return false
        if (type != other.type) return false
        if (creationDate != other.creationDate) return false
        if (event != other.event) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + money.hashCode()
        result = 31 * result + type.hashCode()
        result = 31 * result + creationDate.hashCode()
        result = 31 * result + (event?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Cashbox(id=$id, name='$name', money='$money', type=$type, creationDate=$creationDate, event=$event)"
    }
}