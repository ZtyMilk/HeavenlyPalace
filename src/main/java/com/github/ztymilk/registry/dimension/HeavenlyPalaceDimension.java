package com.github.ztymilk.registry.dimension;

import com.github.ztymilk.HeavenlyPalace;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public class HeavenlyPalaceDimension {
    public static final ResourceKey<Level> HEAVENLY_PALACE = ResourceKey
            .create(Registries.DIMENSION, HeavenlyPalace.id("heavenlypalace"));
    public static void initialize() {
    }
}
