package whono.whonomod

import com.mojang.logging.LogUtils
import net.minecraftforge.fml.common.Mod
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Items
import whono.whonomod.setup.Registration


@Mod(WhonoMod.MODID)
class WhonoMod {

    companion object {

        const val MODID = "whonomod"
        const val NAME = "Whono Mod"

        val LOGGER = LogUtils.getLogger()
        val CREATIVE_TAB: CreativeModeTab = object : CreativeModeTab(NAME) {
            override fun makeIcon(): ItemStack = ItemStack(Items.DIAMOND)
        }
    }

    init {

        Registration.setup()
    }
}