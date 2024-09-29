package com.mrgummy.sewing.blocks;

import com.mrgummy.sewing.Sewing;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class ModBlocks {

	public static final Block PANDA_PLUSHIE =registerBlock("panda_plushie", new PlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block CREEPER_PLUSHIE =registerBlock("creeper_plushie", new PlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block PLUSHIE_PLUSHIE =registerBlock("plushie_plushie", new PlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block BEE_PLUSHIE =registerBlock("bee_plushie", new PlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block PILLOW =registerBlock("pillow", new PillowBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block COW_PLUSHIE =registerBlock("cow_plushie", new PlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block CAT_PLUSHIE =registerBlock("cat_plushie", new PlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block TOMATO_PLUSHIE =registerBlock("tomato_plushie", new TomatoPlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block ORANGE_PLUSHIE =registerBlock("orange_plushie", new TomatoPlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));
	public static final Block SHARK_PLUSHIE =registerBlock("shark_plushie", new SharkPlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()) {});
	public static final Block NUKE =registerBlock("nuke", new CreeperPlushieBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque().strength(4.0f)));
	public static final Block PINCUSHION =registerBlock("pincushion", new PincushionBlock(QuiltBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).nonOpaque()));

	private  static Block registerBlock(String name, Block block){
		registerBlockItem(name, block);
		return Registry.register(Registry.BLOCK, new Identifier(Sewing.MOD_ID, name), block);
	}

	public static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registry.ITEM, new Identifier(Sewing.MOD_ID, name),
			new BlockItem(block, new FabricItemSettings()));
	}
	public static void registerModBlock() {
	}
}
