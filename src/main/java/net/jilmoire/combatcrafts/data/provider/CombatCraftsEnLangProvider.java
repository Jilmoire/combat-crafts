package net.jilmoire.combatcrafts.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.jilmoire.combatcrafts.CombatCrafts;
import net.jilmoire.combatcrafts.registry.itemgroupreg;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.rmi.registry.Registry;
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
        translationBuilder.add(itemreg.EXAMPLE_ITEM, "Example Item");
        addtext(translationBuilder, itemgroupreg.EXAMPLE_TITLE, "Combat Crafts");
    }
}
