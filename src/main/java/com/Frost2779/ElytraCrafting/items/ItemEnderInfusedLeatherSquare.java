package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemEnderInfusedLeatherSquare extends Item{

	public ItemEnderInfusedLeatherSquare() {
		setUnlocalizedName(Refrence.FrostModItems.ENDERINFUSEDLEATHERSQUARE.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.ENDERINFUSEDLEATHERSQUARE.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
