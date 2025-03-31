package com.ronityon2112.betterwoodendecorationmod.item;

import com.ronityon2112.betterwoodendecorationmod.BetterWoodenDecorationMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(CARPENTER_BOOK);
    }
    public static  void  registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(Moditems::addItemToIG);
        BetterWoodenDecorationMod.LOGGER.info("Registering Items");
    }
}
