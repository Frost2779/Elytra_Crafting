package com.Frost2779.ElytraCrafting;

import java.io.File;

import com.Frost2779.ElytraCrafting.Handlers.ConfigHandler;
import com.Frost2779.ElytraCrafting.Init.ModCrafting;
import com.Frost2779.ElytraCrafting.Init.ModItems;
import com.Frost2779.ElytraCrafting.Proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION, acceptedMinecraftVersions = Refrence.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/Frost2779/Mod-Update-Version/master/Update")
public class MainClass {
	
	@Instance
	public static MainClass instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new ElytraCraftingTab();
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	 
		 ConfigHandler.init(new File(event.getModConfigurationDirectory(), "Elytra Crafting" + ".cfg"));
		
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
	
		proxy.init();
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}