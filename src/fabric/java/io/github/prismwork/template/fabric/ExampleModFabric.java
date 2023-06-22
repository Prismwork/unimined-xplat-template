package io.github.prismwork.template.fabric;

import io.github.prismwork.template.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
		ExampleMod.onInitialize();
    }
}
