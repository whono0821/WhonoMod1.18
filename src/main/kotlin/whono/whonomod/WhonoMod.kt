package whono.whonomod

import com.mojang.logging.LogUtils
import net.minecraftforge.fml.common.Mod
import whono.whonomod.setup.Registration

@Mod(WhonoMod.MODID)
class WhonoMod {

    companion object {
        private val LOGGER = LogUtils.getLogger()
        const val MODID = "whonomod"
    }

    init {

        Registration.register()
    }
}