package com.github.onotoliy.opposite.data.page

import kotlinx.serialization.Serializable

@Serializable
class Meta(
    /**
     * Общее количество записей.
     */
    val total: Int = -1,

    /**
     * Мета данные страницы.
     */
    val paging: Paging = Paging())