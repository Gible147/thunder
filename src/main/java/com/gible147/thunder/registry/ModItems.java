package com.gible147.thunder.registry;

import com.gible147.thunder.Thunder;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.gible147.thunder.registry.ModBlocks.LIGHTNING_STONE;

public class ModItems {

    public static final Item LIGHTNING_BOW = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final BlockItem LIGHTNING_STONE  = new BlockItem(ModBlocks.LIGHTNING_STONE, new Item.Settings().group(ItemGroup.DECORATIONS));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Thunder.MOD_ID, "lightning_bow"), LIGHTNING_BOW);
        Registry.register(Registry.ITEM, new Identifier(Thunder.MOD_ID, "lightning_stone"), LIGHTNING_STONE);
    }




}
