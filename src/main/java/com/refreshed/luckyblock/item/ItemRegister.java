package com.refreshed.luckyblock.item;

import com.refreshed.luckyblock.LuckyMod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LuckyMod.MODID);
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
