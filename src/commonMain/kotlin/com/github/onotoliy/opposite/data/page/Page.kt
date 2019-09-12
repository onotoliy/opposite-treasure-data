package com.github.onotoliy.opposite.data.page

import kotlinx.serialization.Serializable

@Serializable
class Page<T>(
    /**
     * Мета данные о списке.
     */
    val meta: Meta = Meta(),

    /**
     * Данные.
     */
    val context: List<T> = emptyList()
)