package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.*
import kotlinx.serialization.Serializable

@Serializable
class Transaction(
    override val uuid: String = "",
    override val name: String = "",
    val cash: String = "",
    val type: TransactionType = TransactionType.NONE,
    val person: Option? = null,
    val event: Option? = null,
    val transactionDate: String = "",
    override val creationDate: String = "",
    override val author: Option = Option(),
    override var deletionDate: String? = null
) : HasUUID, HasName, HasCreationDate, HasAuthor, HasDeletionDate {
    override fun toString(): String =
        """{
            |  'uuid': '$uuid', 
            |  'name': '$name', 
            |  'cash': '$cash', 
            |  'type': '$type', 
            |  'person': $person, 
            |  'event': $event, 
            |  'transactionDate': '$transactionDate', 
            |  'creationDate': '$creationDate', 
            |  'author': $author, 
            |  'deletionDate':'$deletionDate'
            |}""".trimMargin()
}