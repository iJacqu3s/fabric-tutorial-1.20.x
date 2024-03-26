package net.ij.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.ij.tutorialmod.block.ModBlocks;
import net.ij.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // these blocks will drop themselves
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.SAPPHIRE_BLOCK);

        // these blocks will drop other items similarly to copper
        addDrop(ModBlocks.RUBY_ORE, copperLikeOreDrops(
                ModBlocks.RUBY_ORE,
                ModItems.RAW_RUBY, 2.0f, 5.0f));

        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(
                ModBlocks.DEEPSLATE_RUBY_ORE,
                ModItems.RAW_RUBY, 3.0f, 6.0f));

        addDrop(ModBlocks.NETHER_RUBY_ORE, copperLikeOreDrops(
                ModBlocks.NETHER_RUBY_ORE,
                ModItems.RAW_RUBY, 1.5f, 3.0f));

        addDrop(ModBlocks.END_STONE_RUBY_ORE, copperLikeOreDrops(
                ModBlocks.END_STONE_RUBY_ORE,
                ModItems.RAW_RUBY, 5.0f, 7.0f));

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item, float minCount, float maxCount) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder)
                                ItemEntry.builder(
                                item
                                )
                                .apply(SetCountLootFunction
                                        .builder(
                                                UniformLootNumberProvider
                                                .create(minCount, maxCount
                                                ))))
                        .apply(ApplyBonusLootFunction
                                .oreDrops(Enchantments
                                        .FORTUNE))));
    }
}
