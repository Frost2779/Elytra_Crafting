package com.Frost2779.ElytraCrafting.Items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemReinforcedStick extends Item {

	public ItemReinforcedStick() {
		setUnlocalizedName(Refrence.FrostModItems.REINFORCEDSTICK.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.REINFORCEDSTICK.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
