package com.mrgummy.sewing.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PlushieBlock extends Block{


	public static final DirectionProperty FACING;
	private static final VoxelShape BASE_SHAPE;
	private static final VoxelShape BEE_SHAPE;
	private static final VoxelShape COW_SHAPE;
	private static final VoxelShape CAT_SHAPE;

	public PlushieBlock( Settings settings) {

		super(settings);
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().rotateYClockwise());
	}
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		Direction direction = (Direction)state.get(FACING);
		if (state.getBlock() == ModBlocks.BEE_PLUSHIE) {
			return BEE_SHAPE;
		}else if (state.getBlock() == ModBlocks.COW_PLUSHIE) {
			return COW_SHAPE;
		}else if (state.getBlock() == ModBlocks.CAT_PLUSHIE) {
			return CAT_SHAPE;
		}else {
			return BASE_SHAPE;
		}
	}

	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
	}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{FACING});
	}

	static {
		FACING = HorizontalFacingBlock.FACING;
		BASE_SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 13.0, 12.0);
		BEE_SHAPE = Block.createCuboidShape(4.5, 0, 4.5, 11.5, 5, 11.5);
		COW_SHAPE = Block.createCuboidShape(3, 0, 3, 13, 10, 13);
		CAT_SHAPE = Block.createCuboidShape(3, 0, 3, 13, 4, 13);
	}

}
