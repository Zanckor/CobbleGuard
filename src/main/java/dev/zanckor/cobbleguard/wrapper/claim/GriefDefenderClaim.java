package dev.zanckor.cobbleguard.wrapper.claim;

/*
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.griefdefender.api.GriefDefender;
import com.griefdefender.api.User;
import com.griefdefender.api.claim.Claim;
import com.griefdefender.util.Location;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class GriefDefenderClaim implements IClaimWrapper {

    @Override
    public boolean canWorkOnClaim(PokemonEntity entity, LivingEntity target, ServerLevel level) {
        Location location = new Location(level, target.getOnPos());
        Claim griefClaim = GriefDefender.getCore().getClaimAt(location);
        Player player = entity.getPokemon().getOwnerPlayer();
        User user = player != null ? GriefDefender.getCore().getUser(player.getUUID()) : null;

        if (user != null) {
            return canAttack(entity, entity.getTarget(), griefClaim, location, user);
        }

        return true;
    }

    private boolean canAttack(LivingEntity source, LivingEntity target, Claim griefClaim, Location location, User user) {
        return griefClaim == null || griefClaim.isWilderness() || griefClaim.canBreak(source, location, user);
    }
}*/