package com.mrgummy.sewing.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HatItem extends Item implements Wearable {
	public HatItem(Settings settings) {
		super(settings);
	}

	@Override
	public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(Text.translatable("item.sewing.hat"));

		super.appendTooltip(stack, world, tooltip, context);
	}


	public EquipmentSlot getSlotType() {
		return EquipmentSlot.HEAD;
	}
}
