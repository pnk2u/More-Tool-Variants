package de.pnku.mstv_mtoolv.datagen;

import de.pnku.mstv_mtoolv.MoreToolVariants;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;
import static de.pnku.mstv_mtoolv.item.MoreToolVariantItems.*;

public class MoreToolVariantRecipeGenerator extends FabricRecipeProvider {
    public MoreToolVariantRecipeGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        for (Item axeItem : more_axes) {
            if (!more_netherite_tools.contains(axeItem)) {
            Item stickItem = more_tool_sticks.get(axeItem);
            Item toolIngredient = more_tiered_tool_ingredients.get(axeItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            String toolTier = more_tiered_tool_tiernames.get(axeItem);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axeItem)
                    .group(toolTier + "_axes")
                    .unlockedBy("has_axe_head_material", has(toolIngredient))
                    .define('/', stickItem)
                    .define('<', toolIngredient)
                    .pattern("<<")
                    .pattern("</")
                    .pattern(" /")
                    .save(exporter, MoreToolVariants.asId(stickWood + "_" + toolTier + "_axe"));
            }
        }
        for (Item pickaxeItem : more_pickaxes) {
            if (!more_netherite_tools.contains(pickaxeItem)) {
                Item stickItem = more_tool_sticks.get(pickaxeItem);
                Item toolIngredient = more_tiered_tool_ingredients.get(pickaxeItem);
                String stickWood;
                if (stickItem.equals(Items.BAMBOO)) {
                    stickWood = "bamboo";
                } else if (stickItem.equals(Items.STICK)) {
                    stickWood = "oak";
                } else {
                    stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;
                }
                String toolTier = more_tiered_tool_tiernames.get(pickaxeItem);
                ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxeItem)
                        .group(toolTier + "_pickaxes")
                        .unlockedBy("has_pickaxe_head_material", has(toolIngredient))
                        .define('/', stickItem)
                        .define('<', toolIngredient)
                        .pattern("<<<")
                        .pattern(" / ")
                        .pattern(" / ")
                        .save(exporter, MoreToolVariants.asId(stickWood + "_" + toolTier + "_pickaxe"));
            }
        }
        for (Item hoeItem : more_hoes) {
            if (!more_netherite_tools.contains(hoeItem)) {
                Item stickItem = more_tool_sticks.get(hoeItem);
                Item toolIngredient = more_tiered_tool_ingredients.get(hoeItem);
                String stickWood;
                if (stickItem.equals(Items.BAMBOO)) {
                    stickWood = "bamboo";
                } else if (stickItem.equals(Items.STICK)) {
                    stickWood = "oak";
                } else {
                    stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;
                }
                String toolTier = more_tiered_tool_tiernames.get(hoeItem);
                ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoeItem)
                        .group(toolTier + "_hoes")
                        .unlockedBy("has_hoe_head_material", has(toolIngredient))
                        .define('/', stickItem)
                        .define('<', toolIngredient)
                        .pattern("<<")
                        .pattern(" /")
                        .pattern(" /")
                        .save(exporter, MoreToolVariants.asId(stickWood + "_" + toolTier + "_hoe"));
            }
        }
        for (Item shovelItem : more_shovels) {
            if (!more_netherite_tools.contains(shovelItem)) {
                Item stickItem = more_tool_sticks.get(shovelItem);
                Item toolIngredient = more_tiered_tool_ingredients.get(shovelItem);
                String stickWood;
                if (stickItem.equals(Items.BAMBOO)) {
                    stickWood = "bamboo";
                } else if (stickItem.equals(Items.STICK)) {
                    stickWood = "oak";
                } else {
                    stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;
                }
                String toolTier = more_tiered_tool_tiernames.get(shovelItem);
                ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovelItem)
                        .group(toolTier + "_shovels")
                        .unlockedBy("has_shovel_blade_material", has(toolIngredient))
                        .define('/', stickItem)
                        .define('<', toolIngredient)
                        .pattern("<")
                        .pattern("/")
                        .pattern("/")
                        .save(exporter, MoreToolVariants.asId(stickWood + "_" + toolTier + "_shovel"));
            }
        }
        for (Item netheriteItem : more_netherite_tools) {
            Item toolIngredient = more_tiered_tool_ingredients.get(netheriteItem);
            netheriteSmithing(exporter, toolIngredient, RecipeCategory.TOOLS, netheriteItem);
        }
        for (Item brushItem : more_brushes) {
            Item stickItem = more_tool_sticks.get(brushItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, brushItem)
                    .group("brushes")
                    .unlockedBy("has_stick", has(stickItem))
                    .define('/', stickItem)
                    .define('C', Items.COPPER_INGOT)
                    .define('F', Items.FEATHER)
                    .pattern("F")
                    .pattern("C")
                    .pattern("/")
                    .save(exporter, MoreToolVariants.asId(stickWood + "_brush"));
        }

    }
}
