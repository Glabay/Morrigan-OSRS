package gg.rsmod.plugins.content.items.bones

Bone.values.forEach { bone ->
    on_item_option(item = bone.item, option = "bury") {
        if (!Bones.canBury(player)) {
            return@on_item_option
        }

        val inventorySlot = player.getInteractingItemSlot()
        if (player.inventory.remove(item = bone.item, beginSlot = inventorySlot).hasSucceeded()) {
            Bones.bury(player, bone)
        }
    }
}