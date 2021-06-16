package com.gible147.thunder.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//TODO fix this block of code, there are no errors but it does not work properly in game
@Mixin(ArrowEntity.class)
public abstract class ArrowEntityMixen extends Entity {
    public ArrowEntityMixen(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("INVOKE"), method = "onEntityHit")
    private void onEntityHit(CallbackInfo info) {
        LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(world);
        lightning.setPos(this.getX(), this.getY(), this.getZ());
    }
}
