package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemEnderInfusedHarness extends Item{

	public ItemEnderInfusedHarness() {
		setUnlocalizedName(Refrence.FrostModItems.ENDERINFUSEDHARNESS.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.ENDERINFUSEDHARNESS.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
