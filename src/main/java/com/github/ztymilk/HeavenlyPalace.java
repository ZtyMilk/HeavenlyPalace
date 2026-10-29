package com.github.ztymilk;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.ztymilk.registry.dimension.HeavenlyPalaceDimension;

public class HeavenlyPalace implements ModInitializer {
    public static final String MOD_ID = "heavenlypalace";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello HeavenlyPalace!");
        HeavenlyPalaceDimension.initialize();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
