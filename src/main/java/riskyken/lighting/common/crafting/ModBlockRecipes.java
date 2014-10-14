package riskyken.lighting.common.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import riskyken.lighting.common.blocks.ModBlocks;

public final class ModBlockRecipes {

    public static void init() {
        // flood lights
        ItemStack lightCratingTiers[] = {
                new ItemStack(Blocks.torch),
                new ItemStack(Items.coal),
                new ItemStack(Blocks.coal_block),
                new ItemStack(Blocks.glowstone),
                new ItemStack(Blocks.redstone_lamp)};

        for (int i = 0; i < 5; i++) {
            CraftingManager.addShapedRecipe(new ItemStack(ModBlocks.floodLight,
                    1, i), new Object[] { "wpw", "igi", "wiw", 'i',
                    Items.iron_ingot, 'w', "plankWood", 'g',
                    lightCratingTiers[i], 'p', Blocks.glass_pane });

            // Flood light upgrades
            for (int j = 0; j < 5; j++) {
                if (j != i) {
                    CraftingManager.addShapelessRecipe(new ItemStack(
                            ModBlocks.floodLight, 1, i), new Object[] {
                            new ItemStack(ModBlocks.floodLight, 1, j),
                            lightCratingTiers[i] });

                    CraftingManager.addShapelessRecipe(new ItemStack(
                            ModBlocks.floodLight, 1, i + 5), new Object[] {
                            new ItemStack(ModBlocks.floodLight, 1, j + 5),
                            lightCratingTiers[i] });
                }
            }

            // Flood light phased upgrades/down grades
            CraftingManager.addShapedRecipe(new ItemStack(ModBlocks.floodLight,
                    1, i + 5), new Object[] { " p ", "plp", " p ", 'l',
                    new ItemStack(ModBlocks.floodLight, 1, i), 'p',
                    Items.ender_pearl });

            CraftingManager.addShapedRecipe(new ItemStack(ModBlocks.floodLight,
                    1, i), new Object[] { " r ", "rlr", " r ", 'l',
                    new ItemStack(ModBlocks.floodLight, 1, i + 5), 'r',
                    Items.redstone });
        }

        // Phased Light Sponge
        for (int i = 0; i < 16; i++) {
            CraftingManager.addShapedRecipe(new ItemStack(
                    ModBlocks.phasedLightSponge, 1), new Object[] { " p ",
                    "pcp", " p ", 'c',
                    new ItemStack(ModBlocks.floodLight, 1, i), 'p',
                    Items.ender_pearl });
        }
    }
}
