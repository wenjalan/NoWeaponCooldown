package wenjalan.noweaponcooldown;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = NoWeaponCooldown.MOD_ID, name = NoWeaponCooldown.NAME, version = NoWeaponCooldown.VERSION)
public class NoWeaponCooldown {

    public static final String MOD_ID = "noweaponcooldown";
    public static final String NAME = "No Weapon Cooldown";
    public static final String VERSION = "Super Duper Alpha";

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();

        // register listener
        MinecraftForge.EVENT_BUS.register(new NoWeaponCooldownListener());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

}
