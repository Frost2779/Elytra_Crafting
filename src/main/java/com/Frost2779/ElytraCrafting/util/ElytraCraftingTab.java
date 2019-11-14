package com.Frost2779.ElytraCrafting.util;

import com.Frost2779.ElytraCrafting.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ElytraCraftingTab extends CreativeTabs {
    public ElytraCraftingTab(){
        super("tabElytraCrafting");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ENDER_PEARL_DUST);
    }
}
