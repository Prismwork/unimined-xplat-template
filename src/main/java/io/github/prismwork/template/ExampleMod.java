package io.github.prismwork.template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod {
    public static final Logger LOGGER = LogManager.getLogger("modid");

	public static void onInitialize() {
		LOGGER.info("Hello Fabric or Forge or whatever world!");
	}
}
