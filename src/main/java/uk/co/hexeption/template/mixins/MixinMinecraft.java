package uk.co.hexeption.template.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * MixinMinecraft
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 06/03/2020 - 05:44 pm
 */
@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(method = "runTick", at = @At("HEAD"))
    private void runTick(CallbackInfo ci) {
        System.out.println("Working");
    }

}
