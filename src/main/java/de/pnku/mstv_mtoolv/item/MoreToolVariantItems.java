package de.pnku.mstv_mtoolv.item;

import de.pnku.mstv_base.item.MoreStickVariantItem;
import de.pnku.mstv_mtoolv.MoreToolVariants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.pnku.mstv_base.item.MoreStickVariantItems.*;


public class MoreToolVariantItems {

    // Regular Tiered Tools
        // Axes
            // TOOL: Wooden Axes
            public static final Item ACACIA_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item BAMBOO_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item BIRCH_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item CHERRY_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item CRIMSON_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item JUNGLE_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item MANGROVE_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item SPRUCE_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties());
            public static final Item WARPED_WOODEN_AXE = new AxeItem(Tiers.WOOD, 6.0F, -3.2F, new Item.Properties().fireResistant());
                // Stone Axes
                    // TOOL: Cobblestone Axes
                    public static final Item ACACIA_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item BAMBOO_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item BIRCH_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item CHERRY_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item CRIMSON_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item JUNGLE_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item MANGROVE_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item SPRUCE_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item WARPED_STONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().fireResistant());
                    // TOOL: Deepslate Axes
                    public static final Item ACACIA_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item BAMBOO_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item BIRCH_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item CHERRY_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item CRIMSON_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item JUNGLE_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item MANGROVE_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item OAK_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item SPRUCE_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item WARPED_DEEPSLATE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().fireResistant());
                    // TOOL: Blackstone Axes
                    public static final Item ACACIA_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item BAMBOO_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item BIRCH_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item CHERRY_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item CRIMSON_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item JUNGLE_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item MANGROVE_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item OAK_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item SPRUCE_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties());
                    public static final Item WARPED_BLACKSTONE_AXE = new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties().fireResistant());
            // TOOL: Golden Axes
            public static final Item ACACIA_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item BAMBOO_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item BIRCH_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item CHERRY_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item CRIMSON_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item JUNGLE_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item MANGROVE_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item SPRUCE_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties());
            public static final Item WARPED_GOLDEN_AXE = new AxeItem(Tiers.GOLD, 6.0F, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Iron Axes
            public static final Item ACACIA_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item BAMBOO_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item BIRCH_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item CHERRY_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item CRIMSON_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item JUNGLE_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item MANGROVE_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item SPRUCE_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties());
            public static final Item WARPED_IRON_AXE = new AxeItem(Tiers.IRON, 6.0F, -3.1F, new Item.Properties().fireResistant());
            // TOOL: Diamond Axes
            public static final Item ACACIA_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item BAMBOO_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item BIRCH_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item CHERRY_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item CRIMSON_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item JUNGLE_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item MANGROVE_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item SPRUCE_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties());
            public static final Item WARPED_DIAMOND_AXE = new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Netherite Axes
            public static final Item ACACIA_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item BAMBOO_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item BIRCH_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item CHERRY_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item CRIMSON_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item JUNGLE_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item MANGROVE_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item SPRUCE_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());
            public static final Item WARPED_NETHERITE_AXE = new AxeItem(Tiers.NETHERITE, 5.0F, -3.0F, new Item.Properties().fireResistant());



        // Pickaxes
            // TOOL: Wooden Pickaxes
            public static final Item ACACIA_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item BAMBOO_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item BIRCH_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item CHERRY_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item CRIMSON_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item JUNGLE_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item MANGROVE_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item SPRUCE_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties());
            public static final Item WARPED_WOODEN_PICKAXE = new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties().fireResistant());
                // Stone Pickaxes
                    // TOOL: Cobblestone Pickaxes
                    public static final Item ACACIA_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item BAMBOO_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item BIRCH_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item CHERRY_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item CRIMSON_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item JUNGLE_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item MANGROVE_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item SPRUCE_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item WARPED_STONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().fireResistant());
                    // TOOL: Deepslate Pickaxes
                    public static final Item ACACIA_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item BAMBOO_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item BIRCH_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item CHERRY_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item CRIMSON_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item JUNGLE_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item MANGROVE_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item OAK_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item SPRUCE_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item WARPED_DEEPSLATE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().fireResistant());
                    // TOOL: Blackstone Pickaxes
                    public static final Item ACACIA_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item BAMBOO_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item BIRCH_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item CHERRY_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item CRIMSON_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item JUNGLE_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item MANGROVE_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item OAK_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item SPRUCE_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties());
                    public static final Item WARPED_BLACKSTONE_PICKAXE = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().fireResistant());
            // TOOL: Golden Pickaxes
            public static final Item ACACIA_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item BAMBOO_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item BIRCH_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item CHERRY_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, (int) 1.0F, -2.8F, new Item.Properties());
            public static final Item CRIMSON_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item JUNGLE_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item MANGROVE_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item SPRUCE_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties());
            public static final Item WARPED_GOLDEN_PICKAXE = new PickaxeItem(Tiers.GOLD, 1, -2.8F, new Item.Properties().fireResistant());
            // TOOL: Iron Pickaxes
            public static final Item ACACIA_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item BAMBOO_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item BIRCH_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item CHERRY_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item CRIMSON_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item JUNGLE_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item MANGROVE_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item SPRUCE_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties());
            public static final Item WARPED_IRON_PICKAXE = new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().fireResistant());
            // TOOL: Diamond Pickaxes
            public static final Item ACACIA_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item BAMBOO_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item BIRCH_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item CHERRY_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item CRIMSON_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item JUNGLE_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item MANGROVE_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item SPRUCE_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
            public static final Item WARPED_DIAMOND_PICKAXE = new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties().fireResistant());
            // TOOL: Netherite Pickaxes
            public static final Item ACACIA_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item BAMBOO_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item BIRCH_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item CHERRY_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item CRIMSON_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item JUNGLE_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item MANGROVE_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item SPRUCE_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
            public static final Item WARPED_NETHERITE_PICKAXE = new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());



        // Hoes
            // TOOL: Wooden Hoes
            public static final Item ACACIA_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item BAMBOO_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item BIRCH_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item CHERRY_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item CRIMSON_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item JUNGLE_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item MANGROVE_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item SPRUCE_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties());
            public static final Item WARPED_WOODEN_HOE = new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties().fireResistant());
                // Stone Hoes
                    // TOOL: Cobblestone Hoes
                    public static final Item ACACIA_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item BAMBOO_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item BIRCH_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item CHERRY_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item CRIMSON_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item JUNGLE_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item MANGROVE_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item SPRUCE_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item WARPED_STONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties().fireResistant());
                    // TOOL: Deepslate Hoes
                    public static final Item ACACIA_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item BAMBOO_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item BIRCH_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item CHERRY_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item CRIMSON_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item JUNGLE_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item MANGROVE_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item OAK_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item SPRUCE_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item WARPED_DEEPSLATE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties().fireResistant());
                    // TOOL: Blackstone Hoes
                    public static final Item ACACIA_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item BAMBOO_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item BIRCH_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item CHERRY_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item CRIMSON_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item JUNGLE_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item MANGROVE_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item OAK_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item SPRUCE_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties());
                    public static final Item WARPED_BLACKSTONE_HOE = new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties().fireResistant());
            // TOOL: Golden Hoes
            public static final Item ACACIA_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item BAMBOO_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item BIRCH_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item CHERRY_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item CRIMSON_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item JUNGLE_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item MANGROVE_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item SPRUCE_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties());
            public static final Item WARPED_GOLDEN_HOE = new HoeItem(Tiers.GOLD, 0, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Iron Hoes
            public static final Item ACACIA_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item BAMBOO_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item BIRCH_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item CHERRY_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item CRIMSON_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item JUNGLE_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item MANGROVE_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item SPRUCE_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties());
            public static final Item WARPED_IRON_HOE = new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().fireResistant());
            // TOOL: Diamond Hoes
            public static final Item ACACIA_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item BAMBOO_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item BIRCH_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item CHERRY_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item CRIMSON_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item JUNGLE_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item MANGROVE_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item SPRUCE_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties());
            public static final Item WARPED_DIAMOND_HOE = new HoeItem(Tiers.DIAMOND, -3, 0.0F, new Item.Properties().fireResistant());
            // TOOL: Netherite Hoes
            public static final Item ACACIA_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item BAMBOO_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item BIRCH_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item CHERRY_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item CRIMSON_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item JUNGLE_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item MANGROVE_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item SPRUCE_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
            public static final Item WARPED_NETHERITE_HOE = new HoeItem(Tiers.NETHERITE, -4, 0.0F, new Item.Properties().fireResistant());
        // Shovels
            // TOOL: Wooden Shovels
            public static final Item ACACIA_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item BAMBOO_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item BIRCH_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item CHERRY_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item CRIMSON_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item JUNGLE_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item MANGROVE_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item SPRUCE_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties());
            public static final Item WARPED_WOODEN_SHOVEL = new ShovelItem(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties().fireResistant());
                // Stone Shovels
                    // TOOL: Cobblestone Shovels
                    public static final Item ACACIA_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item BAMBOO_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item BIRCH_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item CHERRY_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item CRIMSON_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item JUNGLE_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item MANGROVE_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item SPRUCE_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item WARPED_STONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().fireResistant());
                    // TOOL: Deepslate Shovels
                    public static final Item ACACIA_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item BAMBOO_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item BIRCH_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item CHERRY_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item CRIMSON_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item JUNGLE_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item MANGROVE_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item OAK_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item SPRUCE_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item WARPED_DEEPSLATE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().fireResistant());
                    // TOOL: Blackstone Shovels
                    public static final Item ACACIA_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item BAMBOO_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item BIRCH_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item CHERRY_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item CRIMSON_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().fireResistant());
                    public static final Item DARK_OAK_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item JUNGLE_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item MANGROVE_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item OAK_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item SPRUCE_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties());
                    public static final Item WARPED_BLACKSTONE_SHOVEL = new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Golden Shovels
            public static final Item ACACIA_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item BAMBOO_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item BIRCH_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item CHERRY_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item CRIMSON_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item JUNGLE_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item MANGROVE_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item SPRUCE_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties());
            public static final Item WARPED_GOLDEN_SHOVEL = new ShovelItem(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Iron Shovels
            public static final Item ACACIA_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item BAMBOO_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item BIRCH_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item CHERRY_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item CRIMSON_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item JUNGLE_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item MANGROVE_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item SPRUCE_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties());
            public static final Item WARPED_IRON_SHOVEL = new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Diamond Shovels
            public static final Item ACACIA_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item BAMBOO_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item BIRCH_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item CHERRY_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item CRIMSON_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item JUNGLE_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item MANGROVE_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item SPRUCE_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties());
            public static final Item WARPED_DIAMOND_SHOVEL = new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().fireResistant());
            // TOOL: Netherite Shovels
            public static final Item ACACIA_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item BAMBOO_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item BIRCH_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item CHERRY_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item CRIMSON_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item DARK_OAK_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item JUNGLE_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item MANGROVE_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item SPRUCE_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            public static final Item WARPED_NETHERITE_SHOVEL = new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().fireResistant());
            
        // Brushes
            public static final Item ACACIA_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item BAMBOO_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item BIRCH_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item CHERRY_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item CRIMSON_BRUSH = new BrushItem((new Item.Properties()).durability(64).fireResistant());
            public static final Item DARK_OAK_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item JUNGLE_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item MANGROVE_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item SPRUCE_BRUSH = new BrushItem((new Item.Properties()).durability(64));
            public static final Item WARPED_BRUSH = new BrushItem((new Item.Properties()).durability(64).fireResistant());

    public static final List<Item> more_tools = new ArrayList<>();
    public static final List<Item> more_axes = new ArrayList<>();
    public static final List<Item> more_pickaxes = new ArrayList<>();
    public static final List<Item> more_hoes = new ArrayList<>();
    public static final List<Item> more_shovels = new ArrayList<>();
    public static final List<Item> more_brushes = new ArrayList<>();
    public static final List<Item> more_netherite_tools = new ArrayList<>();
    public static final Map<Item, Item> more_tool_sticks = new HashMap<>();
    public static final Map<Item, Item> more_tiered_tool_ingredients = new HashMap<>();
    public static final Map<Item, String> more_tiered_tool_tiernames = new HashMap<>();

    public static void registerToolItems() {

      //Acacia Tools
        registerShovelItem(ACACIA_WOODEN_SHOVEL, ACACIA_STICK, Items.ACACIA_PLANKS, "wooden");
        registerPickaxeItem(ACACIA_WOODEN_PICKAXE, ACACIA_STICK, Items.ACACIA_PLANKS, "wooden");
        registerAxeItem(ACACIA_WOODEN_AXE, ACACIA_STICK, Items.ACACIA_PLANKS, "wooden");
        registerHoeItem(ACACIA_WOODEN_HOE, ACACIA_STICK, Items.ACACIA_PLANKS, "wooden");
        registerShovelItem(ACACIA_STONE_SHOVEL, ACACIA_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(ACACIA_STONE_PICKAXE, ACACIA_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(ACACIA_STONE_AXE, ACACIA_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(ACACIA_STONE_HOE, ACACIA_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(ACACIA_DEEPSLATE_SHOVEL, ACACIA_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(ACACIA_DEEPSLATE_PICKAXE, ACACIA_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(ACACIA_DEEPSLATE_AXE, ACACIA_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(ACACIA_DEEPSLATE_HOE, ACACIA_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(ACACIA_BLACKSTONE_SHOVEL, ACACIA_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(ACACIA_BLACKSTONE_PICKAXE, ACACIA_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(ACACIA_BLACKSTONE_AXE, ACACIA_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(ACACIA_BLACKSTONE_HOE, ACACIA_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(ACACIA_IRON_SHOVEL, ACACIA_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(ACACIA_IRON_PICKAXE, ACACIA_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(ACACIA_IRON_AXE, ACACIA_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(ACACIA_IRON_HOE, ACACIA_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(ACACIA_GOLDEN_SHOVEL, ACACIA_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(ACACIA_GOLDEN_PICKAXE, ACACIA_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(ACACIA_GOLDEN_AXE, ACACIA_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(ACACIA_GOLDEN_HOE, ACACIA_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(ACACIA_DIAMOND_SHOVEL, ACACIA_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(ACACIA_DIAMOND_PICKAXE, ACACIA_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(ACACIA_DIAMOND_AXE, ACACIA_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(ACACIA_DIAMOND_HOE, ACACIA_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(ACACIA_NETHERITE_SHOVEL, ACACIA_STICK, ACACIA_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(ACACIA_NETHERITE_PICKAXE, ACACIA_STICK, ACACIA_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(ACACIA_NETHERITE_AXE, ACACIA_STICK, ACACIA_DIAMOND_AXE, "netherite");
        registerHoeItem(ACACIA_NETHERITE_HOE, ACACIA_STICK, ACACIA_DIAMOND_HOE, "netherite");
        registerBrushItem(ACACIA_BRUSH, ACACIA_STICK);

      //Bamboo Tools
        registerShovelItem(BAMBOO_WOODEN_SHOVEL, Items.BAMBOO, Items.BAMBOO_PLANKS, "wooden");
        registerPickaxeItem(BAMBOO_WOODEN_PICKAXE, Items.BAMBOO, Items.BAMBOO_PLANKS, "wooden");
        registerAxeItem(BAMBOO_WOODEN_AXE, Items.BAMBOO, Items.BAMBOO_PLANKS, "wooden");
        registerHoeItem(BAMBOO_WOODEN_HOE, Items.BAMBOO, Items.BAMBOO_PLANKS, "wooden");
        registerShovelItem(BAMBOO_STONE_SHOVEL, Items.BAMBOO, Items.COBBLESTONE, "stone");
        registerPickaxeItem(BAMBOO_STONE_PICKAXE, Items.BAMBOO, Items.COBBLESTONE, "stone");
        registerAxeItem(BAMBOO_STONE_AXE, Items.BAMBOO, Items.COBBLESTONE, "stone");
        registerHoeItem(BAMBOO_STONE_HOE, Items.BAMBOO, Items.COBBLESTONE, "stone");
        registerShovelItem(BAMBOO_DEEPSLATE_SHOVEL, Items.BAMBOO, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(BAMBOO_DEEPSLATE_PICKAXE, Items.BAMBOO, Items.DEEPSLATE, "deepslate");
        registerAxeItem(BAMBOO_DEEPSLATE_AXE, Items.BAMBOO, Items.DEEPSLATE, "deepslate");
        registerHoeItem(BAMBOO_DEEPSLATE_HOE, Items.BAMBOO, Items.DEEPSLATE, "deepslate");
        registerShovelItem(BAMBOO_BLACKSTONE_SHOVEL, Items.BAMBOO, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(BAMBOO_BLACKSTONE_PICKAXE, Items.BAMBOO, Items.BLACKSTONE, "blackstone");
        registerAxeItem(BAMBOO_BLACKSTONE_AXE, Items.BAMBOO, Items.BLACKSTONE, "blackstone");
        registerHoeItem(BAMBOO_BLACKSTONE_HOE, Items.BAMBOO, Items.BLACKSTONE, "blackstone");
        registerShovelItem(BAMBOO_IRON_SHOVEL, Items.BAMBOO, Items.IRON_INGOT, "iron");
        registerPickaxeItem(BAMBOO_IRON_PICKAXE, Items.BAMBOO, Items.IRON_INGOT, "iron");
        registerAxeItem(BAMBOO_IRON_AXE, Items.BAMBOO, Items.IRON_INGOT, "iron");
        registerHoeItem(BAMBOO_IRON_HOE, Items.BAMBOO, Items.IRON_INGOT, "iron");
        registerShovelItem(BAMBOO_GOLDEN_SHOVEL, Items.BAMBOO, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(BAMBOO_GOLDEN_PICKAXE, Items.BAMBOO, Items.GOLD_INGOT, "golden");
        registerAxeItem(BAMBOO_GOLDEN_AXE, Items.BAMBOO, Items.GOLD_INGOT, "golden");
        registerHoeItem(BAMBOO_GOLDEN_HOE, Items.BAMBOO, Items.GOLD_INGOT, "golden");
        registerShovelItem(BAMBOO_DIAMOND_SHOVEL, Items.BAMBOO, Items.DIAMOND, "diamond");
        registerPickaxeItem(BAMBOO_DIAMOND_PICKAXE, Items.BAMBOO, Items.DIAMOND, "diamond");
        registerAxeItem(BAMBOO_DIAMOND_AXE, Items.BAMBOO, Items.DIAMOND, "diamond");
        registerHoeItem(BAMBOO_DIAMOND_HOE, Items.BAMBOO, Items.DIAMOND, "diamond");
        registerShovelItem(BAMBOO_NETHERITE_SHOVEL, Items.BAMBOO, BAMBOO_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(BAMBOO_NETHERITE_PICKAXE, Items.BAMBOO, BAMBOO_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(BAMBOO_NETHERITE_AXE, Items.BAMBOO, BAMBOO_DIAMOND_AXE, "netherite");
        registerHoeItem(BAMBOO_NETHERITE_HOE, Items.BAMBOO, BAMBOO_DIAMOND_HOE, "netherite");
        registerBrushItem(BAMBOO_BRUSH, Items.BAMBOO);

      //Birch Tools
        registerShovelItem(BIRCH_WOODEN_SHOVEL, BIRCH_STICK, Items.BIRCH_PLANKS, "wooden");
        registerPickaxeItem(BIRCH_WOODEN_PICKAXE, BIRCH_STICK, Items.BIRCH_PLANKS, "wooden");
        registerAxeItem(BIRCH_WOODEN_AXE, BIRCH_STICK, Items.BIRCH_PLANKS, "wooden");
        registerHoeItem(BIRCH_WOODEN_HOE, BIRCH_STICK, Items.BIRCH_PLANKS, "wooden");
        registerShovelItem(BIRCH_STONE_SHOVEL, BIRCH_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(BIRCH_STONE_PICKAXE, BIRCH_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(BIRCH_STONE_AXE, BIRCH_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(BIRCH_STONE_HOE, BIRCH_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(BIRCH_DEEPSLATE_SHOVEL, BIRCH_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(BIRCH_DEEPSLATE_PICKAXE, BIRCH_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(BIRCH_DEEPSLATE_AXE, BIRCH_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(BIRCH_DEEPSLATE_HOE, BIRCH_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(BIRCH_BLACKSTONE_SHOVEL, BIRCH_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(BIRCH_BLACKSTONE_PICKAXE, BIRCH_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(BIRCH_BLACKSTONE_AXE, BIRCH_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(BIRCH_BLACKSTONE_HOE, BIRCH_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(BIRCH_IRON_SHOVEL, BIRCH_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(BIRCH_IRON_PICKAXE, BIRCH_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(BIRCH_IRON_AXE, BIRCH_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(BIRCH_IRON_HOE, BIRCH_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(BIRCH_GOLDEN_SHOVEL, BIRCH_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(BIRCH_GOLDEN_PICKAXE, BIRCH_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(BIRCH_GOLDEN_AXE, BIRCH_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(BIRCH_GOLDEN_HOE, BIRCH_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(BIRCH_DIAMOND_SHOVEL, BIRCH_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(BIRCH_DIAMOND_PICKAXE, BIRCH_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(BIRCH_DIAMOND_AXE, BIRCH_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(BIRCH_DIAMOND_HOE, BIRCH_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(BIRCH_NETHERITE_SHOVEL, BIRCH_STICK, BIRCH_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(BIRCH_NETHERITE_PICKAXE, BIRCH_STICK, BIRCH_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(BIRCH_NETHERITE_AXE, BIRCH_STICK, BIRCH_DIAMOND_AXE, "netherite");
        registerHoeItem(BIRCH_NETHERITE_HOE, BIRCH_STICK, BIRCH_DIAMOND_HOE, "netherite");
        registerBrushItem(BIRCH_BRUSH, BIRCH_STICK);

      //Cherry Tools
        registerShovelItem(CHERRY_WOODEN_SHOVEL, CHERRY_STICK, Items.CHERRY_PLANKS, "wooden");
        registerPickaxeItem(CHERRY_WOODEN_PICKAXE, CHERRY_STICK, Items.CHERRY_PLANKS, "wooden");
        registerAxeItem(CHERRY_WOODEN_AXE, CHERRY_STICK, Items.CHERRY_PLANKS, "wooden");
        registerHoeItem(CHERRY_WOODEN_HOE, CHERRY_STICK, Items.CHERRY_PLANKS, "wooden");
        registerShovelItem(CHERRY_STONE_SHOVEL, CHERRY_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(CHERRY_STONE_PICKAXE, CHERRY_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(CHERRY_STONE_AXE, CHERRY_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(CHERRY_STONE_HOE, CHERRY_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(CHERRY_DEEPSLATE_SHOVEL, CHERRY_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(CHERRY_DEEPSLATE_PICKAXE, CHERRY_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(CHERRY_DEEPSLATE_AXE, CHERRY_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(CHERRY_DEEPSLATE_HOE, CHERRY_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(CHERRY_BLACKSTONE_SHOVEL, CHERRY_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(CHERRY_BLACKSTONE_PICKAXE, CHERRY_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(CHERRY_BLACKSTONE_AXE, CHERRY_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(CHERRY_BLACKSTONE_HOE, CHERRY_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(CHERRY_IRON_SHOVEL, CHERRY_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(CHERRY_IRON_PICKAXE, CHERRY_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(CHERRY_IRON_AXE, CHERRY_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(CHERRY_IRON_HOE, CHERRY_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(CHERRY_GOLDEN_SHOVEL, CHERRY_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(CHERRY_GOLDEN_PICKAXE, CHERRY_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(CHERRY_GOLDEN_AXE, CHERRY_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(CHERRY_GOLDEN_HOE, CHERRY_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(CHERRY_DIAMOND_SHOVEL, CHERRY_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(CHERRY_DIAMOND_PICKAXE, CHERRY_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(CHERRY_DIAMOND_AXE, CHERRY_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(CHERRY_DIAMOND_HOE, CHERRY_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(CHERRY_NETHERITE_SHOVEL, CHERRY_STICK, CHERRY_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(CHERRY_NETHERITE_PICKAXE, CHERRY_STICK, CHERRY_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(CHERRY_NETHERITE_AXE, CHERRY_STICK, CHERRY_DIAMOND_AXE, "netherite");
        registerHoeItem(CHERRY_NETHERITE_HOE, CHERRY_STICK, CHERRY_DIAMOND_HOE, "netherite");
        registerBrushItem(CHERRY_BRUSH, CHERRY_STICK);

      //Crimson Tools
        registerShovelItem(CRIMSON_WOODEN_SHOVEL, CRIMSON_STICK, Items.CRIMSON_PLANKS, "wooden");
        registerPickaxeItem(CRIMSON_WOODEN_PICKAXE, CRIMSON_STICK, Items.CRIMSON_PLANKS, "wooden");
        registerAxeItem(CRIMSON_WOODEN_AXE, CRIMSON_STICK, Items.CRIMSON_PLANKS, "wooden");
        registerHoeItem(CRIMSON_WOODEN_HOE, CRIMSON_STICK, Items.CRIMSON_PLANKS, "wooden");
        registerShovelItem(CRIMSON_STONE_SHOVEL, CRIMSON_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(CRIMSON_STONE_PICKAXE, CRIMSON_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(CRIMSON_STONE_AXE, CRIMSON_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(CRIMSON_STONE_HOE, CRIMSON_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(CRIMSON_DEEPSLATE_SHOVEL, CRIMSON_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(CRIMSON_DEEPSLATE_PICKAXE, CRIMSON_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(CRIMSON_DEEPSLATE_AXE, CRIMSON_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(CRIMSON_DEEPSLATE_HOE, CRIMSON_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(CRIMSON_BLACKSTONE_SHOVEL, CRIMSON_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(CRIMSON_BLACKSTONE_PICKAXE, CRIMSON_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(CRIMSON_BLACKSTONE_AXE, CRIMSON_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(CRIMSON_BLACKSTONE_HOE, CRIMSON_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(CRIMSON_IRON_SHOVEL, CRIMSON_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(CRIMSON_IRON_PICKAXE, CRIMSON_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(CRIMSON_IRON_AXE, CRIMSON_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(CRIMSON_IRON_HOE, CRIMSON_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(CRIMSON_GOLDEN_SHOVEL, CRIMSON_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(CRIMSON_GOLDEN_PICKAXE, CRIMSON_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(CRIMSON_GOLDEN_AXE, CRIMSON_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(CRIMSON_GOLDEN_HOE, CRIMSON_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(CRIMSON_DIAMOND_SHOVEL, CRIMSON_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(CRIMSON_DIAMOND_PICKAXE, CRIMSON_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(CRIMSON_DIAMOND_AXE, CRIMSON_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(CRIMSON_DIAMOND_HOE, CRIMSON_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(CRIMSON_NETHERITE_SHOVEL, CRIMSON_STICK, CRIMSON_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(CRIMSON_NETHERITE_PICKAXE, CRIMSON_STICK, CRIMSON_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(CRIMSON_NETHERITE_AXE, CRIMSON_STICK, CRIMSON_DIAMOND_AXE, "netherite");
        registerHoeItem(CRIMSON_NETHERITE_HOE, CRIMSON_STICK, CRIMSON_DIAMOND_HOE, "netherite");
        registerBrushItem(CRIMSON_BRUSH, CRIMSON_STICK);

      //Dark_oak Tools
        registerShovelItem(DARK_OAK_WOODEN_SHOVEL, DARK_OAK_STICK, Items.DARK_OAK_PLANKS, "wooden");
        registerPickaxeItem(DARK_OAK_WOODEN_PICKAXE, DARK_OAK_STICK, Items.DARK_OAK_PLANKS, "wooden");
        registerAxeItem(DARK_OAK_WOODEN_AXE, DARK_OAK_STICK, Items.DARK_OAK_PLANKS, "wooden");
        registerHoeItem(DARK_OAK_WOODEN_HOE, DARK_OAK_STICK, Items.DARK_OAK_PLANKS, "wooden");
        registerShovelItem(DARK_OAK_STONE_SHOVEL, DARK_OAK_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(DARK_OAK_STONE_PICKAXE, DARK_OAK_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(DARK_OAK_STONE_AXE, DARK_OAK_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(DARK_OAK_STONE_HOE, DARK_OAK_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(DARK_OAK_DEEPSLATE_SHOVEL, DARK_OAK_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(DARK_OAK_DEEPSLATE_PICKAXE, DARK_OAK_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(DARK_OAK_DEEPSLATE_AXE, DARK_OAK_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(DARK_OAK_DEEPSLATE_HOE, DARK_OAK_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(DARK_OAK_BLACKSTONE_SHOVEL, DARK_OAK_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(DARK_OAK_BLACKSTONE_PICKAXE, DARK_OAK_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(DARK_OAK_BLACKSTONE_AXE, DARK_OAK_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(DARK_OAK_BLACKSTONE_HOE, DARK_OAK_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(DARK_OAK_IRON_SHOVEL, DARK_OAK_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(DARK_OAK_IRON_PICKAXE, DARK_OAK_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(DARK_OAK_IRON_AXE, DARK_OAK_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(DARK_OAK_IRON_HOE, DARK_OAK_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(DARK_OAK_GOLDEN_SHOVEL, DARK_OAK_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(DARK_OAK_GOLDEN_PICKAXE, DARK_OAK_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(DARK_OAK_GOLDEN_AXE, DARK_OAK_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(DARK_OAK_GOLDEN_HOE, DARK_OAK_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(DARK_OAK_DIAMOND_SHOVEL, DARK_OAK_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(DARK_OAK_DIAMOND_PICKAXE, DARK_OAK_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(DARK_OAK_DIAMOND_AXE, DARK_OAK_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(DARK_OAK_DIAMOND_HOE, DARK_OAK_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(DARK_OAK_NETHERITE_SHOVEL, DARK_OAK_STICK, DARK_OAK_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(DARK_OAK_NETHERITE_PICKAXE, DARK_OAK_STICK, DARK_OAK_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(DARK_OAK_NETHERITE_AXE, DARK_OAK_STICK, DARK_OAK_DIAMOND_AXE, "netherite");
        registerHoeItem(DARK_OAK_NETHERITE_HOE, DARK_OAK_STICK, DARK_OAK_DIAMOND_HOE, "netherite");
        registerBrushItem(DARK_OAK_BRUSH, DARK_OAK_STICK);

      //Jungle Tools
        registerShovelItem(JUNGLE_WOODEN_SHOVEL, JUNGLE_STICK, Items.JUNGLE_PLANKS, "wooden");
        registerPickaxeItem(JUNGLE_WOODEN_PICKAXE, JUNGLE_STICK, Items.JUNGLE_PLANKS, "wooden");
        registerAxeItem(JUNGLE_WOODEN_AXE, JUNGLE_STICK, Items.JUNGLE_PLANKS, "wooden");
        registerHoeItem(JUNGLE_WOODEN_HOE, JUNGLE_STICK, Items.JUNGLE_PLANKS, "wooden");
        registerShovelItem(JUNGLE_STONE_SHOVEL, JUNGLE_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(JUNGLE_STONE_PICKAXE, JUNGLE_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(JUNGLE_STONE_AXE, JUNGLE_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(JUNGLE_STONE_HOE, JUNGLE_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(JUNGLE_DEEPSLATE_SHOVEL, JUNGLE_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(JUNGLE_DEEPSLATE_PICKAXE, JUNGLE_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(JUNGLE_DEEPSLATE_AXE, JUNGLE_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(JUNGLE_DEEPSLATE_HOE, JUNGLE_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(JUNGLE_BLACKSTONE_SHOVEL, JUNGLE_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(JUNGLE_BLACKSTONE_PICKAXE, JUNGLE_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(JUNGLE_BLACKSTONE_AXE, JUNGLE_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(JUNGLE_BLACKSTONE_HOE, JUNGLE_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(JUNGLE_IRON_SHOVEL, JUNGLE_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(JUNGLE_IRON_PICKAXE, JUNGLE_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(JUNGLE_IRON_AXE, JUNGLE_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(JUNGLE_IRON_HOE, JUNGLE_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(JUNGLE_GOLDEN_SHOVEL, JUNGLE_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(JUNGLE_GOLDEN_PICKAXE, JUNGLE_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(JUNGLE_GOLDEN_AXE, JUNGLE_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(JUNGLE_GOLDEN_HOE, JUNGLE_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(JUNGLE_DIAMOND_SHOVEL, JUNGLE_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(JUNGLE_DIAMOND_PICKAXE, JUNGLE_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(JUNGLE_DIAMOND_AXE, JUNGLE_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(JUNGLE_DIAMOND_HOE, JUNGLE_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(JUNGLE_NETHERITE_SHOVEL, JUNGLE_STICK, JUNGLE_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(JUNGLE_NETHERITE_PICKAXE, JUNGLE_STICK, JUNGLE_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(JUNGLE_NETHERITE_AXE, JUNGLE_STICK, JUNGLE_DIAMOND_AXE, "netherite");
        registerHoeItem(JUNGLE_NETHERITE_HOE, JUNGLE_STICK, JUNGLE_DIAMOND_HOE, "netherite");
        registerBrushItem(JUNGLE_BRUSH, JUNGLE_STICK);

      //Mangrove Tools
        registerShovelItem(MANGROVE_WOODEN_SHOVEL, MANGROVE_STICK, Items.MANGROVE_PLANKS, "wooden");
        registerPickaxeItem(MANGROVE_WOODEN_PICKAXE, MANGROVE_STICK, Items.MANGROVE_PLANKS, "wooden");
        registerAxeItem(MANGROVE_WOODEN_AXE, MANGROVE_STICK, Items.MANGROVE_PLANKS, "wooden");
        registerHoeItem(MANGROVE_WOODEN_HOE, MANGROVE_STICK, Items.MANGROVE_PLANKS, "wooden");
        registerShovelItem(MANGROVE_STONE_SHOVEL, MANGROVE_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(MANGROVE_STONE_PICKAXE, MANGROVE_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(MANGROVE_STONE_AXE, MANGROVE_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(MANGROVE_STONE_HOE, MANGROVE_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(MANGROVE_DEEPSLATE_SHOVEL, MANGROVE_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(MANGROVE_DEEPSLATE_PICKAXE, MANGROVE_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(MANGROVE_DEEPSLATE_AXE, MANGROVE_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(MANGROVE_DEEPSLATE_HOE, MANGROVE_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(MANGROVE_BLACKSTONE_SHOVEL, MANGROVE_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(MANGROVE_BLACKSTONE_PICKAXE, MANGROVE_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(MANGROVE_BLACKSTONE_AXE, MANGROVE_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(MANGROVE_BLACKSTONE_HOE, MANGROVE_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(MANGROVE_IRON_SHOVEL, MANGROVE_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(MANGROVE_IRON_PICKAXE, MANGROVE_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(MANGROVE_IRON_AXE, MANGROVE_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(MANGROVE_IRON_HOE, MANGROVE_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(MANGROVE_GOLDEN_SHOVEL, MANGROVE_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(MANGROVE_GOLDEN_PICKAXE, MANGROVE_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(MANGROVE_GOLDEN_AXE, MANGROVE_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(MANGROVE_GOLDEN_HOE, MANGROVE_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(MANGROVE_DIAMOND_SHOVEL, MANGROVE_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(MANGROVE_DIAMOND_PICKAXE, MANGROVE_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(MANGROVE_DIAMOND_AXE, MANGROVE_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(MANGROVE_DIAMOND_HOE, MANGROVE_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(MANGROVE_NETHERITE_SHOVEL, MANGROVE_STICK, MANGROVE_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(MANGROVE_NETHERITE_PICKAXE, MANGROVE_STICK, MANGROVE_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(MANGROVE_NETHERITE_AXE, MANGROVE_STICK, MANGROVE_DIAMOND_AXE, "netherite");
        registerHoeItem(MANGROVE_NETHERITE_HOE, MANGROVE_STICK, MANGROVE_DIAMOND_HOE, "netherite");
        registerBrushItem(MANGROVE_BRUSH, MANGROVE_STICK);

      //Oak Tools
        more_tools.add(Items.WOODEN_SHOVEL);
        more_tools.add(Items.WOODEN_PICKAXE);
        more_tools.add(Items.WOODEN_AXE);
        more_tools.add(Items.WOODEN_HOE);
        more_tools.add(Items.STONE_SHOVEL);
        more_tools.add(Items.STONE_PICKAXE);
        more_tools.add(Items.STONE_AXE);
        more_tools.add(Items.STONE_HOE);
        registerShovelItem(OAK_DEEPSLATE_SHOVEL, Items.STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(OAK_DEEPSLATE_PICKAXE, Items.STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(OAK_DEEPSLATE_AXE, Items.STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(OAK_DEEPSLATE_HOE, Items.STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(OAK_BLACKSTONE_SHOVEL, Items.STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(OAK_BLACKSTONE_PICKAXE, Items.STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(OAK_BLACKSTONE_AXE, Items.STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(OAK_BLACKSTONE_HOE, Items.STICK, Items.BLACKSTONE, "blackstone");
        more_tools.add(Items.IRON_SHOVEL);
        more_tools.add(Items.IRON_PICKAXE);
        more_tools.add(Items.IRON_AXE);
        more_tools.add(Items.IRON_HOE);
        more_tools.add(Items.GOLDEN_SHOVEL);
        more_tools.add(Items.GOLDEN_PICKAXE);
        more_tools.add(Items.GOLDEN_AXE);
        more_tools.add(Items.GOLDEN_HOE);
        more_tools.add(Items.DIAMOND_SHOVEL);
        more_tools.add(Items.DIAMOND_PICKAXE);
        more_tools.add(Items.DIAMOND_AXE);
        more_tools.add(Items.DIAMOND_HOE);
        more_tools.add(Items.NETHERITE_SHOVEL);
        more_tools.add(Items.NETHERITE_PICKAXE);
        more_tools.add(Items.NETHERITE_AXE);
        more_tools.add(Items.NETHERITE_HOE);
        more_tools.add(Items.BRUSH);

      //Spruce Tools
        registerShovelItem(SPRUCE_WOODEN_SHOVEL, SPRUCE_STICK, Items.SPRUCE_PLANKS, "wooden");
        registerPickaxeItem(SPRUCE_WOODEN_PICKAXE, SPRUCE_STICK, Items.SPRUCE_PLANKS, "wooden");
        registerAxeItem(SPRUCE_WOODEN_AXE, SPRUCE_STICK, Items.SPRUCE_PLANKS, "wooden");
        registerHoeItem(SPRUCE_WOODEN_HOE, SPRUCE_STICK, Items.SPRUCE_PLANKS, "wooden");
        registerShovelItem(SPRUCE_STONE_SHOVEL, SPRUCE_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(SPRUCE_STONE_PICKAXE, SPRUCE_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(SPRUCE_STONE_AXE, SPRUCE_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(SPRUCE_STONE_HOE, SPRUCE_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(SPRUCE_DEEPSLATE_SHOVEL, SPRUCE_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(SPRUCE_DEEPSLATE_PICKAXE, SPRUCE_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(SPRUCE_DEEPSLATE_AXE, SPRUCE_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(SPRUCE_DEEPSLATE_HOE, SPRUCE_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(SPRUCE_BLACKSTONE_SHOVEL, SPRUCE_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(SPRUCE_BLACKSTONE_PICKAXE, SPRUCE_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(SPRUCE_BLACKSTONE_AXE, SPRUCE_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(SPRUCE_BLACKSTONE_HOE, SPRUCE_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(SPRUCE_IRON_SHOVEL, SPRUCE_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(SPRUCE_IRON_PICKAXE, SPRUCE_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(SPRUCE_IRON_AXE, SPRUCE_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(SPRUCE_IRON_HOE, SPRUCE_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(SPRUCE_GOLDEN_SHOVEL, SPRUCE_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(SPRUCE_GOLDEN_PICKAXE, SPRUCE_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(SPRUCE_GOLDEN_AXE, SPRUCE_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(SPRUCE_GOLDEN_HOE, SPRUCE_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(SPRUCE_DIAMOND_SHOVEL, SPRUCE_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(SPRUCE_DIAMOND_PICKAXE, SPRUCE_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(SPRUCE_DIAMOND_AXE, SPRUCE_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(SPRUCE_DIAMOND_HOE, SPRUCE_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(SPRUCE_NETHERITE_SHOVEL, SPRUCE_STICK, SPRUCE_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(SPRUCE_NETHERITE_PICKAXE, SPRUCE_STICK, SPRUCE_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(SPRUCE_NETHERITE_AXE, SPRUCE_STICK, SPRUCE_DIAMOND_AXE, "netherite");
        registerHoeItem(SPRUCE_NETHERITE_HOE, SPRUCE_STICK, SPRUCE_DIAMOND_HOE, "netherite");
        registerBrushItem(SPRUCE_BRUSH, SPRUCE_STICK);

      //Warped Tools
        registerShovelItem(WARPED_WOODEN_SHOVEL, WARPED_STICK, Items.WARPED_PLANKS, "wooden");
        registerPickaxeItem(WARPED_WOODEN_PICKAXE, WARPED_STICK, Items.WARPED_PLANKS, "wooden");
        registerAxeItem(WARPED_WOODEN_AXE, WARPED_STICK, Items.WARPED_PLANKS, "wooden");
        registerHoeItem(WARPED_WOODEN_HOE, WARPED_STICK, Items.WARPED_PLANKS, "wooden");
        registerShovelItem(WARPED_STONE_SHOVEL, WARPED_STICK, Items.COBBLESTONE, "stone");
        registerPickaxeItem(WARPED_STONE_PICKAXE, WARPED_STICK, Items.COBBLESTONE, "stone");
        registerAxeItem(WARPED_STONE_AXE, WARPED_STICK, Items.COBBLESTONE, "stone");
        registerHoeItem(WARPED_STONE_HOE, WARPED_STICK, Items.COBBLESTONE, "stone");
        registerShovelItem(WARPED_DEEPSLATE_SHOVEL, WARPED_STICK, Items.DEEPSLATE, "deepslate");
        registerPickaxeItem(WARPED_DEEPSLATE_PICKAXE, WARPED_STICK, Items.DEEPSLATE, "deepslate");
        registerAxeItem(WARPED_DEEPSLATE_AXE, WARPED_STICK, Items.DEEPSLATE, "deepslate");
        registerHoeItem(WARPED_DEEPSLATE_HOE, WARPED_STICK, Items.DEEPSLATE, "deepslate");
        registerShovelItem(WARPED_BLACKSTONE_SHOVEL, WARPED_STICK, Items.BLACKSTONE, "blackstone");
        registerPickaxeItem(WARPED_BLACKSTONE_PICKAXE, WARPED_STICK, Items.BLACKSTONE, "blackstone");
        registerAxeItem(WARPED_BLACKSTONE_AXE, WARPED_STICK, Items.BLACKSTONE, "blackstone");
        registerHoeItem(WARPED_BLACKSTONE_HOE, WARPED_STICK, Items.BLACKSTONE, "blackstone");
        registerShovelItem(WARPED_IRON_SHOVEL, WARPED_STICK, Items.IRON_INGOT, "iron");
        registerPickaxeItem(WARPED_IRON_PICKAXE, WARPED_STICK, Items.IRON_INGOT, "iron");
        registerAxeItem(WARPED_IRON_AXE, WARPED_STICK, Items.IRON_INGOT, "iron");
        registerHoeItem(WARPED_IRON_HOE, WARPED_STICK, Items.IRON_INGOT, "iron");
        registerShovelItem(WARPED_GOLDEN_SHOVEL, WARPED_STICK, Items.GOLD_INGOT, "golden");
        registerPickaxeItem(WARPED_GOLDEN_PICKAXE, WARPED_STICK, Items.GOLD_INGOT, "golden");
        registerAxeItem(WARPED_GOLDEN_AXE, WARPED_STICK, Items.GOLD_INGOT, "golden");
        registerHoeItem(WARPED_GOLDEN_HOE, WARPED_STICK, Items.GOLD_INGOT, "golden");
        registerShovelItem(WARPED_DIAMOND_SHOVEL, WARPED_STICK, Items.DIAMOND, "diamond");
        registerPickaxeItem(WARPED_DIAMOND_PICKAXE, WARPED_STICK, Items.DIAMOND, "diamond");
        registerAxeItem(WARPED_DIAMOND_AXE, WARPED_STICK, Items.DIAMOND, "diamond");
        registerHoeItem(WARPED_DIAMOND_HOE, WARPED_STICK, Items.DIAMOND, "diamond");
        registerShovelItem(WARPED_NETHERITE_SHOVEL, WARPED_STICK, WARPED_DIAMOND_SHOVEL, "netherite");
        registerPickaxeItem(WARPED_NETHERITE_PICKAXE, WARPED_STICK, WARPED_DIAMOND_PICKAXE, "netherite");
        registerAxeItem(WARPED_NETHERITE_AXE, WARPED_STICK, WARPED_DIAMOND_AXE, "netherite");
        registerHoeItem(WARPED_NETHERITE_HOE, WARPED_STICK, WARPED_DIAMOND_HOE, "netherite");
        registerBrushItem(WARPED_BRUSH, WARPED_STICK);
    }

    private static void registerAxeItem(Item axeItem, Item stickIngredient, Item toolIngredient, String toolType) {
        String stickWood;
        if (stickIngredient.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickIngredient.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickIngredient).mstvWoodType;}
        String axeName = stickWood + "_" + toolType + "_axe";
        more_axes.add(axeItem);
        registerTieredToolItem(axeItem, stickIngredient, toolIngredient, axeName, toolType);
    }
    private static void registerPickaxeItem(Item pickaxeItem, Item stickIngredient, Item toolIngredient, String toolType) {
        String stickWood;
        if (stickIngredient.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickIngredient.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickIngredient).mstvWoodType;}
        String pickaxeName = stickWood + "_" + toolType + "_pickaxe";
        more_pickaxes.add(pickaxeItem);
        registerTieredToolItem(pickaxeItem, stickIngredient, toolIngredient, pickaxeName, toolType);
    }
    private static void registerHoeItem(Item hoeItem, Item stickIngredient, Item toolIngredient, String toolType) {
        String stickWood;
        if (stickIngredient.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickIngredient.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickIngredient).mstvWoodType;}
        String hoeName = stickWood + "_" + toolType + "_hoe";
        more_hoes.add(hoeItem);
        registerTieredToolItem(hoeItem, stickIngredient, toolIngredient, hoeName, toolType);
    }
    private static void registerShovelItem(Item shovelItem, Item stickIngredient, Item toolIngredient, String toolType) {
        String stickWood;
        if (stickIngredient.equals(Items.BAMBOO)) {stickWood = "bamboo";} else if (stickIngredient.equals(Items.STICK)) {stickWood = "oak";} else { stickWood = ((MoreStickVariantItem) stickIngredient).mstvWoodType;}
        String shovelName = stickWood + "_" + toolType + "_shovel";
        more_shovels.add(shovelItem);
        registerTieredToolItem(shovelItem, stickIngredient, toolIngredient, shovelName, toolType);
    }
    private static void registerTieredToolItem(Item toolItem, Item stickIngredient, Item toolIngredient, String toolName, String toolType) {
        Registry.register(BuiltInRegistries.ITEM, MoreToolVariants.asId(toolName), toolItem);
        more_tools.add(toolItem);
        more_tool_sticks.put(toolItem, stickIngredient);
        more_tiered_tool_ingredients.put(toolItem, toolIngredient);
        more_tiered_tool_tiernames.put(toolItem, toolType);
        if (more_tools.contains(toolIngredient)) {more_netherite_tools.add(toolItem);}
    //    MoreToolVariants.LOGGER.info("Registered: " + toolName);
    }
    private static void registerBrushItem(Item brushItem, Item stickIngredient) {
        String stickWood;
        if (stickIngredient.equals(Items.BAMBOO)) {stickWood = "bamboo";} else { stickWood = ((MoreStickVariantItem) stickIngredient).mstvWoodType;}
        String brushName = stickWood + "_brush";
        Registry.register(BuiltInRegistries.ITEM, MoreToolVariants.asId(brushName), brushItem);
        more_brushes.add(brushItem);
        more_tools.add(brushItem);
        more_tool_sticks.put(brushItem, stickIngredient);
    //    MoreToolVariants.LOGGER.info("Registered: " + brushName);
    }



}
