package com.github.onotoliy.opposite.data.core

import kotlinx.serialization.Serializable

@Serializable
class ExceptionDevice(
    val device: String = "",
    val agent: String = "",
    val message: String = "",
    val localizedMessage: String = "",
    val stackTrace: String = ""
)