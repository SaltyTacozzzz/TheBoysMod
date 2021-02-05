package io.github.saltytacozzzz.core.init;

import io.github.saltytacozzzz.TheBoysMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blockinit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			TheBoysMod.MOD_ID);
	
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new Block(AbstractBlock.Properties
			.create(Material.IRON)
			.setRequiresTool()
			.hardnessAndResistance(4.0F, 100.0F)
			.slipperiness( .98f)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(2)
			.sound(SoundType.GLASS)));
	
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new Block(AbstractBlock.Properties
			.create(Material.ROCK)
			.setRequiresTool()
			.hardnessAndResistance(3.0F, 5.0F)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(2)
			.sound(SoundType.STONE)));
	
	
	public static final RegistryObject<Block> KAIJU_ORE = BLOCKS.register("kaiju_ore", () -> new Block(AbstractBlock.Properties
			.create(Material.ROCK)
			.setRequiresTool()
			.hardnessAndResistance(5.0F, 10.0F)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(3)
			.sound(SoundType.STONE)));
	
	
	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(AbstractBlock.Properties
			.create(Material.ROCK)
			.setRequiresTool()
			.hardnessAndResistance(5.0F, 5.0F)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(2)
			.sound(SoundType.STONE)));
	
	
	
	public static final RegistryObject<CakeBlock> CARROT_CAKE = BLOCKS.register("carrot_cake", 
			() -> new CakeBlock(AbstractBlock.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
}
