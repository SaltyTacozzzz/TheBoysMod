package io.github.saltytacozzzz.core.init;

import io.github.saltytacozzzz.TheBoysMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Iteminit {

	public static final DeferredRegister<Item> ITEMS  = DeferredRegister.create(ForgeRegistries.ITEMS, 
			TheBoysMod.MOD_ID);
	
	
	public static final RegistryObject<Item>  TITANIUM_INGOT = ITEMS.register("titanium_ingot", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP)));
	
	public static final RegistryObject<Item>  STEEL_INGOT = ITEMS.register("steel_ingot", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP)));
	
	public static final RegistryObject<Item>  KAIJU_SCALE = ITEMS.register("kaiju_scale", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP)));
	
	public static final RegistryObject<Item>  KAIJU_BONE = ITEMS.register("kaiju_bone", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP)));
	
	
	
	
	public static final RegistryObject<Item>  SUSHI = ITEMS.register("sushi", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP)
					.food(new Food.Builder().hunger(8).saturation(1.0F).build())));
	
	public static final RegistryObject<Item>  RICE_BALL = ITEMS.register("rice_ball", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP).food(new Food.Builder().hunger(6).saturation(1.2F).build())));
		
	public static final RegistryObject<Item>  RAW_CALAMARI = ITEMS.register("raw_calamari", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP).food(new Food.Builder().hunger(3).saturation(0.2F).build())));;
	
	
	public static final RegistryObject<Item>  COOKED_CALAMARI = ITEMS.register("cooked_calamari", 
			() -> new Item(new Properties().group(TheBoysMod.BOYS_GROUP).food(new Food.Builder().hunger(5).saturation(0.4F).build())));;
	
	
	
	//BlockItem
	public static final RegistryObject<BlockItem>  TITANIUM_BLOCK = ITEMS.register("titanium_block", 
			() -> new BlockItem(Blockinit
					.TITANIUM_BLOCK.get(), new Item
					.Properties().group(TheBoysMod.BOYS_GROUP)));
	
	public static final RegistryObject<BlockItem>  TITANIUM_ORE = ITEMS.register("titanium_ore", 
			() -> new BlockItem(Blockinit
					.TITANIUM_ORE.get(), new Item
					.Properties().group(TheBoysMod.BOYS_GROUP)));
		
	public static final RegistryObject<BlockItem>  STEEL_BLOCK = ITEMS.register("steel_block", 
			() -> new BlockItem(Blockinit
					.STEEL_BLOCK.get(), new Item
					.Properties().group(TheBoysMod.BOYS_GROUP)));
	
	public static final RegistryObject<BlockItem>  CARROT_CAKE = ITEMS.register("carrot_cake", 
			() -> new BlockItem(Blockinit
					.CARROT_CAKE.get(), new Item
					.Properties().group(TheBoysMod.BOYS_GROUP)));
	
	public static final RegistryObject<BlockItem>  KAIJU_ORE = ITEMS.register("kaiju_ore", 
			() -> new BlockItem(Blockinit
					.KAIJU_ORE.get(), new Item
					.Properties().group(TheBoysMod.BOYS_GROUP)));

	
}

