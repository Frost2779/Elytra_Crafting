package com.frost2779.elytracrafting;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = ElytraCrafting.MOD_ID)
public class ElytraCraftingConfig implements ConfigData {
    public enum Flags { PreEnd, End, Both }

    @ConfigEntry.Category("Crafting Settings")
    @ConfigEntry.Gui.Tooltip(count = 6)
    public Flags craftingMode = Flags.End;

    public boolean isPreEndOrBoth() {
        return craftingMode == Flags.PreEnd || craftingMode == Flags.Both;
    }

    public boolean isEndOrBoth() {
        return craftingMode == Flags.End || craftingMode == Flags.Both;
    }
}
