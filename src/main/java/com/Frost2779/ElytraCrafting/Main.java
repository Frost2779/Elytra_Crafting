package com.Frost2779.ElytraCrafting;

import com.Frost2779.ElytraCrafting.init.ModItems;
import com.Frost2779.ElytraCrafting.proxy.CommonProxy;
import com.Frost2779.ElytraCrafting.util.ElytraCraftingTab;
import com.Frost2779.ElytraCrafting.util.Reference;
import com.Frost2779.ElytraCrafting.util.handlers.ConfigHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/Frost2779/Elytra_Crafting/master/Update.json")
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLINET_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final CreativeTabs CREATIVE_TAB = new ElytraCraftingTab();

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        ConfigHandler.init(new File(event.getModConfigurationDirectory() + "/Frost2779/", "Elytra Crafting.cfg"));
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){ }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){ ModItems.initNonJsonCrafting(); }
}
