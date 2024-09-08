package net.jilmoire.combatcrafts.registry;

import net.jilmoire.combatcrafts.CombatCrafts;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class itemreg {
    ///Logger for item registry.
    public static void itemlogger() {
        CombatCrafts.LOGGER.info("Registering Items for " + CombatCrafts.MOD_ID);
    }
    ///Method for registering items.
    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, CombatCrafts.id(name), item);
    }
    ///Items will call the method and be added in the game.
    public static final Item EXAMPLE_ITEM = (registerItem("example_item", new Item(new Item.Settings())));

    ///Loads the entire script.
    public static void itemload(){}
}
