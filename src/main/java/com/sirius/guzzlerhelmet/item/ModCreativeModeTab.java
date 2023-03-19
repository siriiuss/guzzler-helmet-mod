package com.sirius.guzzlerhelmet.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HELMET_TAB = new CreativeModeTab("helmettab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SODA.get());
        }
    };
}
