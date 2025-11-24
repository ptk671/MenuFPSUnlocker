package com.ptk671.menufpsunlocker.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Overlay;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Window;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public abstract class MinecraftClientMixin {
    @Shadow
    public ClientWorld world;
    @Shadow
    public Screen  currentScreen;
    @Shadow
    private Overlay overlay;
    @Shadow @Final
    private Window window ;

    @Inject(at = @At("HEAD"),method = "getFramerateLimit", cancellable = true) private void getFramerateLimit(CallbackInfoReturnable<Integer> cir){
        cir.setReturnValue(world != null || currentScreen == null && overlay == null ? window.getFramerateLimit(): 120 );
    }
}
