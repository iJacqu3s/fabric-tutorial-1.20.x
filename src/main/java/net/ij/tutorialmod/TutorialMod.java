package net.ij.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ij.tutorialmod.block.ModBlocks;
import net.ij.tutorialmod.item.ModItemGroups;
import net.ij.tutorialmod.item.ModItems;
import net.ij.tutorialmod.item.custom.FuelRegistryHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorial-mod");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FuelRegistryHandler.registerFuel();

	}
}