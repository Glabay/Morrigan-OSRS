package gg.rsmod.game.message.impl

import gg.rsmod.game.message.Message

data class LoadFriendListMessage(val online: Byte, val username: String, val previousUsername: String, val world: Short) : Message
