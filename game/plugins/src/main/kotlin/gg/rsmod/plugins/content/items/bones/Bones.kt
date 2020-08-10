package gg.rsmod.plugins.content.items.bones

import gg.rsmod.game.fs.def.ItemDef
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.timer.ATTACK_DELAY
import gg.rsmod.game.model.timer.BONE_DELAY
import gg.rsmod.plugins.api.Skills
import gg.rsmod.plugins.api.ext.message
import gg.rsmod.plugins.api.ext.playSound

/**
 * @author Glabay
 */
object Bones {

    private const val BURY_BONE_ANIM = 827
    private const val BURY_BONE_SOUND = 2393

    fun canBury(p: Player): Boolean = !p.timers.has(BONE_DELAY)

    fun bury(p: Player, bone: Bone) {
        val delay = BONE_DELAY
        val anim = BURY_BONE_ANIM

        val foodName = p.world.definitions.get(ItemDef::class.java, bone.item).name

        p.animate(anim)
        p.playSound(BURY_BONE_SOUND)
        p.resetFacePawn()

        p.timers[delay] = bone.tickDelay
        p.timers[ATTACK_DELAY] = 5

        when (bone) {
            else -> {
                p.message("You bury the ${foodName.toLowerCase()}.")
                p.addXp(Skills.PRAYER, bone.exp)
            }
        }
    }

}