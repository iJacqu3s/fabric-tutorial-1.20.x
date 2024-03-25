package net.ij.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ij.tutorialmod.TutorialMod;
import net.ij.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    /* Register custom creative tab (item group) */

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        /*
                        Add items to the creative tab (item group)
                        This is the order they will appear in
                         */
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        /*
                        Add blocks to tabs groups
                         */
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        /*
                        You can also add vanilla items
                         */
                        entries.add(Items.DIAMOND);

                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Custom Item Groups for " +TutorialMod.MOD_ID);
    }
}
