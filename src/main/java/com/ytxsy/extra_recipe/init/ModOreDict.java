package com.ytxsy.extra_recipe.init;

import com.ytxsy.extra_recipe.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
    public static void init()
    {
        OreDictionary.registerOre("record", new ItemStack(ModItems.RECORD_BLANK, 1, 32767));
        OreDictionary.registerOre("WIPMatter", new ItemStack(ModItems.WIP_MATTER, 1, 32767));
    }
}