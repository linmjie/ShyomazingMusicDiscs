package com.linmjie.shyomusic.util;

import com.linmjie.shyomusic.Shyomusic;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Shyomusic.MODID, name));
        }
        private static TagKey<Block> createCommonTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BASIC_MUSIC_DISC = createTag("basic_music_disc");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Shyomusic.MODID, name));
        }

        private static TagKey<Item> createCommonTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
