package com.Frost2779.ElytraCrafting.Items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemEnderInfusedLeather extends Item{

	public ItemEnderInfusedLeather() {
		setUnlocalizedName(Refrence.FrostModItems.ENDERINFUSEDLEATHER.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.ENDERINFUSEDLEATHER.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
