package com.ytxsy.extra_recipe;

import com.ytxsy.extra_recipe.init.ModOreDict;
import com.ytxsy.extra_recipe.proxy.CommonProxy;
import com.ytxsy.extra_recipe.recipe.furnace.MinecraftFRecipes;
import com.ytxsy.extra_recipe.recipe.furnace.FRecipes;
import com.ytxsy.extra_recipe.recipe.furnace.RecordFRecipe;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION
)
public class ExtraRecipeMod {
    public static Logger logger;

    public static final boolean SHOW_WARN = true;

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
    public static CommonProxy proxy;

    @EventHandler
    public static void Init(FMLInitializationEvent event) {
        //SmeltRecipe
        FRecipes.init();
        RecordFRecipe.init();
        MinecraftFRecipes.init();

        ModOreDict.init();

        LogWarning("%s has finished its initializations", Reference.MODID);
    }

    public static void LogWarning(String str, Object... args) {
        if (SHOW_WARN) {
            logger.warn(String.format(str, args));
        }
    }

    public static void LogWarning(String str) {
        if (SHOW_WARN) {
            logger.warn(str);
        }
    }

    public static void Log(String str) {
//        if (ModConfig.GeneralConf.LOG_ON)
//        {
        logger.info(str);
//        }
    }

    public static void Log(String str, Object... args) {
//        if (ModConfig.GeneralConf.LOG_ON)
//        {
        logger.info(String.format(str, args));
//        }
    }
}