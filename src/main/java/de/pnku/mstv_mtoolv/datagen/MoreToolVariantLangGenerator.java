package de.pnku.mstv_mtoolv.datagen;

import de.pnku.mstv_base.item.MoreStickVariantItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.apache.commons.text.WordUtils;

import java.util.concurrent.CompletableFuture;
import static de.pnku.mstv_mtoolv.item.MoreToolVariantItems.*;

public class MoreToolVariantLangGenerator extends FabricLanguageProvider {
    public MoreToolVariantLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (Item axeItem : more_axes) {
            Item stickItem = more_tool_sticks.get(axeItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            String toolTier = more_tiered_tool_tiernames.get(axeItem);
            String axeName = WordUtils.capitalizeFully(stickWood + " " + toolTier + " Axe");
            translationBuilder.add(axeItem, axeName);
        }
        for (Item pickaxeItem : more_pickaxes) {
            Item stickItem = more_tool_sticks.get(pickaxeItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            String toolTier = more_tiered_tool_tiernames.get(pickaxeItem);
            String pickaxeName = WordUtils.capitalizeFully(stickWood + " " + toolTier + " Pickaxe");
            translationBuilder.add(pickaxeItem, pickaxeName);
        }
        for (Item hoeItem : more_hoes) {
            Item stickItem = more_tool_sticks.get(hoeItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            String toolTier = more_tiered_tool_tiernames.get(hoeItem);
            String hoeName = WordUtils.capitalizeFully(stickWood + " " + toolTier + " Hoe");
            translationBuilder.add(hoeItem, hoeName);
        }
        for (Item shovelItem : more_shovels) {
            Item stickItem = more_tool_sticks.get(shovelItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            String toolTier = more_tiered_tool_tiernames.get(shovelItem);
            String shovelName = WordUtils.capitalizeFully(stickWood + " " + toolTier + " Shovel");
            translationBuilder.add(shovelItem, shovelName);
        }
        for (Item brushItem : more_brushes) {
            Item stickItem = more_tool_sticks.get(brushItem);
            String stickWood;
            if (stickItem.equals(Items.BAMBOO)) {stickWood = "bamboo";} else { stickWood = ((MoreStickVariantItem) stickItem).mstvWoodType;}
            String brushName = WordUtils.capitalizeFully(stickWood + " Brush");
            translationBuilder.add(brushItem, brushName);
        }
    }
}