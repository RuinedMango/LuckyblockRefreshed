package com.refreshed.luckyblock.item;

import java.util.List;

import com.refreshed.luckyblock.init.LuckyDataComponents;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

public class LuckyBlockItem extends BlockItem{

	public LuckyBlockItem(Block block, Properties properties) {
		super(block, properties);
	}
	@Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
		tooltipComponents.add(Component.literal("Luck: " + stack.get(LuckyDataComponents.LUCK)));
		stack.set(LuckyDataComponents.LUCK, stack.get(LuckyDataComponents.LUCK) + 5);
    }
	private String calculateLuck() {
		return null;
		
	}
}
