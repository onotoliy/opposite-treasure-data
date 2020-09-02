package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasAuthor
import com.github.onotoliy.opposite.data.core.HasCreationDate
import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Event(
    override val uuid: String = "",
    override val name: String = "",
    val contribution: String = "",
    val total: String = "",
    val deadline: String = "",
    val meeting: Option? = null,
    override val creationDate: String = "",
    override val author: Option = Option()
) : HasUUID, HasName, HasCreationDate, HasAuthor