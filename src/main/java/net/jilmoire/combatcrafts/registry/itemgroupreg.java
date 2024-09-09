package net.jilmoire.combatcrafts.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jilmoire.combatcrafts.CombatCrafts;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class itemgroupreg {
    public static void groupLog() {
        CombatCrafts.LOGGER.info("Adding items to a creative tab...");
    }
    public static final Text EXAMPLE_TITLE = Text.translatable("itemGroup." + CombatCrafts.MOD_ID + ".example_group");

    /// This script is used to go through the itemreg class and add all mod items automatically.
    public static final ItemGroup EXAMPLE_Group = register("example_group", FabricItemGroup.builder()
            .displayName(EXAMPLE_TITLE)
            .icon(Items.ANVIL::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(CombatCrafts.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <G extends ItemGroup> G register(String name, G itemgroup) {
        return Registry.register(Registries.ITEM_GROUP, CombatCrafts.id(name), itemgroup);
    }

        ///Loads the itemGroup
        public static void groupLoad() {}
}
