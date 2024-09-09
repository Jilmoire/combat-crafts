package net.jilmoire.combatcrafts;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jilmoire.combatcrafts.registry.itemgroupreg;
import net.jilmoire.combatcrafts.registry.itemreg;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombatCrafts implements ModInitializer {
	public static final String MOD_ID = "combatcrafts";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//Loaders
		itemreg.itemload();
		itemgroupreg.groupLoad();

		//Loggers
		itemreg.itemlogger();
		itemgroupreg.groupLog();
		LOGGER.info("Mod initiated!");
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}