package com.Frost2779.ElytraCrafting.util.handlers;

import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

import java.util.function.BooleanSupplier;

public class CraftingConfigConditionHandler implements IConditionFactory {
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        return () -> ConfigHandler.enablePreEndMode;
    }
}
