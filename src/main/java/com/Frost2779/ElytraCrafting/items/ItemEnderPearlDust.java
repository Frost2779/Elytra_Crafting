package com.Frost2779.ElytraCrafting.Items;

import com.Frost2779.ElytraCrafting.MainClass;
import com.Frost2779.ElytraCrafting.Refrence;

import net.minecraft.item.Item;

public class ItemEnderPearlDust extends Item{

	public ItemEnderPearlDust(){
		setUnlocalizedName(Refrence.FrostModItems.ENDERPEARLDUST.getUnlocalizedName());
		setRegistryName(Refrence.FrostModItems.ENDERPEARLDUST.getRegistryName());
		this.setCreativeTab(MainClass.CREATIVE_TAB);
	}
}
