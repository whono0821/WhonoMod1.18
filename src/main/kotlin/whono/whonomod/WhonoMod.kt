package whono.whonomod

import com.mojang.logging.LogUtils
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext

@Mod(WhonoMod.MODID)
class WhonoMod {

    companion object {
        private val LOGGER = LogUtils.getLogger()
        const val MODID = "whonomod"
    }

    init {

        val eventBus = FMLJavaModLoadingContext.get().modEventBus
    }
}