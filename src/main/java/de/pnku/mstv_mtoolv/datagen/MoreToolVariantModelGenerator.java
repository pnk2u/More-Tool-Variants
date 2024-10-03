package de.pnku.mstv_mtoolv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

import static de.pnku.mstv_mtoolv.item.MoreToolVariantItems.*;

public class MoreToolVariantModelGenerator extends FabricModelProvider {
    public MoreToolVariantModelGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators toolItemModelGenerator) {
        for (Item axeItem : more_axes) {
            toolItemModelGenerator.generateFlatItem(axeItem, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (Item pickaxeItem : more_pickaxes) {
            toolItemModelGenerator.generateFlatItem(pickaxeItem, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (Item hoeItem : more_hoes) {
            toolItemModelGenerator.generateFlatItem(hoeItem, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (Item shovelItem : more_shovels) {
            toolItemModelGenerator.generateFlatItem(shovelItem, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (Item brushItem : more_brushes) {
            toolItemModelGenerator.generateFlatItem(brushItem, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
    }
}