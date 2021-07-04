package com.frost2779.elytracrafting.init;

import com.frost2779.elytracrafting.ElytraCrafting;
import com.frost2779.elytracrafting.data.CraftingRecipe;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ElytraCraftingRecipes {
    private static final String TypeItem = "item";

    public static CraftingRecipe REINFORCED_STICK;
    public static CraftingRecipe REINFORCED_LEATHER_SQUARE;
    public static CraftingRecipe HARDENED_LEATHER;

    public static CraftingRecipe DIAMOND_REINFORCED_STICK;
    public static CraftingRecipe DIAMOND_REINFORCED_HARD_LEATHER_SQUARE;
    public static CraftingRecipe DIAMOND_REINFORCED_WING;
    public static CraftingRecipe DIAMOND_HARNESS;
    public static CraftingRecipe PRE_END_ELYTRA;

    public static CraftingRecipe ENDER_INFUSED_LEATHER;
    public static CraftingRecipe ENDER_INFUSED_LEATHER_SQUARE;
    public static CraftingRecipe ENDER_INFUSED_WING;
    public static CraftingRecipe ENDER_INFUSED_HARNESS;
    public static CraftingRecipe ENDER_PEARL_DUST;
    public static CraftingRecipe END_ELYTRA;

    public static void init() {
        if(ElytraCrafting.ecmConfig.isPreEndOrBoth()) {
            initPreEndRecipes();
        }
        if(ElytraCrafting.ecmConfig.isEndOrBoth()) {
            initEndRecipes();
        }

        System.out.println("Building common recipes...");
        REINFORCED_STICK = createShapedRecipe(
                "reinforced_stick",
                Lists.newArrayList(
                        'I',
                        'S'
                ),
                Lists.newArrayList(
                        VanillaItems.IRON_INGOT,
                        VanillaItems.STICK
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        " I ",
                        "ISI",
                        " I "
                ),
                ElytraCraftingItems.REINFORCED_STICK.getId()
        );

        REINFORCED_LEATHER_SQUARE = createShapedRecipe(
                "reinforced_leather_square",
                Lists.newArrayList(
                    'I',
                        'S',
                        'L'
                ),
                Lists.newArrayList(
                        VanillaItems.IRON_INGOT,
                        ElytraCraftingItems.REINFORCED_STICK.getId(),
                        ElytraCraftingItems.HARDENED_LEATHER.getId()
                ),
                Lists.newArrayList(
                    TypeItem,
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "ISI",
                        "SLS",
                        "ISI"
                ),
                ElytraCraftingItems.REINFORCED_LEATHER_SQUARE.getId()
        );

        HARDENED_LEATHER = createSmeltingRecipe(
                "hardened_leather",
                VanillaItems.LEATHER,
                TypeItem,
                ElytraCraftingItems.HARDENED_LEATHER.getId()
        );
    }

    private static void initPreEndRecipes() {
        System.out.println("Building pre-end recipes...");
        DIAMOND_REINFORCED_STICK = createShapedRecipe(
                "diamond_reinforced_stick",
                Lists.newArrayList(
                    'D',
                        'S'
                ),
                Lists.newArrayList(
                        VanillaItems.DIAMOND,
                        ElytraCraftingItems.REINFORCED_STICK.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        " D ",
                        "DSD",
                        " D "
                ),
                ElytraCraftingItems.DIAMOND_REINFORCED_STICK.getId(),
                2
        );

        DIAMOND_REINFORCED_HARD_LEATHER_SQUARE = createShapedRecipe(
                "diamond_reinforced_hard_leather_square",
                Lists.newArrayList(
                        'D',
                        'S',
                        'H'
                ),
                Lists.newArrayList(
                        VanillaItems.DIAMOND,
                        ElytraCraftingItems.DIAMOND_REINFORCED_STICK.getId(),
                        ElytraCraftingItems.REINFORCED_LEATHER_SQUARE.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "DSD",
                        "SHS",
                        "DSD"
                ),
                ElytraCraftingItems.DIAMOND_REINFORCED_HARD_LEATHER_SQUARE.getId(),
                2
        );

        DIAMOND_REINFORCED_WING = createShapedRecipe(
                "diamond_reinforced_wing",
                Lists.newArrayList(
                        'S',
                        'Q'
                ),
                Lists.newArrayList(
                        ElytraCraftingItems.DIAMOND_REINFORCED_STICK.getId(),
                        ElytraCraftingItems.DIAMOND_REINFORCED_HARD_LEATHER_SQUARE.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "  S",
                        " SQ",
                        "SQQ"
                ),
                ElytraCraftingItems.DIAMOND_REINFORCED_WING.getId()
        );

        DIAMOND_HARNESS = createShapedRecipe(
                "diamond_harness",
                Lists.newArrayList(
                        'L',
                        'S'
                ),
                Lists.newArrayList(
                        ElytraCraftingItems.DIAMOND_REINFORCED_HARD_LEATHER_SQUARE.getId(),
                        ElytraCraftingItems.DIAMOND_REINFORCED_STICK.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "SLS",
                        "L L",
                        "SLS"
                ),
                ElytraCraftingItems.DIAMOND_HARNESS.getId()
        );

        PRE_END_ELYTRA = createShapedRecipe(
                "pre_end_elytra",
                Lists.newArrayList(
                        'E',
                        'S',
                        'H',
                        'W'
                ),
                Lists.newArrayList(
                        VanillaItems.EMERALD_BLOCK,
                        ElytraCraftingItems.DIAMOND_REINFORCED_STICK.getId(),
                        ElytraCraftingItems.DIAMOND_HARNESS.getId(),
                        ElytraCraftingItems.DIAMOND_REINFORCED_WING.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem,
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        " E ",
                        "SHS",
                        "W W"
                ),
                new Identifier("elytra")
        );
    }

    private static void initEndRecipes() {
        System.out.println("Building end recipes...");
        ENDER_INFUSED_LEATHER = createShapelessRecipe(
                "ender_infused_leather",
                Lists.newArrayList(
                        ElytraCraftingItems.HARDENED_LEATHER.getId(),
                        ElytraCraftingItems.ENDER_PEARL_DUST.getId(),
                        VanillaItems.CHORUS_FRUIT
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem,
                        TypeItem
                ),
                ElytraCraftingItems.ENDER_INFUSED_LEATHER.getId()
        );

        ENDER_INFUSED_LEATHER_SQUARE = createShapedRecipe(
                "ender_infused_leather_square",
                Lists.newArrayList(
                        'I',
                        'S',
                        'L'
                ),
                Lists.newArrayList(
                        VanillaItems.IRON_INGOT,
                        VanillaItems.END_ROD,
                        ElytraCraftingItems.ENDER_INFUSED_LEATHER.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "ISI",
                        "SLS",
                        "ISI"
                ),
                ElytraCraftingItems.ENDER_INFUSED_LEATHER_SQUARE.getId(),
                3
        );

        ENDER_INFUSED_WING = createShapedRecipe(
                "ender_infused_wing",
                Lists.newArrayList(
                        'S',
                        'L'
                ),
                Lists.newArrayList(
                        VanillaItems.END_ROD,
                        ElytraCraftingItems.ENDER_INFUSED_LEATHER_SQUARE.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "  S",
                        " SL",
                        "SLL"
                ),
                ElytraCraftingItems.ENDER_INFUSED_WING.getId()
        );

        ENDER_INFUSED_HARNESS = createShapedRecipe(
                "ender_infused_harness",
                Lists.newArrayList(
                        'S',
                        'L'
                ),
                Lists.newArrayList(
                        VanillaItems.END_ROD,
                        ElytraCraftingItems.ENDER_INFUSED_LEATHER.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        "SLS",
                        "L L",
                        "SLS"
                ),
                ElytraCraftingItems.ENDER_INFUSED_HARNESS.getId()
        );

        ENDER_PEARL_DUST = createShapelessRecipe(
                "ender_pearl_dust",
                Lists.newArrayList(
                        VanillaItems.ENDER_PEARL
                ),
                Lists.newArrayList(
                        TypeItem
                ),
                ElytraCraftingItems.ENDER_PEARL_DUST.getId(),
                4
        );

        END_ELYTRA = createShapedRecipe(
                "end_elytra",
                Lists.newArrayList(
                        'P',
                        'S',
                        'H',
                        'W'
                ),
                Lists.newArrayList(
                        VanillaItems.PURPUR_BLOCK,
                        VanillaItems.END_ROD,
                        ElytraCraftingItems.ENDER_INFUSED_HARNESS.getId(),
                        ElytraCraftingItems.ENDER_INFUSED_WING.getId()
                ),
                Lists.newArrayList(
                        TypeItem,
                        TypeItem,
                        TypeItem,
                        TypeItem
                ),
                Lists.newArrayList(
                        " P ",
                        "SHS",
                        "W W"
                ),
                VanillaItems.ELYTRA

        );
    }

    private static CraftingRecipe createShapedRecipe(String name, ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output) {
        return createShapedRecipe(name, keys, items, type, pattern, output, 1);
    }
    private static CraftingRecipe createShapedRecipe(String name, ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int count) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray jsonArray = new JsonArray();
        jsonArray.add(pattern.get(0));
        jsonArray.add(pattern.get(1));
        jsonArray.add(pattern.get(2));
        json.add("pattern", jsonArray);

        JsonObject individualKey;
        JsonObject keyList = new JsonObject();

        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString());
            keyList.add(keys.get(i) + "", individualKey);
        }

        json.add("key", keyList);

        //Finally, we define our result object
        JsonObject result = new JsonObject();
        result.addProperty(TypeItem, output.toString());
        result.addProperty("count", count);
        json.add("result", result);

        return new CraftingRecipe(new Identifier(ElytraCrafting.MOD_ID, name), json);
    }

    private static CraftingRecipe createSmeltingRecipe(String name, Identifier ingredient, String type, Identifier output) {
        return createSmeltingRecipe(name, ingredient, type, output, 0.15f, 200);
    }
    private static CraftingRecipe createSmeltingRecipe(String name, Identifier ingredient, String type, Identifier output, float experience, int cookingTime) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smelting");

        JsonObject ingredientJson = new JsonObject();
        ingredientJson.addProperty(type, ingredient.toString());

        json.add("ingredient", ingredientJson);
        json.addProperty("result", output.toString());
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new CraftingRecipe(new Identifier(ElytraCrafting.MOD_ID, name), json);
    }

    private static CraftingRecipe createShapelessRecipe(String name, ArrayList<Identifier> ingredient, ArrayList<String> type, Identifier output) {
        return createShapelessRecipe(name, ingredient, type, output, 1);
    }
    private static CraftingRecipe createShapelessRecipe(String name, ArrayList<Identifier> ingredient, ArrayList<String> type, Identifier output, int count) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:crafting_shapeless");

        JsonArray ingredientsArray = new JsonArray();
        JsonObject ingredientObject;
        for (int i = 0; i < ingredient.size(); i++) {
            ingredientObject = new JsonObject();
            ingredientObject.addProperty(type.get(i), ingredient.get(i).toString());
            ingredientsArray.add(ingredientObject);
        }
        json.add("ingredients", ingredientsArray);

        JsonObject result = new JsonObject();
        result.addProperty(TypeItem, output.toString());
        result.addProperty("count", count);
        json.add("result", result);

        return new CraftingRecipe(new Identifier(ElytraCrafting.MOD_ID, name), json);
    }

    private static class VanillaItems {
        public static final Identifier STICK = new Identifier("stick");
        public static final Identifier IRON_INGOT = new Identifier("iron_ingot");
        public static final Identifier DIAMOND = new Identifier("diamond");
        public static final Identifier LEATHER = new Identifier("leather");
        public static final Identifier END_ROD = new Identifier("end_rod");
        public static final Identifier ELYTRA = new Identifier("elytra");
        public static final Identifier EMERALD_BLOCK = new Identifier("emerald_block");
        public static final Identifier CHORUS_FRUIT = new Identifier("chorus_fruit");
        public static final Identifier PURPUR_BLOCK = new Identifier("purpur_block");
        public static final Identifier ENDER_PEARL = new Identifier("ender_pearl");
    }
}