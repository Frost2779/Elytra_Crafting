package com.Frost2779.ElytraCrafting;

import net.minecraft.item.Item;

public class Refrence {
	
	public static final String MOD_ID = "fecm";
	public static final String NAME = "Elytra Crafting Recipe Mod";
	public static final String VERSION = "0.4.2";
	public static final String ACCEPTED_VERSION = "[1.11, 1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.Frost2779.ElytraCrafting.Proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Frost2779.ElytraCrafting.Proxy.ServerProxy";
	
	public static enum FrostModItems{
		REINFORCEDSTICK("reinforcedStick", "ItemReinforcedStick"),
		REINFORCEDLEATHERSQUARE("reinforcedLeatherSquare", "ItemReinforcedLeatherSquare"),
		LEATHERHARNESS("leatherHarness", "ItemLeatherHarness"),
		
		HARDENEDLEATHER("hardenedLeather", "ItemHardenedLeather"),
		DIAMONDREINFORCEDSTICK("diamondReinforcedStick", "ItemDiamondReinforcedStick"),
		DIAMONDREINFORCEDHARDLEATHERSQUARE("diamondReinforcedHardLeatherSquare", "ItemDiamondReinforcedHardLeatherSquare"),
		DIAMONDREINFORCEDWING("diamondReinforcedWing", "ItemDiamondReinforcedWing"),	
		DIAMONDHARNESS("diamondHarness", "ItemDiamondHarness"),
		
		ENDERINFUSEDLEATHER("enderInfusedLeather", "ItemEnderInfusedLeather"),
		ENDERINFUSEDLEATHERSQUARE("enderInfusedLeatherSquare", "ItemEnderInfusedLeatherSquare"),
		ENDERINFUSEDWING("enderInfusedWing", "ItemEnderInfusedWing"),
		ENDERINFUSEDHARNESS("enderInfusedHarness", "ItemEnderInfusedHarness"),
		
		ENDERPEARLDUST("enderPearlDust", "ItemEnderPearlDust");
		
		private String unlocalizedName;
		private String registryName;
		
		FrostModItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
