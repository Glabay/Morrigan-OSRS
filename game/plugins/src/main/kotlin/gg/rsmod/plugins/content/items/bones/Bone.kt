package gg.rsmod.plugins.content.items.bones

import gg.rsmod.plugins.api.cfg.Items

enum class Bone(val item: Int, val exp: Double, val tickDelay: Int = 3) {

    BONES(item = Items.BONES, exp = 4.5),
    BURNT_BONES(item = Items.BURNT_BONES, exp = 4.5),
    BAT_BONES(item = Items.BAT_BONES, exp = 5.3),
    BIG_BONES(item = Items.BIG_BONES, exp = 15.0),
    JOGRE_BONES(item = Items.JOGRE_BONES, exp = 15.0),
    CURVED_BONES(item = Items.CURVED_BONE, exp = 15.0),
    LONG_BONES(item = Items.LONG_BONE, exp = 15.1),
    BABYDRAGON_BONES(item = Items.BABYDRAGON_BONES, exp = 30.0),
    DRAGON_BONES(item = Items.DRAGON_BONES, exp = 72.0),
    DRAKE_BONES(item = Items.DRAKE_BONES, exp = 80.0),
    FAYRG_BONES(item = Items.FAYRG_BONES, exp = 84.0),
    LAVA_DRAGON_BONES(item = Items.LAVA_DRAGON_BONES, exp = 85.0),
    RAURG_BONES(item = Items.RAURG_BONES, exp = 96.0),
    HYDRA_BONES(item = Items.HYDRA_BONES, exp = 110.0),
    DAGANNOTH_BONES(item = Items.DAGANNOTH_BONES, exp = 125.0),
    OURG_BONES(item = Items.OURG_BONES, exp = 140.0),
    SUPERIOR_DRAGON_BONES(item = Items.SUPERIOR_DRAGON_BONES, exp = 150.0);

    companion object {
        val values = enumValues<Bone>()
    }
}