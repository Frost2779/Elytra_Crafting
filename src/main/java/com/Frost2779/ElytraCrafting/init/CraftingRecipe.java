package com.frost2779.elytracrafting.init;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

public class CraftingRecipe {
    private final Identifier id;
    private final JsonObject json;

    public CraftingRecipe(Identifier id, JsonObject json) {
        this.id = id;
        this.json = json;
    }

    public Identifier getId() {
        return id;
    }

    public JsonObject getJson() {
        return json;
    }
}
