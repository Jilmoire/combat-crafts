package net.jilmoire.combatcrafts.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.jilmoire.combatcrafts.CombatCrafts;
import net.jilmoire.combatcrafts.registry.itemgroupreg;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CombatCraftsEnLangProvider extends FabricLanguageProvider {
    public CombatCraftsEnLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us");
    }

    private static void addtext(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof  TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            CombatCrafts.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(itemreg.IRON_BLADE, "Iron Blade");
        translationBuilder.add(itemreg.GOLD_BLADE, "Gold Blade");
        translationBuilder.add(itemreg.DIAMOND_BLADE, "Diamond Blade");

        translationBuilder.add(itemreg.HILT, "Sword Hilt");
        translationBuilder.add(itemreg.GUARD, "Sword Guard");
        translationBuilder.add(itemreg.GRIP, "Sword Grip");
        translationBuilder.add(itemreg.POMMEL, "Sword Pommel");

        translationBuilder.add(itemreg.MOLD, "Sword Mold");
        translationBuilder.add(itemreg.MELT_IRON, "Melted Iron");
        translationBuilder.add(itemreg.MELT_GOLD, "Melted Gold");
        translationBuilder.add(itemreg.MELT_DIAMOND, "Melted Diamond");
        translationBuilder.add(itemreg.BUCKET_GOLD, "Gold in a Bucket");
        translationBuilder.add(itemreg.BUCKET_IRON, "Iron in a Bucket");
        translationBuilder.add(itemreg.BUCKET_DIAMOND, "Iron in a Bucket");


        addtext(translationBuilder, itemgroupreg.EXAMPLE_TITLE, "Combat Crafts");
    }
}