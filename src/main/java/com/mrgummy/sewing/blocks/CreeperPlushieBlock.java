package com.mrgummy.sewing.blocks;

import com.mrgummy.sewing.util.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

public class CreeperPlushieBlock extends Block {
	public static final DirectionProperty FACING;
	public static final IntProperty GUNPOWDER;

	public CreeperPlushieBlock(Settings settings) {
		super(settings);
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(GUNPOWDER, 0).with(FACING, ctx.getPlayerFacing().rotateYClockwise());
	}

	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
	}

	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		float Power = state.get(GUNPOWDER);
		ItemStack itemStack = player.getStackInHand(hand);
		if (!itemStack.isOf(Items.FLINT_AND_STEEL) && !itemStack.isOf(Items.FIRE_CHARGE) && !itemStack.isOf(Items.GUNPOWDER)) {
			return super.onUse(state, world, pos, player, hand, hit);
		} else if (itemStack.isOf(Items.GUNPOWDER)) {
			if (state.get(GUNPOWDER) >= 64) {
				world.setBlockState(pos, (BlockState)state.with(GUNPOWDER, (state.get(GUNPOWDER) + 1)));
				itemStack.decrement(1);
				return ActionResult.CONSUME;
			} else {
				return super.onUse(state, world, pos, player, hand, hit);
			}
		} else {
			world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), Power, Explosion.DestructionType.BREAK);
			world.setBlockState(pos, Blocks.AIR.getDefaultState(), 11);
			Item item = itemStack.getItem();
			if (!player.isCreative()) {
				if (itemStack.isOf(Items.FLINT_AND_STEEL)) {
					itemStack.damage(1, player, (playerx) -> {
						playerx.sendToolBreakStatus(hand);
					});
				} else {
					itemStack.decrement(1);
				}
			}

			player.incrementStat(Stats.USED.getOrCreateStat(item));
			return ActionResult.success(world.isClient);
		}
	}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{FACING});
		builder.add(GUNPOWDER);
	}

	static {
		FACING = HorizontalFacingBlock.FACING;
		GUNPOWDER = ModProperties.GUNPOWDER;
	}
}
