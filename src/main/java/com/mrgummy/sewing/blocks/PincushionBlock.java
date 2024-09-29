package com.mrgummy.sewing.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PincushionBlock extends Block {
	private static final VoxelShape BASE_SHAPE;

	public PincushionBlock(Settings settings) {
		super(settings);
	}

	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return BASE_SHAPE;
	}

	static {
		BASE_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 4, 11);
	}
}
