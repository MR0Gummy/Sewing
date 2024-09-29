package com.mrgummy.sewing.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.Nullable;

public class SewingNeedleScreenHandler extends ScreenHandler {

	final Slot fabricSlot1;
	final Slot fabricSlot2;
	private final Slot outputSlot;

	public SewingNeedleScreenHandler(@Nullable ScreenHandlerType<?> type, int syncId, Slot fabricSlot1, Slot fabricSlot2, Slot outputSlot) {
		super(type, syncId);
		this.fabricSlot1 = fabricSlot1;
		this.fabricSlot2 = fabricSlot2;
		this.outputSlot = outputSlot;
	}





	@Override
	public ItemStack quickTransfer(PlayerEntity player, int fromIndex) {
		return null;
	}

	@Override
	public boolean canUse(PlayerEntity player) {
		return false;
	}

	public Slot getFabricSlot1() {
		return fabricSlot1;
	}

	public Slot getFabricSlot2() {
		return fabricSlot2;
	}

	public Slot getOutputSlot() {
		return outputSlot;
	}
}
