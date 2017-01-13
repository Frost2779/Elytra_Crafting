package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemHardenedLeather extends Item{

	public ItemHardenedLeather() {
		setUnlocalizedName(Refrence.FrostModItems.HARDENEDLEATHER.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.HARDENEDLEATHER.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
