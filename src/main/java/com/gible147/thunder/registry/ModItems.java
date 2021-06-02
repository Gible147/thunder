package com.gible147.thunder.registry;

import com.gible147.thunder.Thunder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item LIGHTNING_BOW = new Item(new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Thunder.MOD_ID, "lightning_bow"), LIGHTNING_BOW);
    }




}
