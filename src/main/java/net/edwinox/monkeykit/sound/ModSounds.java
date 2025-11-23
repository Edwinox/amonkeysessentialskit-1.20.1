package net.edwinox.monkeykit.sound;

import net.edwinox.monkeykit.MonkeyKit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MonkeyKit.MOD_ID);

    public static final RegistryObject<SoundEvent> TIME_WASTE_BREAK = registerSoundEvents("time_waste_break");
    public static final RegistryObject<SoundEvent> TIME_WASTE_STEP = registerSoundEvents("time_waste_step");
    public static final RegistryObject<SoundEvent> TIME_WASTE_FALL = registerSoundEvents("time_waste_fall");
    public static final RegistryObject<SoundEvent> TIME_WASTE_PLACE = registerSoundEvents("time_waste_place");
    public static final RegistryObject<SoundEvent> TIME_WASTE_HIT = registerSoundEvents("time_waste_hit");


    public static final ForgeSoundType TIME_WASTE_SOUNDS = new ForgeSoundType(1f, 1f,
    ModSounds.TIME_WASTE_BREAK, ModSounds.TIME_WASTE_STEP, ModSounds.TIME_WASTE_FALL, ModSounds.TIME_WASTE_PLACE, ModSounds.TIME_WASTE_HIT);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MonkeyKit.MOD_ID, name)));
    }
    public static void register (IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
