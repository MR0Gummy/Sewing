package com.mrgummy.sewing.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TomatoPlushieBlock extends Block {
	private static final VoxelShape BASE_SHAPE;

	public TomatoPlushieBlock(Settings settings) {
		super(settings);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return BASE_SHAPE;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, RandomGenerator random) {
		super.randomTick(state, world, pos, random);
	}

	static {
		BASE_SHAPE = Block.createCuboidShape(4.5, -0.5, 4.5, 11.5, 6.5, 11.5);
	}
}
