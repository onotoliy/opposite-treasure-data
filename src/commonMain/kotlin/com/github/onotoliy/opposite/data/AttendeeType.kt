package com.github.onotoliy.opposite.data

enum class AttendeeType(val label: String) {
    NONE("Не выбрано"),
    ATTENDED("Присутствовал"),
    ABSENT_WITHOUT_REASON("Отсутсвовал (без уважительной причины)"),
    ABSENT_WITH_REASON("Отсутсвовал (по уважительной причины)")
}