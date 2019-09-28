package com.github.onotoliy.opposite.data

import kotlinx.serialization.Serializable

@Serializable
class Cashbox(
    val deposit: String = "0.0",
    val lastUpdateDate: String = "")