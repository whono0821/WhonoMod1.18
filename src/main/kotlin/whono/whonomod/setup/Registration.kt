package whono.whonomod.setup

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import whono.whonomod.WhonoMod

object Registration {

    val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WhonoMod.MODID)
    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WhonoMod.MODID)

    fun register() {

        val eventBus = FMLJavaModLoadingContext.get().modEventBus

        BLOCKS.register(eventBus)
        ITEMS.register(eventBus)
    }
}