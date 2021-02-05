package io.github.saltytacozzzz;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.saltytacozzzz.core.init.Blockinit;
import io.github.saltytacozzzz.core.init.Iteminit;
import io.github.saltytacozzzz.world.OreGeneration;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TheBoysMod.MOD_ID)
public class TheBoysMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "salty_th3_b0y5_m0d";
    public static final ItemGroup BOYS_GROUP = new BoysGroup("boystab");	
    
    public TheBoysMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
        
        
        Iteminit.ITEMS.register(bus);
        Blockinit.BLOCKS.register(bus);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        
        
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    }
    
    	public static class BoysGroup extends ItemGroup{

			public BoysGroup(String label) {
				super(label);
			}
    		@Override
    	public ItemStack createIcon() {
    			return Iteminit.KAIJU_BONE.get().getDefaultInstance();
    		}
    		
    		
    }
    } 
