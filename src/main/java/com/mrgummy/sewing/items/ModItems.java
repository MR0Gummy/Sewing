package com.mrgummy.sewing.items;

import com.mrgummy.sewing.Sewing;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.quiltmc.qsl.item.setting.api.RecipeRemainderProvider;

public class ModItems {

	public static final Item SEWING_NEEDLE =registerItem("sewing_needle", new SewingNeedleItem(
		new QuiltItemSettings().maxCount(1)));
	public static final Item BLACK_FABRIC =registerItem("black_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item BLUE_FABRIC =registerItem("blue_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item BROWN_FABRIC =registerItem("brown_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item CYAN_FABRIC =registerItem("cyan_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item GRAY_FABRIC =registerItem("gray_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item GREEN_FABRIC =registerItem("green_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item LIGHT_BLUE_FABRIC =registerItem("light_blue_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item LIGHT_GRAY_FABRIC =registerItem("light_gray_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item LIME_FABRIC =registerItem("lime_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item MAGENTA_FABRIC =registerItem("magenta_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item ORANGE_FABRIC =registerItem("orange_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item PINK_FABRIC =registerItem("pink_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item PURPLE_FABRIC =registerItem("purple_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item RED_FABRIC =registerItem("red_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item WHITE_FABRIC =registerItem("white_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item YELLOW_FABRIC =registerItem("yellow_fabric", new Item(
		new QuiltItemSettings().maxCount(16)));

	public static final Item MITTEN =registerItem("mitten", new Item(
		new QuiltItemSettings().maxCount(1)));
	public static final Item OPPOSITE_MITTEN =registerItem("opposite_mitten", new Item(
		new QuiltItemSettings().maxCount(1)));
	public static final Item TOWEL =registerItem("towel", new Item(
		new QuiltItemSettings().maxCount(16).recipeSelfRemainder()));
	public static final Item DIAMOND_SWORD_PLUSHIE =registerItem("diamond_sword_plushie", new Item(
		new QuiltItemSettings().maxCount(16)));
	public static final Item EMBROIDERY =registerItem("embroidery", new Item(new
		QuiltItemSettings().maxCount(1)));
	public static final Item BEANIE =registerItem("beanie", new HatItem(
		new QuiltItemSettings().maxCount(1)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Sewing.MOD_ID, name), item);
	}
	public static void registerModItems() {

	}
}
