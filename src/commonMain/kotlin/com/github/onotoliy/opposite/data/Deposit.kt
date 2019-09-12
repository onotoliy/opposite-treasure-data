package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Deposit(
    val person: Option = Option("", ""),
    val deposit: String = "0.0") : HasUUID {

    override val uuid: String = person.uuid

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        other as Deposit

        if (person != other.person) return false
        if (deposit != other.deposit) return false

        return true
    }

    override fun hashCode(): Int {
        var result = person.hashCode()
        result = 31 * result + deposit.hashCode()
        return result
    }

    override fun toString(): String {
        return "Deposit(person=$person, deposit='$deposit')"
    }
}
