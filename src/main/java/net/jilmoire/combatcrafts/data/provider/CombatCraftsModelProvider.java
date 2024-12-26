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
        itemModelGenerator.register(itemreg.IRON_BLADE, Models.GENERATED);
        itemModelGenerator.register(itemreg.GOLD_BLADE, Models.GENERATED);
        itemModelGenerator.register(itemreg.DIAMOND_BLADE, Models.GENERATED);

        itemModelGenerator.register(itemreg.HILT, Models.GENERATED);
        itemModelGenerator.register(itemreg.GRIP, Models.GENERATED);
        itemModelGenerator.register(itemreg.GUARD, Models.GENERATED);
        itemModelGenerator.register(itemreg.POMMEL, Models.GENERATED);

        itemModelGenerator.register(itemreg.MOLD, Models.GENERATED);
        itemModelGenerator.register(itemreg.MELT_IRON, Models.GENERATED);
        itemModelGenerator.register(itemreg.MELT_GOLD, Models.GENERATED);
        itemModelGenerator.register(itemreg.MELT_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(itemreg.BUCKET_IRON, Models.GENERATED);
        itemModelGenerator.register(itemreg.BUCKET_GOLD, Models.GENERATED);
        itemModelGenerator.register(itemreg.BUCKET_DIAMOND, Models.GENERATED);

        itemModelGenerator.register(itemreg.B_FRAME, Models.GENERATED);
        itemModelGenerator.register(itemreg.SSTRING, Models.GENERATED);
        itemModelGenerator.register(itemreg.B_STRING, Models.GENERATED);
    }
}