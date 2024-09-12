package net.jilmoire.combatcrafts;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.jilmoire.combatcrafts.data.provider.CombatCraftsEnLangProvider;
import net.jilmoire.combatcrafts.data.provider.CombatCraftsModelProvider;
import net.jilmoire.combatcrafts.data.provider.CombatCraftsRecipeProvider;

public class CombatCraftsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(CombatCraftsModelProvider::new);
		pack.addProvider(CombatCraftsEnLangProvider::new);
		pack.addProvider(CombatCraftsRecipeProvider::new);
	}
}
