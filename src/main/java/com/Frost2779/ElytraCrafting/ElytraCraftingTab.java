package com.Frost2779.ElytraCrafting;

import com.Frost2779.ElytraCrafting.Init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ElytraCraftingTab extends CreativeTabs{

	public ElytraCraftingTab() {
		super("tabElytraCrafting");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.enderPearlDust);
	}

}
