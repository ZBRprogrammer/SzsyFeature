package com.zombromine.szsyfeature.datagen;

import com.zombromine.szsyfeature.elements.modBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class modRecipeProvider extends RecipeProvider {

    public modRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput,pRegistries);

    }

    @Override
    protected void buildRecipes(RecipeOutput output){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.dx_beacon.get(),1)
                .pattern("GGG")
                .pattern("GRG")
                .pattern("CCC")
                .define('G',Items.GLASS)
                .define('R',Items.WITHER_ROSE)
                .define('C',Items.CRYING_OBSIDIAN)
                .unlockedBy("has_glass",has(Items.GLASS))
                .unlockedBy("has_wither_rose",has(Items.WITHER_ROSE))
                .unlockedBy("has_crying_obsidian",has(Items.CRYING_OBSIDIAN))
                .save(output);
    }


}
