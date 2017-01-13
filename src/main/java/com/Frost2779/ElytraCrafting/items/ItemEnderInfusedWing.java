package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemEnderInfusedWing extends Item{

	public ItemEnderInfusedWing() {
		setUnlocalizedName(Refrence.FrostModItems.ENDERINFUSEDWING.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.ENDERINFUSEDWING.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
