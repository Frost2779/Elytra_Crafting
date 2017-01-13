package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemReinforcedLeatherSquare extends Item {
	
	public ItemReinforcedLeatherSquare(){
		setUnlocalizedName(Refrence.FrostModItems.REINFORCEDLEATHERSQUARE.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.REINFORCEDLEATHERSQUARE.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
