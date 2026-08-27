package org.elias.fastmath;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(SuperFastMath.MOD_ID)
public class SuperFastMath {
    public static final String MOD_ID = "superfastmath";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public SuperFastMath(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("SuperFastMath initialized");
    }
}