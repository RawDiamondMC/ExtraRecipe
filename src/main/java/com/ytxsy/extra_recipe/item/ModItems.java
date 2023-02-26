package com.ytxsy.extra_recipe.item;

import net.minecraft.item.Item;
import thebetweenlands.common.item.misc.ItemBLRecord;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

//  public static final Item ABC_DEF_G = new ItemBase("abc_def_g");

    //Misc
    public static final Item RECORD_BLANK = new ItemBLRecord(ModSound.RECORD_BLANK, true);
    public static final Item WIP_MATTER = new ItemBase("wip_matter");
//    public static final Item TRANSFORMATION_TOOL = new ItemBase("transformation_tool");
}