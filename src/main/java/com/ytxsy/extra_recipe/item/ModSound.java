package com.ytxsy.extra_recipe.item;

import net.minecraft.util.SoundEvent;
import thebetweenlands.common.sound.BLSoundEvent;
import java.util.ArrayList;
import java.util.List;

public class ModSound {
    public static final List<SoundEvent> SOUNDS = new ArrayList();
    public static final BLSoundEvent RECORD_BLANK = reg("record_blank");

    private ModSound() {
    }

    private static BLSoundEvent reg(String name) {
        BLSoundEvent event = new BLSoundEvent(name);
        SOUNDS.add(event);
        return event;
    }
}
