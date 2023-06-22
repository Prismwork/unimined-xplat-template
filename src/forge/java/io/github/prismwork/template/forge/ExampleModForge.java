package io.github.prismwork.template.forge;

import io.github.prismwork.template.ExampleMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("modid")
public class ExampleModForge {
    public ExampleModForge() {
		ExampleMod.onInitialize();
	}

    @SubscribeEvent
    public void onInit(FMLCommonSetupEvent event) {}
}
