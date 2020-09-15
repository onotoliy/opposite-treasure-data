package com.github.onotoliy.opposite.data

enum class NotificationType(val label: String) {
    NONE("Не выбрано"),
    EVENT("Событие"),
    TRANSACTION("Транзакция"),
    MEETING("Собрание"),
    TEXT("Уведомление")
}