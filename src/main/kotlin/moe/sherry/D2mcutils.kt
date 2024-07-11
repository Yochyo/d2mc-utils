package moe.sherry

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object D2mcutils : ModInitializer {
    private val logger = LoggerFactory.getLogger("d2mc-utils")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	}
}