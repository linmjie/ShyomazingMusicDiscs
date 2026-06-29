package com.linmjie.shyomusic.datagen;

import com.linmjie.shyomusic.Shyomusic;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
    }


    //HELPER METHODS FOR STANDARDIZED RECIPE TYPES

    //PACKERS
    //ninePacker with default RecipeCategory.MISC and default "item_block" name for packed block
    protected static void ninePacker(RecipeOutput pRecipeOutput,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName) {
        ninePacker(pRecipeOutput, RecipeCategory.MISC, pUnpacked, pPacked,
                pUnpackedName, pUnpackedName + "_block");
    }
    //ninePacker with specified RecipeCategory and default "item_block" name for packed block
    protected static void ninePacker(RecipeOutput pRecipeOutput, RecipeCategory recipeCategory,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName) {
        ninePacker(pRecipeOutput, recipeCategory, pUnpacked, pPacked,
                pUnpackedName, pUnpackedName + "_block");
    }
    //ninePacker with default RecipeCategory.MISC & specified ids for unpacked and packed items
    protected static void ninePacker(RecipeOutput pRecipeOutput,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName, String pPackedName){
        ninePacker( pRecipeOutput, RecipeCategory.MISC, pUnpacked, pPacked,
                pUnpackedName, pPackedName);
    }
    protected static void ninePacker(RecipeOutput pRecipeOutput, RecipeCategory recipeCategory,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName, String pPackedName){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pPacked)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', pUnpacked)
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked))
                .save(pRecipeOutput, modPrefix() + pPackedName + "_from_" + pUnpackedName);
        ShapelessRecipeBuilder.shapeless(recipeCategory, pUnpacked, 9)
                .requires(pPacked)
                .unlockedBy(getHasName(pPacked), has(pPacked))
                .save(pRecipeOutput, modPrefix() + pUnpackedName + "_from_" + pPackedName);
    }

    protected static void fourPacker(RecipeOutput pRecipeOutput,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName) {
        fourPacker(pRecipeOutput, RecipeCategory.MISC, pUnpacked, pPacked,
                pUnpackedName, pUnpackedName + "_block");
    }
    //ninePacker with specified RecipeCategory and default "item_block" name for packed block
    protected static void fourPacker(RecipeOutput pRecipeOutput, RecipeCategory recipeCategory,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName) {
        fourPacker(pRecipeOutput, recipeCategory, pUnpacked, pPacked,
                pUnpackedName, pUnpackedName + "_block");
    }
    //ninePacker with default RecipeCategory.MISC & specified ids for unpacked and packed items
    protected static void fourPacker(RecipeOutput pRecipeOutput,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName, String pPackedName){
        fourPacker( pRecipeOutput, RecipeCategory.MISC, pUnpacked, pPacked,
                pUnpackedName, pPackedName);
    }
    protected static void fourPacker(RecipeOutput pRecipeOutput, RecipeCategory recipeCategory,
                                     ItemLike pUnpacked, ItemLike pPacked,
                                     String pUnpackedName, String pPackedName){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pPacked)
                .pattern("##")
                .pattern("##")
                .define('#', pUnpacked)
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked))
                .save(pRecipeOutput, modPrefix() + pPackedName + "_from_" + pUnpackedName);
        ShapelessRecipeBuilder.shapeless(recipeCategory, pUnpacked, 4)
                .requires(pPacked)
                .unlockedBy(getHasName(pPacked), has(pPacked))
                .save(pRecipeOutput, modPrefix() + pUnpackedName + "_from_" + pPackedName);
    }    

    //STANDARD TOOLS
    protected static void swordRecipe (RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike tool)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, tool)
                .pattern("#")
                .pattern("#")
                .pattern("I")
                .define('#', pMaterial)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void shovelRecipe (RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike tool)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, tool)
                .pattern("#")
                .pattern("I")
                .pattern("I")
                .define('#', pMaterial)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void pickaxeRecipe (RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike tool)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, tool)
                .pattern("###")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', pMaterial)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void axeRecipe (RecipeOutput pRecipeOutput,
                                      ItemLike pMaterial, ItemLike tool)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, tool)
                .pattern("##")
                .pattern("I#")
                .pattern("I ")
                .define('#', pMaterial)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void hoeRecipe (RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike tool)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, tool)
                .pattern("##")
                .pattern(" I")
                .pattern(" I")
                .define('#', pMaterial)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void helmetRecipe(RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike armor)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor)
                .pattern("###")
                .pattern("# #")
                .define('#', pMaterial)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void chestplateRecipe(RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike armor)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', pMaterial)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void leggingsRecipe(RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike armor)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', pMaterial)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }
    protected static void bootsRecipe(RecipeOutput pRecipeOutput,
                                       ItemLike pMaterial, ItemLike armor)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor)
                .pattern("# #")
                .pattern("# #")
                .define('#', pMaterial)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pRecipeOutput);
    }


    protected static String modPrefix(){
        return Shyomusic.MODID + ":";
    }
}
