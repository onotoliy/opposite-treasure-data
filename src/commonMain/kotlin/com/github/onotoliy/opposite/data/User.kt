package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class User(
    override val uuid: String = "",
    override val name: String = "",
    val login: String = "",
    val email: String = "",
    val phone: String = "",
    val notifyByPhone: Boolean = false,
    val notifyByEmail: Boolean = true,
    val roles: Set<String> = setOf()
) : HasUUID, HasName
