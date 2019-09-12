package com.github.onotoliy.opposite.data.page

import kotlinx.serialization.Serializable

@Serializable
class Paging(
    /**
     * С какой записи выводить.
     */
    val start: Int = 0,

    /**
     * Размер странцы.
     */
    val size: Int = 10
)