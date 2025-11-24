package com.ptk671.menufpsunlocker.fabric;

import net.fabricmc.api.ModInitializer;

import com.ptk671.menufpsunlocker.MenuFPSUnlocker;

public final class MenuFPSUnlockerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        MenuFPSUnlocker.init();
    }
}
