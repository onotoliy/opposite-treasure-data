package com.github.onotoliy.opposite.data

import com.github.onotoliy.opposite.data.core.HasAuthor
import com.github.onotoliy.opposite.data.core.HasCreationDate
import com.github.onotoliy.opposite.data.core.HasUUID

class Notification(
    override val uuid: String = "",
    override val author: Option = Option(),
    override val creationDate: String = "",
    val type: NotificationType = NotificationType.FIREBASE,
    val status: NotificationStatus = NotificationStatus.WAITING,
    val objectType: NotificationObjectType = NotificationObjectType.NONE,
    val title: String = "",
    val message: String = ""
): HasCreationDate, HasAuthor, HasUUID