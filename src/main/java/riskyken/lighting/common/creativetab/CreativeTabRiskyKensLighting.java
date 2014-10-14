package riskyken.lighting.common.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import riskyken.lighting.common.blocks.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabRiskyKensLighting extends CreativeTabs {

    public CreativeTabRiskyKensLighting(int id, String label) {
        super(id, label);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.floodLight);
    }
}
