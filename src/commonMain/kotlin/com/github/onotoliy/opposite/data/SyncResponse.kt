package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasName
import com.github.onotoliy.opposite.data.core.HasUUID
import kotlinx.serialization.Serializable

@Serializable
class SyncResponse(
    override val uuid: String = "",
    override val name: String = "",
    val status: Int = 200,
    val exception: String? = null
): HasUUID, HasName {
    override fun toString(): String =
        "{'uuid': '$uuid', 'name': '$name', 'status': '$status', 'exception': '$exception'}"}