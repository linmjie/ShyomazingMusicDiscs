package com.linmjie.shyomusic.datagen;

import com.linmjie.shyomusic.Shyomusic;
import com.linmjie.shyomusic.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Shyomusic.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.MUSIC_DISC_FRAGMENTS.get());
        basicItem(ModItems.I_DO_MUSIC_DISC.get());
        basicItem(ModItems.DRIFT_AWAY_MUSIC_DISC.get());
        basicItem(ModItems.JAZZ_JAZZ_JAZZ_MUSIC_DISC.get());
        basicItem(ModItems.VIVACE_MUSIC_DISC.get());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Shyomusic.MODID,"item/" + item.getId().getPath()));
    }
}
