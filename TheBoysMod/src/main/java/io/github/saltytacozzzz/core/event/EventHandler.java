package io.github.saltytacozzzz.core.event;

import io.github.saltytacozzzz.TheBoysMod;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = TheBoysMod.MOD_ID, bus = Bus.FORGE)
public class EventHandler {

	
	@SubscribeEvent
	public static void onBlockBreak(final BlockEvent.BreakEvent event) {
	}
}
