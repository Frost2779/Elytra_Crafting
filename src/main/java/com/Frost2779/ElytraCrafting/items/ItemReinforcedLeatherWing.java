package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemReinforcedLeatherWing extends Item {
	
	public ItemReinforcedLeatherWing() {
		setUnlocalizedName(Refrence.FrostModItems.REINFORCEDLEATHERWING.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.REINFORCEDLEATHERWING.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
