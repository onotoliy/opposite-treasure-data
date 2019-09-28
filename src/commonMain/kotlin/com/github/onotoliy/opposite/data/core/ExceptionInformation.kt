package com.github.onotoliy.opposite.data.core

import kotlinx.serialization.Serializable

@Serializable
class ExceptionInformation(
    val status: HTTPStatus = HTTPStatus.INTERNAL_SERVER_ERROR,
    val message: String = "")