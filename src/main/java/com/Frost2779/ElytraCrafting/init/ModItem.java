package com.frost2779.elytracrafting.init;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItem {
    private final Identifier id;
    private final Item item;

    public ModItem(Identifier id, Item item) {
        this.id = id;
        this.item = item;
    }

    public Identifier getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }
}
