package com.Frost2779.ElytraCrafting.Items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemDiamondReinforcedStick extends Item{

	public ItemDiamondReinforcedStick() {
		setUnlocalizedName(Refrence.FrostModItems.DIAMONDREINFORCEDSTICK.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.DIAMONDREINFORCEDSTICK.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
