package com.mrgummy.sewing.blocks;


import com.mrgummy.sewing.items.ModItems;
import com.mrgummy.sewing.util.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PincushionBlockExperimental extends Block {
	public static final IntProperty SEWING_NEEDLES;
	private static final VoxelShape BASE_SHAPE;
	public PincushionBlockExperimental(Settings settings) {
		super(settings);
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(SEWING_NEEDLES, 0);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemStack itemStack = player.getStackInHand(hand);
		if (!world.isClient) {
			return ActionResult.SUCCESS;
		} else {
			if (itemStack.isOf(ModItems.SEWING_NEEDLE)) {
				if (state.get(SEWING_NEEDLES) == 0) {
					world.setBlockState(pos, (BlockState)state.with(SEWING_NEEDLES, 1));
					if (!player.isCreative()){
						itemStack.decrement(1);
					}
				}else if (state.get(SEWING_NEEDLES) == 1) {
					world.setBlockState(pos, (BlockState)state.with(SEWING_NEEDLES, 2));
					if (!player.isCreative()){
						itemStack.decrement(1);
					}
				}
				return ActionResult.SUCCESS;
			} else if (player.isSneaking()) {
				if (state.get(SEWING_NEEDLES) == 0) {
					world.setBlockState(pos, (BlockState)state.with(SEWING_NEEDLES, 1));
					if (itemStack.isEmpty()) {
						player.setStackInHand(hand, new ItemStack(ModItems.SEWING_NEEDLE));
					} else if (!player.getInventory().insertStack(new ItemStack(ModItems.SEWING_NEEDLE))) {
						player.dropItem(new ItemStack(ModItems.SEWING_NEEDLE), false);
					}
				}else if (state.get(SEWING_NEEDLES) == 1) {
					world.setBlockState(pos, (BlockState)state.with(SEWING_NEEDLES, 2));
					if (itemStack.isEmpty()) {
						player.setStackInHand(hand, new ItemStack(ModItems.SEWING_NEEDLE));
					} else if (!player.getInventory().insertStack(new ItemStack(ModItems.SEWING_NEEDLE))) {
						player.dropItem(new ItemStack(ModItems.SEWING_NEEDLE), false);
					}
				}
				return ActionResult.SUCCESS;
			}else {
				return ActionResult.SUCCESS;
			}
		}
    }



	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return BASE_SHAPE;
	}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(SEWING_NEEDLES);

	}

	static {
		BASE_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 4, 11);
		SEWING_NEEDLES = ModProperties.SEWING_NEEDLES;
	}
}
