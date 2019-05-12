package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasId

class Deposit(private val person: Option<String>? = null,
              private val deposit: String = "0.0") : HasId<String> {

    override fun getId(): String {
        return person?.getId() ?: ""
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        other as Deposit

        if (person != other.person) return false
        if (deposit != other.deposit) return false

        return true
    }

    override fun hashCode(): Int {
        var result = person?.hashCode() ?: 0
        result = 31 * result + deposit.hashCode()
        return result
    }

    override fun toString(): String {
        return "Deposit(person=$person, deposit='$deposit')"
    }
}
