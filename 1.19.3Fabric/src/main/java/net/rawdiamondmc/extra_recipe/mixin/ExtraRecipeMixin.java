package net.rawdiamondmc.extra_recipe.mixin;

import net.rawdiamondmc.extra_recipe.ExtraRecipe;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExtraRecipeMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		ExtraRecipe.LOGGER.info("This line is printed by Extra Recipe mod mixin!");
	}
}
