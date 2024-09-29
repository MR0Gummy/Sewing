package com.mrgummy.sewing.items;

import com.mrgummy.sewing.blocks.ModBlocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SewingNeedleItem extends Item {
	public SewingNeedleItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack OffHand = user.getStackInHand(Hand.OFF_HAND);
		ItemStack itemStack = user.getStackInHand(hand);

		if (!user.isCreative()) {
			user.getItemCooldownManager().set(this, 20);
		}
		if (OffHand.isOf(ModItems.BLACK_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.PANDA_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.PANDA_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.PANDA_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.BLUE_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModItems.TOWEL));
			} else if (!user.getInventory().insertStack(new ItemStack(ModItems.TOWEL))) {
				user.dropItem(new ItemStack(ModItems.TOWEL), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.BROWN_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.COW_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.COW_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.COW_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.CYAN_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModItems.DIAMOND_SWORD_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModItems.DIAMOND_SWORD_PLUSHIE))) {
				user.dropItem(new ItemStack(ModItems.DIAMOND_SWORD_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.GRAY_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.CAT_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.CAT_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.CAT_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.GREEN_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModItems.MITTEN));
			} else if (!user.getInventory().insertStack(new ItemStack(ModItems.MITTEN))) {
				user.dropItem(new ItemStack(ModItems.MITTEN), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.LIGHT_BLUE_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.SHARK_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.SHARK_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.SHARK_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.LIGHT_GRAY_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModItems.EMBROIDERY));
			} else if (!user.getInventory().insertStack(new ItemStack(ModItems.EMBROIDERY))) {
				user.dropItem(new ItemStack(ModItems.EMBROIDERY), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.LIME_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.CREEPER_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.CREEPER_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.CREEPER_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.MAGENTA_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModItems.OPPOSITE_MITTEN));
			} else if (!user.getInventory().insertStack(new ItemStack(ModItems.OPPOSITE_MITTEN))) {
				user.dropItem(new ItemStack(ModItems.OPPOSITE_MITTEN), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.ORANGE_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.ORANGE_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.ORANGE_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.ORANGE_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.PINK_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.PINCUSHION));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.PINCUSHION))) {
				user.dropItem(new ItemStack(ModBlocks.PINCUSHION), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.PURPLE_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.PLUSHIE_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.PLUSHIE_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.PLUSHIE_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.RED_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.TOMATO_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.TOMATO_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.TOMATO_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.WHITE_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.PILLOW));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.PILLOW))) {
				user.dropItem(new ItemStack(ModBlocks.PILLOW), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		} else if (OffHand.isOf(ModItems.YELLOW_FABRIC)) {
			if (itemStack.isEmpty()) {
				user.setStackInHand(hand, new ItemStack(ModBlocks.BEE_PLUSHIE));
			} else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.BEE_PLUSHIE))) {
				user.dropItem(new ItemStack(ModBlocks.BEE_PLUSHIE), false);
			}
			world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD, SoundCategory.PLAYERS, 1.0F, 1.0F);
			OffHand.decrement(1);
		}




		return super.use(world, user, hand);

	}
	//beist
	//based
}
