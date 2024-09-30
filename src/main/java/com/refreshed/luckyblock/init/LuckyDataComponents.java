package com.refreshed.luckyblock.init;

import java.util.function.UnaryOperator;

import javax.annotation.Nonnull;

import com.refreshed.luckyblock.LuckyMod;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LuckyDataComponents {
    public static final DeferredRegister.DataComponents REGISTER = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, LuckyMod.MODID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> LUCK = REGISTER.registerComponentType("luck", data -> data.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.VAR_INT));
}
