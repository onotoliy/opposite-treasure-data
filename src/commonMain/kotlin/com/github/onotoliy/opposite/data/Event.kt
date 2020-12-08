package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.*
import kotlinx.serialization.Serializable

@Serializable
class Event(
    override val uuid: String = "",
    override val name: String = "",
    val contribution: String = "",
    val total: String = "",
    val deadline: String = "",
    override val creationDate: String = "",
    override val author: Option = Option(),
    override val deletionDate: String? = null
) : HasUUID, HasName, HasCreationDate, HasAuthor, HasDeletionDate {
    override fun toString(): String =
        """{
            |  'uuid': '$uuid', 
            |  'name': '$name', 
            |  'contribution': '$contribution', 
            |  'total': '$total', 
            |  'deadline': $deadline, 
            |  'creationDate': '$creationDate', 
            |  'author': $author, 
            |  'deletionDate':'$deletionDate'
            |}""".trimMargin()
}