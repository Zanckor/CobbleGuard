package dev.zanckor.cobbleguard.mixin.mixin

import com.cobblemon.mod.common.api.types.ElementalType
import dev.zanckor.cobbleguard.mixin.mixininterface.EffectContainer
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.level.Level
import org.spongepowered.asm.mixin.Debug
import org.spongepowered.asm.mixin.Mixin

@Mixin(LivingEntity::class)
@Debug(export = true, print = true)
abstract class LivingEntityMixin(entityType: EntityType<*>, level: Level) : EffectContainer, Entity(entityType, level) {
    private var effectType: List<Pair<ElementalType, Int>> = mutableListOf()

    /*
    override fun addEffect(elementalType: ElementalType, tickDuration: Int) {
        effectType = effectType.plus(Pair(elementalType, tickDuration))
    }

    override fun getEffectType(): Pair<ElementalType, Int> {
        return effectType.first()
    }

    override fun updateDuration() {
        effectType = effectType.filter { (_, tickDuration) ->
            if(tickDuration > 0) {
                tickDuration - 1
            }

            tickDuration > 0
        }
    }

    @Inject(method = ["tick"], at = [At("HEAD")])
    fun onTick(callbackInfo: CallbackInfo) {
        updateDuration()

        effectType.forEach { (elementalType, _) ->
            when (elementalType) {
                ElementalTypes.ICE -> {
                    setIsInPowderSnow(true)
                }
            }
        }
    }
     */
}