package net.ij.tutorialmod.item.custom;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ij.tutorialmod.item.ModItems;

public class FuelRegistryHandler {
    public static void registerFuel() {

        // Add any additional fuel registrations here
        FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);

    }
}
