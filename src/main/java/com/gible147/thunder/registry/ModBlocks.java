package com.gible147.thunder.registry;

import com.gible147.thunder.Thunder;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block LIGHTNING_STONE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f,6000.0f)
            .sounds(BlockSoundGroup.ANCIENT_DEBRIS)
            .luminance(3));

    public static void registerBlocks () {
        Registry.register(Registry.BLOCK, new Identifier(Thunder.MOD_ID, "lightning_stone"), LIGHTNING_STONE);
    }
}
