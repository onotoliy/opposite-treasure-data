package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class Attendee(
    private val person: Option = Option(),
    val type: AttendeeType = AttendeeType.NONE
) : HasUUID, HasName {

    override val uuid: String
        get() = person.uuid

    override val name: String
        get() = person.name

}