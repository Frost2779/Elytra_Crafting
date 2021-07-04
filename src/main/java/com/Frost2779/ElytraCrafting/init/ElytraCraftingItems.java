package com.frost2779.elytracrafting.init;

import com.frost2779.elytracrafting.ElytraCrafting;
import com.terraformersmc.modmenu.util.mod.Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ElytraCraftingItems {
    public static ModItem REINFORCED_STICK;
    public static ModItem REINFORCED_LEATHER_SQUARE;
    public static ModItem HARDENED_LEATHER;

    public static ModItem DIAMOND_REINFORCED_STICK;
    public static ModItem DIAMOND_REINFORCED_HARD_LEATHER_SQUARE;
    public static ModItem DIAMOND_REINFORCED_WING;
    public static ModItem DIAMOND_HARNESS;

    public static ModItem ENDER_INFUSED_LEATHER;
    public static ModItem ENDER_INFUSED_LEATHER_SQUARE;
    public static ModItem ENDER_INFUSED_WING;
    public static ModItem ENDER_INFUSED_HARNESS;
    public static ModItem ENDER_PEARL_DUST;

    public static void init() {
        REINFORCED_STICK = register("reinforced_stick");
        REINFORCED_LEATHER_SQUARE = register("reinforced_leather_square");
        HARDENED_LEATHER = register("hardened_leather");

        if(ElytraCrafting.ecmConfig.isPreEndOrBoth()) {
            DIAMOND_REINFORCED_STICK = register("diamond_reinforced_stick");
            DIAMOND_REINFORCED_HARD_LEATHER_SQUARE = register("diamond_reinforced_hard_leather_square");
            DIAMOND_REINFORCED_WING = register("diamond_reinforced_wing");
            DIAMOND_HARNESS  = register("diamond_harness");
        }

        if(ElytraCrafting.ecmConfig.isEndOrBoth()) {
            ENDER_INFUSED_LEATHER = register("ender_infused_leather");
            ENDER_INFUSED_LEATHER_SQUARE = register("ender_infused_leather_square");
            ENDER_INFUSED_WING = register("ender_infused_wing");
            ENDER_INFUSED_HARNESS = register("ender_infused_harness");
            ENDER_PEARL_DUST = register("ender_pearl_dust");
        }
    }

    private static ModItem register(String id) {
        return register(id, Config.SETTINGS);
    }

    private static ModItem register(String id, FabricItemSettings settings) {
        Identifier identifier = new Identifier(ElytraCrafting.MOD_ID, id);
        Item item = new Item(settings);
        Registry.register(Registry.ITEM, identifier, item);
        return new ModItem(identifier, item);
    }

    private static class Config {
        public static final FabricItemSettings SETTINGS = new FabricItemSettings().group(ElytraCrafting.ITEM_GROUP);
    }
}
