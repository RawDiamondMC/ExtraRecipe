package com.ytxsy.extra_recipe.item;

import com.ytxsy.extra_recipe.ExtraRecipeMod;
import com.ytxsy.extra_recipe.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    private final String displayName;
    public ItemBase(String name) {
        displayName = "item." + name + ".desc";
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ExtraRecipeMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
