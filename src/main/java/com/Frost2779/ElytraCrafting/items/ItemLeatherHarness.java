package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemLeatherHarness extends Item{

	public ItemLeatherHarness() {
		setUnlocalizedName(Refrence.FrostModItems.LEATHERHARNESS.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.LEATHERHARNESS.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
