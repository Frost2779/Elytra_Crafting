package com.Frost2779.ElytraCrafting.init;

import com.Frost2779.ElytraCrafting.items.ItemBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item REINFORCED_STICK = new ItemBase("reinforced_stick");
    public static final Item REINFORCED_LEATHER_SQUARE = new ItemBase("reinforced_leather_square");
    public static final Item REINFORCED_LEATHER_WING = new ItemBase("reinforced_leather_wing");
    public static final Item LEATHER_HARNESS = new ItemBase("leather_harness");

    public static final Item WOODEN_ELYTRA = new ItemBase("wooden_elytra");

    public static final Item HARDENED_LEATHER = new ItemBase("hardened_leather");
    public static final Item DIAMOND_REINFORCED_STICK = new ItemBase("diamond_reinforced_stick");
    public static final Item DIAMOND_REINFORCED_HARD_LEATHER_SQUARE = new ItemBase("diamond_reinforced_hard_leather_square");
    public static final Item DIAMOND_REINFORCED_WING = new ItemBase("diamond_reinforced_wing");
    public static final Item DIAMOND_HARNESS = new ItemBase("diamond_harness");

    public static final Item DIAMOND_ELYTRA = new ItemBase("diamond_elytra");

    public static final Item ENDER_INFUSED_LEATHER = new ItemBase("ender_infused_leather");
    public static final Item ENDER_INFUSED_LEATHER_SQUARE = new ItemBase("ender_infused_leather_square");
    public static final Item ENDER_INFUSED_WING = new ItemBase("ender_infused_wing");
    public static final Item ENDER_INFUSED_HARNESS = new ItemBase("ender_infused_harness");
    public static final Item ENDER_PEARL_DUST = new ItemBase("ender_pearl_dust");

    public static void initNonJsonCrafting(){
        GameRegistry.addSmelting(Items.LEATHER, new ItemStack(ModItems.HARDENED_LEATHER), 2.0F);
    }
}
