package wenjalan.noweaponcooldown;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class NoWeaponCooldownListener {

    @SubscribeEvent
    public void onAttackEntityEvent(AttackEntityEvent e) {
        maximizeAttackSpeed(e.getEntityPlayer());
    }

    @SubscribeEvent
    public void onPlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent e) {
        maximizeAttackSpeed(e.player);
    }

    @SubscribeEvent
    public void onPlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent e) {
        maximizeAttackSpeed(e.player);
    }

    @SubscribeEvent
    public void onPlayerLoggedOutEvent(PlayerEvent.PlayerLoggedOutEvent e) {
        maximizeAttackSpeed(e.player);
    }

    // sets a PlayerEntity's attackSpeed attribute to 1024, the maximum
    protected void maximizeAttackSpeed(EntityPlayer player) {
        player.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(1024.0);
    }

}