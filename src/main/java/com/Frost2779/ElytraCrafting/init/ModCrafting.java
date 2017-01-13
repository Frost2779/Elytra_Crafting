package com.Frost2779.ElytraCrafting.init;

import com.Frost2779.ElytraCrafting.Handlers.ConfigHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		//Enables/disables the crafting of the Wooden Elytra. [Config Default: False]
		if(ConfigHandler.enableWoodenElytra){
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodenElytra), " D ", "SHS", "W W", 
				'D', Blocks.DIAMOND_BLOCK, 'S', ModItems.reinforcedStick, 'W', ModItems.reinforcedLeatherWing, 'H', ModItems.leatherHarness);
		}
		
		if(ConfigHandler.enableWoodenElytra || ConfigHandler.enablePreEndMode){
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforcedStick, 4), " I ", "ISI", " I ", 'I', Items.IRON_INGOT, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforcedLeatherSquare, 3), "ISI", "SLS", "ISI", 'I', Items.IRON_INGOT, 'S', ModItems.reinforcedStick, 'L', Items.LEATHER);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.reinforcedLeatherWing), "  S", " SQ", "SQQ", 'S', ModItems.reinforcedStick, 'Q', ModItems.reinforcedLeatherSquare);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.leatherHarness), "SLS", "L L", "SLS", 'S', ModItems.reinforcedStick, 'L', Items.LEATHER);
		} 
		
		
		//Enables/disables pre-end crafting recipes based on config. [Config default: False]
		if(!ConfigHandler.enablePreEndMode){
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.enderInfusedLeatherSquare, 3), "ISI", "SLS", "ISI", 'I', Items.IRON_INGOT, 'S', Blocks.END_ROD, 'L', ModItems.enderInfusedLeather);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.enderInfusedWing), "  S", " SL", "SLL", 'S', Blocks.END_ROD, 'L', ModItems.enderInfusedLeatherSquare);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.enderInfusedHarness), "SLS", "L L", "SLS", 'S', Blocks.END_ROD, 'L', ModItems.enderInfusedLeather);
			GameRegistry.addShapedRecipe(new ItemStack(Items.ELYTRA), "   ", "SHS", "W W", 'S', Blocks.END_ROD, 'H', ModItems.enderInfusedHarness,
					'W', ModItems.enderInfusedWing);
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderInfusedLeather), new Object[]{ModItems.hardenedLeather, Items.CHORUS_FRUIT_POPPED, ModItems.enderPearlDust});
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderPearlDust, 4), new Object[]{Items.ENDER_PEARL});
		}else{
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondReinforcedStick, 4), " D ", "DSD", " D ", 'D', Items.DIAMOND, 'S', ModItems.reinforcedStick);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondReinforcedHardLeatherSquare, 3), "DSD", "SHS", "DSD", 'D', Items.DIAMOND, 'S', ModItems.diamondReinforcedStick, 'H', ModItems.hardenedLeather);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondReinforcedWing), "  S", " SQ", "SQQ", 'S', ModItems.diamondReinforcedStick, 'Q', ModItems.diamondReinforcedHardLeatherSquare);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondHarness), "SLS", "L L", "SLS", 'S', ModItems.diamondReinforcedStick, 'L', ModItems.hardenedLeather);
			GameRegistry.addShapedRecipe(new ItemStack(Items.ELYTRA), " E ", "SHS", "W W", 'E', 
					Blocks.EMERALD_BLOCK, 'S', ModItems.diamondReinforcedStick, 'H', ModItems.diamondHarness, 'W', ModItems.diamondReinforcedWing);
			GameRegistry.addSmelting(Items.LEATHER, new ItemStack(ModItems.hardenedLeather), 2.0F);
		}
	}
}