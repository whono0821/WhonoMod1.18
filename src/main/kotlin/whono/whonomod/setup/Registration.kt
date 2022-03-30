package whono.whonomod.setup

import net.minecraft.world.entity.projectile.ItemSupplier
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.Rarity
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import whono.whonomod.WhonoMod
import java.util.function.Supplier

object Registration {

    private val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WhonoMod.MODID)
    private val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WhonoMod.MODID)

    fun setup() {

        WMItems.register()

        val eventBus = FMLJavaModLoadingContext.get().modEventBus

        BLOCKS.register(eventBus)
        ITEMS.register(eventBus)
    }

    fun registerItem(name: String): RegistryObject<Item> = registerItem(name, Rarity.COMMON)
    fun registerItem(name: String, rarity: Rarity): RegistryObject<Item> = registerItem(name) {
        Item(
            Item.Properties().tab(WhonoMod.CREATIVE_TAB).rarity(rarity)
        )
    }
    fun registerItem(name: String, itemSupplier: Supplier<Item>): RegistryObject<Item> = ITEMS.register(name, itemSupplier)
}