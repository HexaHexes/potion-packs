package org.bitwisemadness.potionpacks.common.events;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.bitwisemadness.potionpacks.common.init.MainPotions;

public final class ModCommonEvents {
	private ModCommonEvents() {}

	public static void commonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(MainPotions::registerBrewingRecipes);
	}
}
