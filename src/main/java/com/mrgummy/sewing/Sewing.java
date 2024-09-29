package com.mrgummy.sewing;

import com.mrgummy.sewing.blocks.ModBlocks;
import com.mrgummy.sewing.items.ModItemGroup;
import com.mrgummy.sewing.items.ModItems;
import net.minecraft.item.ItemGroup;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sewing implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Sewing");
	public static final String MOD_ID = "sewing";

	public static final ItemGroup SEWING;

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
		ModItemGroup.regiserModItemGroups();
	}

	static {
		SEWING = ItemGroup.MISC;
	}

}
