package com.refreshed.luckyblock.block;

import com.refreshed.luckyblock.LuckyMod;
import com.refreshed.luckyblock.init.LuckyDataComponents;
import com.refreshed.luckyblock.item.ItemRegister;
import com.refreshed.luckyblock.item.LuckyBlockItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegister {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LuckyMod.MODID);
	
	public static final DeferredBlock<Block> LUCKYBLOCK = BLOCKS.register("lucky_block", () -> new LuckyBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
	
	public static final DeferredItem<BlockItem> LUCKYBLOCK_ITEM = ItemRegister.ITEMS.register("lucky_block", () -> new LuckyBlockItem(LUCKYBLOCK.get(), new Item.Properties().component(LuckyDataComponents.LUCK.value(), 1)));
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
