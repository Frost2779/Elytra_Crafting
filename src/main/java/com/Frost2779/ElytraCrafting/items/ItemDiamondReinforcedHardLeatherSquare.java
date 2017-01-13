package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemDiamondReinforcedHardLeatherSquare extends Item{

	public ItemDiamondReinforcedHardLeatherSquare() {
		setUnlocalizedName(Refrence.FrostModItems.DIAMONDREINFORCEDHARDLEATHERSQUARE.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.DIAMONDREINFORCEDHARDLEATHERSQUARE.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
