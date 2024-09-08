package net.jilmoire.combatcrafts.registry;

import net.jilmoire.combatcrafts.CombatCrafts;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class itemreg {
    public static void itemlogger() {
        CombatCrafts.LOGGER.info("Registering Items for " + CombatCrafts.MOD_ID);
    }

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, CombatCrafts.id(name), item);
    }

    public static final Item EXAMPLE_ITEM = (registerItem("example_item", new Item(new Item.Settings())));
    /// Watch datagen tutorial before adding other shits and giggles
    public static void itemload(){}
}
