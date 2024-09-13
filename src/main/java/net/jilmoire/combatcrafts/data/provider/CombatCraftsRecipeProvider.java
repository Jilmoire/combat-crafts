package net.jilmoire.combatcrafts.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

import static net.jilmoire.combatcrafts.registry.itemreg.*;

public class CombatCraftsRecipeProvider extends FabricRecipeProvider {

    public CombatCraftsRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.IRON_SWORD)
                .input('H', itemreg.HILT).input('B', IRON_BLADE)
                .pattern("   ")
                .pattern(" B ")
                .pattern("H  ")
                .criterion(FabricRecipeProvider.hasItem(itemreg.HILT), conditionsFromItem(itemreg.HILT))
                .criterion(FabricRecipeProvider.hasItem(IRON_BLADE), conditionsFromItem(IRON_BLADE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.GOLDEN_SWORD)
                .input('H', itemreg.HILT).input('B', itemreg.GOLD_BLADE)
                .pattern("   ")
                .pattern(" B ")
                .pattern("H  ")
                .criterion(FabricRecipeProvider.hasItem(itemreg.HILT), conditionsFromItem(itemreg.HILT))
                .criterion(FabricRecipeProvider.hasItem(GOLD_BLADE), conditionsFromItem(GOLD_BLADE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.DIAMOND_SWORD)
                .input('H', itemreg.HILT).input('B', itemreg.DIAMOND_BLADE)
                .pattern("   ")
                .pattern(" B ")
                .pattern("H  ")
                .criterion(FabricRecipeProvider.hasItem(itemreg.HILT), conditionsFromItem(itemreg.HILT))
                .criterion(FabricRecipeProvider.hasItem(itemreg.DIAMOND_BLADE), conditionsFromItem(itemreg.DIAMOND_BLADE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemreg.HILT)
                        .input('G', itemreg.GUARD).input('I', itemreg.GRIP).input('P', itemreg.POMMEL)
                        .pattern("GIP")
                        .criterion(FabricRecipeProvider.hasItem(itemreg.GUARD), conditionsFromItem(itemreg.GUARD))
                        .criterion(FabricRecipeProvider.hasItem(itemreg.GRIP), conditionsFromItem(itemreg.GRIP))
                        .criterion(FabricRecipeProvider.hasItem(itemreg.POMMEL), conditionsFromItem(itemreg.POMMEL))
                        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemreg.GRIP)
                .input('S', Items.STICK).input('L', Items.LEATHER)
                .pattern("SL")
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, itemreg.MOLD)
                .input('S', Items.SAND).input('I', MELT_IRON)
                .pattern(" I ")
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(Items.SAND), conditionsFromItem(Items.SAND))
                .criterion(FabricRecipeProvider.hasItem(MOLD), conditionsFromItem(MOLD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUCKET_IRON)
                .input('I', Items.IRON_INGOT).input('B', Items.BUCKET)
                .pattern("I")
                .pattern("B")
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET))
                .offerTo(exporter);

        List<ItemConvertible> PRECRAFT = List.of(Items.IRON_INGOT);

        RecipeProvider.offerBlasting(exporter,
                PRECRAFT,
                RecipeCategory.MISC,
                MELT_IRON,
                0.2f,
                100,
                "cc");
    }
}
