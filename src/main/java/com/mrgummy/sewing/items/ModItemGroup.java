package com.mrgummy.sewing.items;

import com.mrgummy.sewing.Sewing;
import com.mrgummy.sewing.blocks.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ModItemGroup {
	public static final ItemGroup SEWING =
		FabricItemGroupBuilder.create(new Identifier(Sewing.MOD_ID, "sewing")).icon(() -> new ItemStack(ModItems.SEWING_NEEDLE)).appendItems(((itemStacks, itemGroup) -> {
			itemStacks.add(new ItemStack(ModItems.SEWING_NEEDLE));

			itemStacks.add(new ItemStack(ModItems.BLACK_FABRIC));
			itemStacks.add(new ItemStack(ModItems.BLUE_FABRIC));
			itemStacks.add(new ItemStack(ModItems.BROWN_FABRIC));
			itemStacks.add(new ItemStack(ModItems.CYAN_FABRIC));
			itemStacks.add(new ItemStack(ModItems.GRAY_FABRIC));
			itemStacks.add(new ItemStack(ModItems.GREEN_FABRIC));
			itemStacks.add(new ItemStack(ModItems.LIGHT_BLUE_FABRIC));
			itemStacks.add(new ItemStack(ModItems.LIGHT_GRAY_FABRIC));
			itemStacks.add(new ItemStack(ModItems.LIME_FABRIC));
			itemStacks.add(new ItemStack(ModItems.MAGENTA_FABRIC));
			itemStacks.add(new ItemStack(ModItems.ORANGE_FABRIC));
			itemStacks.add(new ItemStack(ModItems.PINK_FABRIC));
			itemStacks.add(new ItemStack(ModItems.PURPLE_FABRIC));
			itemStacks.add(new ItemStack(ModItems.RED_FABRIC));
			itemStacks.add(new ItemStack(ModItems.WHITE_FABRIC));
			itemStacks.add(new ItemStack(ModItems.YELLOW_FABRIC));

			itemStacks.add(new ItemStack(ModBlocks.PANDA_PLUSHIE)); //black
			itemStacks.add(new ItemStack(ModItems.TOWEL)); //blue
			itemStacks.add(new ItemStack(ModBlocks.COW_PLUSHIE)); //brown
			itemStacks.add(new ItemStack(ModItems.DIAMOND_SWORD_PLUSHIE)); //cyan
			itemStacks.add(new ItemStack(ModBlocks.CAT_PLUSHIE)); //grey
			itemStacks.add(new ItemStack(ModItems.MITTEN)); // green
			itemStacks.add(new ItemStack(ModBlocks.SHARK_PLUSHIE)); // light_blue
			itemStacks.add(new ItemStack(ModItems.EMBROIDERY)); //light_grey
			itemStacks.add(new ItemStack(ModBlocks.CREEPER_PLUSHIE)); //lime
			itemStacks.add(new ItemStack(ModItems.OPPOSITE_MITTEN)); //magenta
			itemStacks.add(new ItemStack(ModBlocks.ORANGE_PLUSHIE)); //orange
			itemStacks.add(new ItemStack(ModBlocks.PINCUSHION)); //pink
			itemStacks.add(new ItemStack(ModBlocks.PLUSHIE_PLUSHIE)); //purple
			itemStacks.add(new ItemStack(ModBlocks.TOMATO_PLUSHIE)); //red
			itemStacks.add(new ItemStack(ModBlocks.PILLOW)); //white
			itemStacks.add(new ItemStack(ModBlocks.BEE_PLUSHIE)); //yellow


		})).build();

	public static void regiserModItemGroups() {

	}

}
