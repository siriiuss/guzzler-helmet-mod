package com.sirius.guzzlerhelmet.block;

import com.sirius.guzzlerhelmet.HelmetMod;
import com.sirius.guzzlerhelmet.item.ModCreativeModeTab;
import com.sirius.guzzlerhelmet.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HelmetMod.MOD_ID);

    public static final RegistryObject<Block> SODA_SHELF = registerBlock("soda_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1f)), ModCreativeModeTab.HELMET_TAB);
    public static final RegistryObject<Block> EMPTY_SODA_SHELF = registerBlock("empty_soda_shelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1f)), ModCreativeModeTab.HELMET_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
