package com.ytxsy.extra_recipe.recipe.furnace;

import com.ytxsy.extra_recipe.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thebetweenlands.common.registries.ItemRegistry;
import twilightforest.block.TFBlocks;

public class MinecraftFRecipes
{
    public static void init() {
        //GameRegistry.addSmelting(new ItemStack(111.222, amount, meta), new ItemStack(111.222, amount, meta), 3f);
        //1=Items,Blocks... 2=Name 3=1234567890

        //Plant
        GameRegistry.addSmelting(new ItemStack(Blocks.SAPLING, 1, 32767), new ItemStack(Blocks.DEADBUSH), 0.1f);
        GameRegistry.addSmelting(new ItemStack(TFBlocks.twilight_sapling, 1, 32767), new ItemStack(Blocks.DEADBUSH), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Blocks.SAPLING, 1, 32767), new ItemStack(Blocks.DEADBUSH), 0.1f);
        //Misc
        GameRegistry.addSmelting(new ItemStack(ModItems.RECORD_BLANK, 1, 32767), new ItemStack(Items.RECORD_11), 1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.MYSTERIOUS_RECORD, 1, 32767), new ItemStack(Items.RECORD_11), 1f);
        GameRegistry.addSmelting(new ItemStack(Blocks.JUKEBOX, 1, 32767), new ItemStack(Items.DIAMOND), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH, 1, 32767), new ItemStack(Items.LEATHER), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 32767), new ItemStack(Blocks.GLASS_PANE), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Blocks.STAINED_GLASS, 1, 32767), new ItemStack(Blocks.GLASS), 0.1f);
    }
}
