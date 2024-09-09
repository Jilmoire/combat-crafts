package net.jilmoire.combatcrafts.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CombatCraftsModelProvider extends FabricModelProvider {


    public CombatCraftsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(itemreg.BLADE, Models.GENERATED);
        itemModelGenerator.register(itemreg.HILT, Models.GENERATED);
        itemModelGenerator.register(itemreg.GRIP, Models.GENERATED);
        itemModelGenerator.register(itemreg.GUARD, Models.GENERATED);
        itemModelGenerator.register(itemreg.POMMEL, Models.GENERATED);
    }
}