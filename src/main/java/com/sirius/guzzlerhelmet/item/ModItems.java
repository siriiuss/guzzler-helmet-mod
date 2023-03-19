package com.sirius.guzzlerhelmet.item;

import com.sirius.guzzlerhelmet.HelmetMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HelmetMod.MOD_ID);

    public static final RegistryObject<Item> SODA = ITEMS.register("soda",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB)));

    public static final RegistryObject<Item> EMPTY_SODA = ITEMS.register("empty_soda",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
