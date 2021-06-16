//package com.gible147.thunder.mixin;
//
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.LightningEntity;
//import net.minecraft.item.Item;
//import net.minecraft.item.TridentItem;
//import net.minecraft.world.World;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Mixin(TridentItem.class)
//public abstract class TridentItemMixen extends Item {
//    public TridentItemMixen(Settings settings) {
//        super(settings);
//    }
//
//    @Inject(at = @At("INVOKE"), method = "use")
//    private void use(CallbackInfo info) {
//        LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(world);
//        lightning.setPos(this.getX(), this.getY(), this.getZ());
//    }
//}
