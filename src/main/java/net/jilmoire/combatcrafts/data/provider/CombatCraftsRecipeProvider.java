package net.jilmoire.combatcrafts.data.provider;

import static net.jilmoire.combatcrafts.registry.itemreg.BUCKET_DIAMOND;
import static net.jilmoire.combatcrafts.registry.itemreg.BUCKET_GOLD;
import static net.jilmoire.combatcrafts.registry.itemreg.BUCKET_IRON;
import static net.jilmoire.combatcrafts.registry.itemreg.B_FRAME;
import static net.jilmoire.combatcrafts.registry.itemreg.B_STRING;
import static net.jilmoire.combatcrafts.registry.itemreg.DIAMOND_BLADE;
import static net.jilmoire.combatcrafts.registry.itemreg.GOLD_BLADE;
import static net.jilmoire.combatcrafts.registry.itemreg.IRON_BLADE;
import static net.jilmoire.combatcrafts.registry.itemreg.MELT_DIAMOND;
import static net.jilmoire.combatcrafts.registry.itemreg.MELT_GOLD;
import static net.jilmoire.combatcrafts.registry.itemreg.MELT_IRON;
import static net.jilmoire.combatcrafts.registry.itemreg.MOLD;
import static net.jilmoire.combatcrafts.registry.itemreg.M_FRAME;
import static net.jilmoire.combatcrafts.registry.itemreg.SSTRING;
import static net.jilmoire.combatcrafts.registry.itemreg.STIRRUP;
import static net.jilmoire.combatcrafts.registry.itemreg.W_BASE;

import java.util.List;
import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

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
                .pattern("SSS")
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUCKET_GOLD)
                .input('I', Items.GOLD_INGOT).input('B', Items.BUCKET)
                .pattern("I")
                .pattern("B")
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUCKET_DIAMOND)
                .input('D', Items.DIAMOND).input('B', Items.BUCKET)
                .pattern("D")
                .pattern("B")
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, GOLD_BLADE)
                .input('G', MELT_GOLD).input('M', MOLD)
                .pattern("GM")
                .criterion(FabricRecipeProvider.hasItem(itemreg.MELT_GOLD),conditionsFromItem(MELT_GOLD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DIAMOND_BLADE)
                .input('D', MELT_DIAMOND).input('M', MOLD)
                .pattern("DM")
                .criterion(FabricRecipeProvider.hasItem(itemreg.MELT_DIAMOND),conditionsFromItem(MELT_DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, IRON_BLADE)
                .input('I', IRON_BLADE).input('M', MOLD)
                .pattern("IM")
                .criterion(FabricRecipeProvider.hasItem(itemreg.MELT_DIAMOND),conditionsFromItem(MELT_IRON))
                .offerTo(exporter);

        List<ItemConvertible> NOIDEA = List.of(BUCKET_IRON);
        List<ItemConvertible> HOWTO = List.of(BUCKET_GOLD);
        List<ItemConvertible> SEPARATETHESE = List.of(BUCKET_DIAMOND);

        RecipeProvider.offerBlasting(exporter,
                NOIDEA,
                RecipeCategory.MISC,
                MELT_IRON,
                0.2f,
                100,
                "cc");

        RecipeProvider.offerBlasting(exporter,
                HOWTO,
                RecipeCategory.MISC,
                MELT_GOLD,
                0.2f,
                80,
                "cc");

        RecipeProvider.offerBlasting(exporter,
                SEPARATETHESE,
                RecipeCategory.MISC,
                MELT_DIAMOND,
                0.2f,
                250,
                "cc");

        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, B_FRAME)
                .input('S', Items.STICK).input('L', Items.LEATHER)
                .pattern(" S ")
                .pattern(" SL")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, SSTRING, 2)
                .input('S', Items.STRING)
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, B_STRING)
                .input('S', itemreg.SSTRING)
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(itemreg.SSTRING), conditionsFromItem(itemreg.SSTRING))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.BOW)
                .input('S', B_STRING).input('F', B_FRAME)
                .pattern("SF")
                .criterion(FabricRecipeProvider.hasItem(itemreg.B_STRING), conditionsFromItem(itemreg.B_STRING))
                .criterion(FabricRecipeProvider.hasItem(itemreg.B_FRAME), conditionsFromItem(itemreg.B_FRAME))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, STIRRUP)
                .input('I', Items.IRON_INGOT).input('i', Items.IRON_NUGGET)
                .pattern(" i ")
                .pattern("I i")
                .pattern(" i ")
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_NUGGET),conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, W_BASE)
                .input('S', Items.STICK).input('T', Items.TRIPWIRE_HOOK)
                .pattern("SSS")
                .pattern(" SS")
                .pattern(" TS")
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(Items.TRIPWIRE_HOOK),conditionsFromItem(Items.TRIPWIRE_HOOK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, M_FRAME)
                .input('I', Items.IRON_INGOT).input('i', Items.IRON_NUGGET)
                .pattern("iii")
                .pattern("iII")
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_NUGGET),conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CROSSBOW)
                .input('B', Items.BOW).input('M', M_FRAME).input('S', STIRRUP).input('W', W_BASE)
                .pattern("B  ")
                .pattern("SMW")
                .criterion(FabricRecipeProvider.hasItem(Items.BOW), conditionsFromItem(Items.BOW))
                .criterion(FabricRecipeProvider.hasItem(itemreg.M_FRAME), conditionsFromItem(itemreg.M_FRAME))
                .criterion(FabricRecipeProvider.hasItem(itemreg.W_BASE), conditionsFromItem(itemreg.W_BASE))
                .criterion(FabricRecipeProvider.hasItem(itemreg.STIRRUP), conditionsFromItem(itemreg.STIRRUP))
                .offerTo(exporter);
        

    }
}
