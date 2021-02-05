package io.github.saltytacozzzz.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CustomBlock extends BaseHorizontalBlock {

	public CustomBlock(Properties properties) {
		super(properties);
		runCalculation(Block.makeCuboidShape(0, 0, 0, 16, 7, 16));

	
	}
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(state.get(HORIZONTAL_FACING));
	}
	
}