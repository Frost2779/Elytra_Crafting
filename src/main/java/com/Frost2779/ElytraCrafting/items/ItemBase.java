package com.Frost2779.ElytraCrafting.items;

import com.Frost2779.ElytraCrafting.Main;
import com.Frost2779.ElytraCrafting.init.ModItems;
import com.Frost2779.ElytraCrafting.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.CREATIVE_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
