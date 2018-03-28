package com.Frost2779.ElytraCrafting.util.handlers;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

    public static Configuration config;
    public static boolean enablePreEndMode;

    public static void init(File file) {
        config = new Configuration(file);

        try{

            String category;
            config.load();

            category = "Crafting";
            config.addCustomCategoryComment(category, "Crafting Settings");
            enablePreEndMode = config.getBoolean("enablePreEndMode", category, false, "Enable if you wish for the elytra and it's parts to use pre-end components and crafting materials.");

        }
        catch (Exception e){
            LogHandler.logFatal("Exception caught when loading configuration file");
            e.printStackTrace();
        }
        finally{
            if (config.hasChanged())
            {
                config.save();
            }
        }
    }
}
