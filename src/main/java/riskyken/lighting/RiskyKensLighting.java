package riskyken.lighting;

import net.minecraft.creativetab.CreativeTabs;
import riskyken.lighting.common.blocks.ModBlocks;
import riskyken.lighting.common.crafting.CraftingManager;
import riskyken.lighting.common.creativetab.CreativeTabRiskyKensLighting;
import riskyken.lighting.common.entities.Entities;
import riskyken.lighting.common.lib.LibModInfo;
import riskyken.lighting.proxies.CommonProxy;
import riskyken.lighting.utils.ModLogger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibModInfo.ID, name = LibModInfo.NAME, version = LibModInfo.VERSION)
public class RiskyKensLighting {

    @Mod.Instance(LibModInfo.ID)
    public static RiskyKensLighting instance;

    @SidedProxy(clientSide = LibModInfo.PROXY_CLIENT_CLASS, serverSide = LibModInfo.PROXY_COMMNON_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabRiskyKensLighting tabRiskyKensUtilities = new CreativeTabRiskyKensLighting(
            CreativeTabs.getNextID(), LibModInfo.ID);

    @Mod.EventHandler
    public void perInit(FMLPreInitializationEvent event) {
        ModLogger.log("Loading " + LibModInfo.NAME + " " + LibModInfo.VERSION);

        ModBlocks.init();

        proxy.init();
        proxy.initRenderers();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        CraftingManager.init();

        ModBlocks.registerTileEntities();
        Entities.init();

        // PacketHandler.init();
        proxy.postInit();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
