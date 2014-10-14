package riskyken.lighting.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import riskyken.lighting.common.lib.LibBlockNames;
import riskyken.lighting.common.tileentities.TileEntityFloodLight;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockFloodLight floodLight;
    public static Block utilitieLight;
    public static Block phasedLightSponge;

    public static Block utilitieSolid;
    public static BlockStarLight starLight;
    public static Block starMultiBlock;

    public static void init() {
        floodLight = new BlockFloodLight();
        utilitieLight = new BlockUtilitieLight();
        phasedLightSponge = new BlockPhasedLightSponge();
        // utilitieSolid = new BlockUtilitieSolid();
        // starLight = new BlockStarLight();
        // starMultiBlock = new BlockStarMultiBlock();
    }

    public static void registerTileEntities() {
        registerTileEntity(TileEntityFloodLight.class, LibBlockNames.FLOOD_LIGHT);
        // registerTileEntity(TileEntityStarLight.class,
        // LibBlockNames.STAR_LIGHT);
        // registerTileEntity(TileEntityStarMultiBlock.class,
        // LibBlockNames.STAR_MULTI_BLOCK);
    }

    public static void registerTileEntity(
            Class<? extends TileEntity> tileEntityClass, String id) {
        GameRegistry.registerTileEntity(tileEntityClass, "te." + id);
    }
}
