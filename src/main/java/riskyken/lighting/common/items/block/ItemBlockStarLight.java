package riskyken.lighting.common.items.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import riskyken.lighting.common.BlockStarLightTypes;

public class ItemBlockStarLight extends ItemBlock {

    public ItemBlockStarLight(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return field_150939_a.getUnlocalizedName() + itemstack.getItemDamage();
    }

    @Override
    public int getMetadata(int dmg) {
        return dmg;
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player,
            List hoverText, boolean par4) {
        BlockStarLightTypes type = BlockStarLightTypes
                .getBlockLightType(itemStack.getItemDamage());
        type.addHoverText(hoverText);
        super.addInformation(itemStack, player, hoverText, par4);
    }

}
