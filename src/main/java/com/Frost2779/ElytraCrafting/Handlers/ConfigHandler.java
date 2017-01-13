package com.Frost2779.ElytraCrafting.Handlers;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static Configuration config;
	
	//settings
	public static boolean enablePreEndMode;
	public static boolean enableWoodenElytra;
	
	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}
	
	public static void syncConfig(){
		String category;
		config.load();
		
		category = "Crafting";
		config.addCustomCategoryComment(category, "Crafting Settings");
		enablePreEndMode = config.getBoolean("enablePreEndMode", category, false, "Enable if you wish for the elytra and it's parts to use pre-end components and crafting materials.");
		enableWoodenElytra = config.getBoolean("enableWoodenElytraCrafting", category, false, "Enable if you wish to be able to craft the wooden Elytra(Currently unimplemented).");
		
		config.save();
	}
}
