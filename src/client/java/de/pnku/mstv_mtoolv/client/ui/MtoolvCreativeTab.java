package de.pnku.mstv_mtoolv.client.ui;

import de.pnku.mstv_mtoolv.MoreToolVariants;
import de.pnku.mstv_mtoolv.item.MoreToolVariantItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.Collections;

import static de.pnku.mstv_mtoolv.MoreToolVariants.LOGGER;
import static de.pnku.mstv_mtoolv.item.MoreToolVariantItems.more_tools;

public class MtoolvCreativeTab extends CreativeModeTabs {

    public static CreativeModeTab TOOL_VARIANTS;

    public static final CreativeModeTab.Builder MTOOLV_CMT_BUILDER = FabricItemGroup.builder().title(Component.translatable("itemGroup.toolVariants")).icon(() -> new ItemStack(MoreToolVariantItems.WARPED_GOLDEN_PICKAXE)).displayItems(((displayContext, entries) -> {
        for (Item toolItem : more_tools)
        {
            entries.accept(toolItem);
        }
    }));

    public static void registerMtoolvCreativeTab() {
        TOOL_VARIANTS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MoreToolVariants.asId("tool_variants"), MTOOLV_CMT_BUILDER.build());
        LOGGER.info("Creative Mode Item Tab registered.");
    }
}