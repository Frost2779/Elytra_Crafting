package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemDiamondReinforcedWing extends Item{

	public ItemDiamondReinforcedWing() {
		setUnlocalizedName(Refrence.FrostModItems.DIAMONDREINFORCEDWING.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.DIAMONDREINFORCEDWING.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
