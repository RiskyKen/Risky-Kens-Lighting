package riskyken.lighting.common;

import riskyken.lighting.common.tileentities.TileEntityFloodLight;

public enum BlockFloodLightTypes {
    FLOOD_LIGHT_8(8, false),
    FLOOD_LIGHT_16(16, false),
    FLOOD_LIGHT_32(32, false),
    FLOOD_LIGHT_64(64, false),
    FLOOD_LIGHT_128(128, false),

    PHASED_FLOOD_LIGHT_8(8, true),
    PHASED_FLOOD_LIGHT_16(16, true),
    PHASED_FLOOD_LIGHT_32(32, true),
    PHASED_FLOOD_LIGHT_64(64, true),
    PHASED_FLOOD_LIGHT_128(128, true);

    public final int lightRange;
    public final boolean phased;

    BlockFloodLightTypes(int lightRange, boolean phased) {
        this.lightRange = lightRange;
        this.phased = phased;
    }

    public static TileEntityFloodLight makeEntity(int typeId) {
        TileEntityFloodLight te = new TileEntityFloodLight(
                BlockFloodLightTypes.getBlockLightType(typeId));
        return te;
    }

    public static BlockFloodLightTypes getBlockLightType(int id) {
        return BlockFloodLightTypes.values()[id];
    }
}
