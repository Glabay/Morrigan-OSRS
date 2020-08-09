package gg.rsmod.game.sync.segment

import gg.rsmod.game.sync.SynchronizationSegment
import gg.rsmod.net.packet.GamePacketBuilder

/**
 * @author Tom <rspsmods@gmail.com>
 */
class SetBitAccessSegment : SynchronizationSegment {

    override fun encode(buf: GamePacketBuilder) {
        buf.switchToBitAccess()
    }
}