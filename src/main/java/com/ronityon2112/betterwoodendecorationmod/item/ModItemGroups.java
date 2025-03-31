package com.ronityon2112.betterwoodendecorationmod.item;

import com.ronityon2112.betterwoodendecorationmod.BetterWoodenDecorationMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> BETTERWOODENDECORATION_GROUP = register("betterwoodendecoration_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(BetterWoodenDecorationMod.MOD_ID, id));
//    }
//    public static void registerModItemGroups() {
//        Registry.register(Registries.ITEM_GROUP,BETTERWOODENDECORATION_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP,7)
//                                .displayName(Text.translatable("itemGroup.betterwoodendecoration_group"))
//                                        .icon(() ->new ItemStack(Moditems.CARPENTER_BOOK))
//                        .entries((displayContext, entries) -> {
//                            entries.add(Moditems.CARPENTER_BOOK);
//                        }).build());
//        BetterWoodenDecorationMod.LOGGER.info("Registering Item Groups");
//    }
    public static final ItemGroup BETTERWOODENDECORATION_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BetterWoodenDecorationMod.MOD_ID,"betterwoodendecoration_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("ItemGroup.betterwoodendecorationmod"))
                .icon(() -> new ItemStack(Moditems.CARPENTER_BOOK))
                .entries((displayContext, entries) -> {
                    entries.add(Moditems.CARPENTER_BOOK);
                }).build());
    public static void registerModItemGroups(){
        BetterWoodenDecorationMod.LOGGER.info("Registering Item Groups");
    }
}
