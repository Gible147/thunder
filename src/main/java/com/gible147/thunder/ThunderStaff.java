package com.gible147.thunder;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.damage.EntityDamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

import java.util.List;

public class ThunderStaff extends TridentItem {




    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.thunder.thunder_staff.tooltip"));
    }

    public void attack() {
        //WIP???? use when hit to summon a lightning EntityDamageSource



    }


    public ThunderStaff(Settings settings) {
        super(settings);
    }
}