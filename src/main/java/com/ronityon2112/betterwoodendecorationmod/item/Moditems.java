package com.ronityon2112.betterwoodendecorationmod.item;

import com.ronityon2112.betterwoodendecorationmod.BetterWoodenDecorationMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class Moditems {
    public static  final Item CARPENTER_BOOK = registerItems("carpenter_book", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){

//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(BetterWoodenDecorationMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(BetterWoodenDecorationMod.MOD_ID, id), item);
    }
    public static  void  registerModItems(){
        BetterWoodenDecorationMod.LOGGER.info("Registering Items");
    }
}
