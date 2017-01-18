package com.Frost2779.ElytraCrafting.Proxy;

import com.Frost2779.ElytraCrafting.Init.ModItems;


public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		
		ModItems.registerRenders();
	}
}
