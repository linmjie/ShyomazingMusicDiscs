package com.linmjie.shyomusic.sound;

import com.linmjie.shyomusic.Shyomusic;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, Shyomusic.MODID);

    public static final Supplier<SoundEvent> I_DO = registerSoundEvent("i_do");
    public static final ResourceKey<JukeboxSong> I_DO_KEY = createSong("i_do");

    public static final Supplier<SoundEvent> DRIFT_AWAY = registerSoundEvent("drift_away");
    public static final ResourceKey<JukeboxSong> DRIFT_AWAY_KEY = createSong("drift_away");

    public static final Supplier<SoundEvent> JAZZ_JAZZ_JAZZ = registerSoundEvent("jazz_jazz_jazz");
    public static final ResourceKey<JukeboxSong> JAZZ_JAZZ_JAZZ_KEY = createSong("jazz_jazz_jazz");

    public static final Supplier<SoundEvent> VIVACE = registerSoundEvent("vivace");
    public static final ResourceKey<JukeboxSong> VIVACE_KEY = createSong("vivace");

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(Shyomusic.MODID, name));
    }
    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Shyomusic.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
