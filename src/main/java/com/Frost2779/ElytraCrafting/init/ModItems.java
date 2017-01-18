package com.Frost2779.ElytraCrafting.Init;

import com.Frost2779.ElytraCrafting.Items.ItemDiamondHarness;
import com.Frost2779.ElytraCrafting.Items.ItemDiamondReinforcedHardLeatherSquare;
import com.Frost2779.ElytraCrafting.Items.ItemDiamondReinforcedStick;
import com.Frost2779.ElytraCrafting.Items.ItemDiamondReinforcedWing;
import com.Frost2779.ElytraCrafting.Items.ItemEnderInfusedHarness;
import com.Frost2779.ElytraCrafting.Items.ItemEnderInfusedLeather;
import com.Frost2779.ElytraCrafting.Items.ItemEnderInfusedLeatherSquare;
import com.Frost2779.ElytraCrafting.Items.ItemEnderInfusedWing;
import com.Frost2779.ElytraCrafting.Items.ItemEnderPearlDust;
import com.Frost2779.ElytraCrafting.Items.ItemHardenedLeather;
import com.Frost2779.ElytraCrafting.Items.ItemLeatherHarness;
import com.Frost2779.ElytraCrafting.Items.ItemReinforcedLeatherSquare;
import com.Frost2779.ElytraCrafting.Items.ItemReinforcedStick;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item reinforcedStick;
	public static Item reinforcedLeatherSquare;
	public static Item leatherHarness;
	
	public static Item hardenedLeather;
	public static Item diamondReinforcedStick;
	public static Item diamondReinforcedHardLeatherSquare;
	public static Item diamondReinforcedWing;
	public static Item diamondHarness;
	
	public static Item enderInfusedLeather;
	public static Item enderInfusedLeatherSquare;
	public static Item enderInfusedWing;
	public static Item enderInfusedHarness;
	
	public static Item enderPearlDust;
	public static void init(){
		reinforcedStick = new ItemReinforcedStick();
		reinforcedLeatherSquare = new ItemReinforcedLeatherSquare();
		leatherHarness = new ItemLeatherHarness();
		
		hardenedLeather = new ItemHardenedLeather();
		diamondReinforcedStick = new ItemDiamondReinforcedStick();
		diamondReinforcedHardLeatherSquare = new ItemDiamondReinforcedHardLeatherSquare();
		diamondReinforcedWing = new ItemDiamondReinforcedWing();
		diamondHarness = new ItemDiamondHarness();
		
		enderInfusedLeather = new ItemEnderInfusedLeather();
		enderInfusedLeatherSquare = new ItemEnderInfusedLeatherSquare();
		enderInfusedWing = new ItemEnderInfusedWing();
		enderInfusedHarness = new ItemEnderInfusedHarness();
		
		enderPearlDust = new ItemEnderPearlDust();
	}
	
	public static void register(){
		
		GameRegistry.register(reinforcedStick);
		GameRegistry.register(reinforcedLeatherSquare);
		GameRegistry.register(leatherHarness);
		
		GameRegistry.register(hardenedLeather);
		GameRegistry.register(diamondReinforcedStick);
		GameRegistry.register(diamondReinforcedHardLeatherSquare);
		GameRegistry.register(diamondReinforcedWing);
		GameRegistry.register(diamondHarness);
		
		GameRegistry.register(enderInfusedLeather);
		GameRegistry.register(enderInfusedLeatherSquare);
		GameRegistry.register(enderInfusedWing);
		GameRegistry.register(enderInfusedHarness);
		
		GameRegistry.register(enderPearlDust);
	}
	
	public static void registerRenders(){
		
		registerRender(reinforcedStick);
		registerRender(reinforcedLeatherSquare);
		registerRender(leatherHarness);
		
		registerRender(hardenedLeather);
		registerRender(diamondReinforcedStick);
		registerRender(diamondReinforcedHardLeatherSquare);
		registerRender(diamondReinforcedWing);
		registerRender(diamondHarness);
		
		registerRender(enderInfusedLeather);
		registerRender(enderInfusedLeatherSquare);
		registerRender(enderInfusedWing);
		registerRender(enderInfusedHarness);
		
		registerRender(enderPearlDust);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}