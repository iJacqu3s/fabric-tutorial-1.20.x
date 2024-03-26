package net.ij.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ij.tutorialmod.TutorialMod;
import net.ij.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    /*
     Add items here.
     When adding items, remember to do the following:
     1.) add them to the "en_us.json" file.
     2.) create a new json file under the models/item folder.
     3.) place a texture in the texture/item folder.
     */
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));

    // Instead of calling for a regular Item like the other methods, this method calls for the custom MetalDetectorItem
    // This is a special item with custom functionality.
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));


    // This item is a food. It has been defined as such in the ModFoodComponents class,
    // and the game will use the values in the class.
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings()
            .food(ModFoodComponents.TOMATO)));

    // This is a fuel item. It gets registered as such in the "TutorialMod" class
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));


    /*
      Add items to a vanilla creative tab (PART 1).
      To add more ingredients, add more entries below the method.
      To add ingredients to a different tab, create a new method, and
      change "addItemsToIngredientTab" to something else.
     */
    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {

        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    // Register items
    public static Item registerItem(String name, Item item) {
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
