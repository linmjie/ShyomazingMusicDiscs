package com.linmjie.shyomusic.item;

import com.linmjie.shyomusic.Shyomusic;
import com.linmjie.shyomusic.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Shyomusic.MODID);

    public static final DeferredItem<Item> MUSIC_DISC_FRAGMENTS = ITEMS.registerSimpleItem("music_disc_fragments");

    public static final DeferredItem<Item> I_DO_MUSIC_DISC = ITEMS.register("i_do_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.I_DO_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> DRIFT_AWAY_MUSIC_DISC = ITEMS.register("drift_away_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DRIFT_AWAY_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> JAZZ_JAZZ_JAZZ_MUSIC_DISC = ITEMS.register("jazz_jazz_jazz_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.JAZZ_JAZZ_JAZZ_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> VIVACE_MUSIC_DISC = ITEMS.register("vivace_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.VIVACE_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
