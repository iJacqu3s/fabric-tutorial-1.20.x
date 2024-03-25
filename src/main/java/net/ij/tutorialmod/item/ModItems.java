package net.ij.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ij.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Add items here.
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    // Add items to a vanilla creative tab (PART 1)
    // To add more ingredients, add more entries below the method.
    // To add ingredients to a different tab, create a new method, and
    // change "addItemsToIngredientTab" to something else.
    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {

        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    // Register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        // Add items to a vanilla creative tab (PART 2)
        // To assign ingredients to a different tab, create a new method, and
        // change "addItemsToIngredientTab" to something else, and use a different item group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }
}
