package net.rawdiamondmc.extra_recipe;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraRecipe implements ModInitializer {

	// an instance of our new item
	public static final Item record_blank = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	//LOGGER(in mixin)
	public static final Logger LOGGER = LoggerFactory.getLogger("extra_recipe");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("extra_recipe", "record_blank"), record_blank);
	}
}
