package com.refreshed.luckyblock.block;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LuckyBlock extends Block{
	private static final Logger LOGGER = LogUtils.getLogger();
	
	public static int luck = 0;

	public LuckyBlock(Properties properties) {
		super(properties);
	}
	
	@Override
    public void destroy(LevelAccessor level, BlockPos pos, BlockState state) {
		LOGGER.debug("Lucky Block Destroyed");
    }
}
