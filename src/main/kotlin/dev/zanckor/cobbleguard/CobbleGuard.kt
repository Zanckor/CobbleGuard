package dev.zanckor.cobbleguard

import dev.zanckor.cobbleguard.config.SimpleConfig
import dev.zanckor.cobbleguard.core.brain.registry.PokemonMemoryModuleType
import dev.zanckor.cobbleguard.core.brain.registry.PokemonSensors
import dev.zanckor.cobbleguard.core.command.CommandRegistry
import dev.zanckor.cobbleguard.listener.CapturePokemonListener
import dev.zanckor.cobbleguard.listener.RemoteTargetListener
import net.fabricmc.api.ModInitializer

class CobbleGuard : ModInitializer {

    override fun onInitialize() {
        SimpleConfig.load()

        PokemonSensors.init()
        PokemonMemoryModuleType.init()

        RemoteTargetListener.init()
        CapturePokemonListener.init()
        CommandRegistry.init()
    }

    companion object {
        @JvmField
        var MODID: String = "cobbleguard"
    }
}
