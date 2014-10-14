package riskyken.lighting.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import riskyken.lighting.common.items.block.ModItemBlock;
import riskyken.lighting.common.lib.LibBlockNames;
import riskyken.lighting.common.lib.LibModInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPhasedLightSponge extends AbstractModBlock {

    public BlockPhasedLightSponge() {
        super(LibBlockNames.PHASED_LIGHT_SPONGE);
    }

    @Override
    public Block setBlockName(String name) {
        GameRegistry.registerBlock(this, ModItemBlock.class, "block." + name);
        return super.setBlockName(name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(LibModInfo.ID + ":"
                + "phased-light-sponge");
    }
}
