package net.jilmoire.combatcrafts.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class CombatCraftsRecipeProvider extends FabricRecipeProvider {
    public CombatCraftsRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.WOODEN_SWORD)
                .input(itemreg.HILT, '1')
                .input(itemreg.BLADE, '1')
                .criterion(hasItem(itemreg.HILT, itemreg.BLADE), conditionsFromItem(Items.WOODEN_SWORD))
                .offerTo(exporter);
    }

    private String hasItem(Item hilt, Item blade) {
        return "";
    };
}