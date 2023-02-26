package com.ytxsy.extra_recipe.recipe.furnace;

import com.ytxsy.extra_recipe.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thebetweenlands.common.registries.ItemRegistry;

public class RecordFRecipe {
    public static void init(){
        //GameRegistry.addSmelting(new ItemStack(111.222, amount, meta), new ItemStack(111.222, amount, meta), 3f);
        //1=Items,Blocks... 2=Name 3=1234567890

        //Minecraft
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_13, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_CAT, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_BLOCKS, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_CHIRP, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_FAR, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_MALL, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_MELLOHI, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_STAL, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_STRAD, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_WARD, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(Items.RECORD_WAIT, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);

        //The Betweenlands
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.ASTATOS, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.BETWEEN_YOU_AND_ME, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.CHRISTMAS_ON_THE_MARSH, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.THE_EXPLORER, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.HAG_DANCE, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.LONELY_FIRE, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.ANCIENT, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.BENEATH_A_GREEN_SKY, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.DJ_WIGHTS_MIXTAPE, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 10f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.ONWARDS, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.STUCK_IN_THE_MUD, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.WANDERING_WISPS, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0.1f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.WATERLOGGED, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0f);
        GameRegistry.addSmelting(new ItemStack(ItemRegistry.DEEP_WATER_THEME, 1, 32767), new ItemStack(ModItems.RECORD_BLANK), 0f);
    }
}
