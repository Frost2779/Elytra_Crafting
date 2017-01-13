package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.ElytraCraftingTab;
import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemDiamondHarness extends Item{

	public ItemDiamondHarness() {
		setUnlocalizedName(Refrence.FrostModItems.DIAMONDHARNESS.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.DIAMONDHARNESS.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
		
	}
}
