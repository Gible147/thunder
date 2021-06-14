package com.gible147.thunder.mixin;

import com.gible147.thunder.ThunderStaff;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(A)
public class ThunderStaffMixin {
    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {

    }
}
