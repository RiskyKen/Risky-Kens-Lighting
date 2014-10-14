package riskyken.lighting.common.entities;

import riskyken.lighting.RiskyKensLighting;
import riskyken.lighting.common.lib.LibEntityIds;
import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {

    public static void init() {
        EntityRegistry.registerModEntity(EntityFloodLightDespawner.class,
                "FloodLightDespawner", LibEntityIds.FLOOD_LIGHT_DESPAWN,
                RiskyKensLighting.instance, 0, 20, false);
        
        EntityRegistry.registerModEntity(EntityStarLightDespawner.class,
                "StarLightDespawner", LibEntityIds.STAR_LIGHT_DESPAWN,
                RiskyKensLighting.instance, 0, 20, false);
    }
}
