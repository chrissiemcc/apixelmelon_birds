package net.apixelmelon.birdsmod.datagen;

import net.apixelmelon.birdsmod.BirdsMod;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, BirdsMod.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
