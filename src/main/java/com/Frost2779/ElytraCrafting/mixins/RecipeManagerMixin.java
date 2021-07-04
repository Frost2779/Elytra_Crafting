package com.frost2779.elytracrafting.mixins;

import com.frost2779.elytracrafting.ElytraCrafting;
import com.frost2779.elytracrafting.init.ElytraCraftingRecipes;
import com.google.gson.JsonElement;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {
    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        System.out.println("Adding common recipes...");
        map.put(ElytraCraftingRecipes.REINFORCED_STICK.getId(), ElytraCraftingRecipes.REINFORCED_STICK.getJson());
        map.put(ElytraCraftingRecipes.REINFORCED_LEATHER_SQUARE.getId(), ElytraCraftingRecipes.REINFORCED_LEATHER_SQUARE.getJson());
        map.put(ElytraCraftingRecipes.HARDENED_LEATHER.getId(), ElytraCraftingRecipes.HARDENED_LEATHER.getJson());

        if(ElytraCrafting.ecmConfig.isPreEndOrBoth()) {
            System.out.println("Adding pre-end recipes...");
            map.put(ElytraCraftingRecipes.DIAMOND_REINFORCED_STICK.getId(), ElytraCraftingRecipes.DIAMOND_REINFORCED_STICK.getJson());
            map.put(ElytraCraftingRecipes.DIAMOND_REINFORCED_HARD_LEATHER_SQUARE.getId(), ElytraCraftingRecipes.DIAMOND_REINFORCED_HARD_LEATHER_SQUARE.getJson());
            map.put(ElytraCraftingRecipes.DIAMOND_REINFORCED_WING.getId(), ElytraCraftingRecipes.DIAMOND_REINFORCED_WING.getJson());
            map.put(ElytraCraftingRecipes.DIAMOND_HARNESS.getId(), ElytraCraftingRecipes.DIAMOND_HARNESS.getJson());
            map.put(ElytraCraftingRecipes.PRE_END_ELYTRA.getId(), ElytraCraftingRecipes.PRE_END_ELYTRA.getJson());
        }

        if(ElytraCrafting.ecmConfig.isEndOrBoth()) {
            System.out.println("Adding end recipes...");
            map.put(ElytraCraftingRecipes.ENDER_INFUSED_LEATHER.getId(), ElytraCraftingRecipes.ENDER_INFUSED_LEATHER.getJson());
            map.put(ElytraCraftingRecipes.ENDER_INFUSED_LEATHER_SQUARE.getId(), ElytraCraftingRecipes.ENDER_INFUSED_LEATHER_SQUARE.getJson());
            map.put(ElytraCraftingRecipes.ENDER_INFUSED_WING.getId(), ElytraCraftingRecipes.ENDER_INFUSED_WING.getJson());
            map.put(ElytraCraftingRecipes.ENDER_INFUSED_HARNESS.getId(), ElytraCraftingRecipes.ENDER_INFUSED_HARNESS.getJson());
            map.put(ElytraCraftingRecipes.ENDER_PEARL_DUST.getId(), ElytraCraftingRecipes.ENDER_PEARL_DUST.getJson());
            map.put(ElytraCraftingRecipes.END_ELYTRA.getId(), ElytraCraftingRecipes.END_ELYTRA.getJson());
        }
    }

}