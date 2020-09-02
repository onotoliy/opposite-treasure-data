package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasAuthor
import com.github.onotoliy.opposite.data.core.HasCreationDate
import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Meeting(
    override val uuid: String = "",
    override val name: String = "",
    val absencePenalty: String = "",
    val meetingDate: String = "",
    val attendees: List<Attendee> = listOf(),
    override val creationDate: String = "",
    override val author: Option = Option()
) : HasUUID, HasName, HasCreationDate, HasAuthor
