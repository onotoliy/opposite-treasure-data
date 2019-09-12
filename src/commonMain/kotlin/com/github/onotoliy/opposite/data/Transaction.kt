package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasAuthor
import com.github.onotoliy.opposite.data.core.HasCreationDate
import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Transaction(
    override val uuid: String = "",
    override val name: String = "",
    val cash: String = "",
    val type: TransactionType = TransactionType.NONE,
    val person: Option? = null,
    val event: Option? = null,
    override val creationDate: String = "",
    override val author: Option = Option()
) : HasUUID, HasName, HasCreationDate, HasAuthor