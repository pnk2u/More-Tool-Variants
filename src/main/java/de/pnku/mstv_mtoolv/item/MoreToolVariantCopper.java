package de.pnku.mstv_mtoolv.item;

import net.minecraft.world.item.ToolMaterial;

import static de.pnku.mstv_mtoolv.MoreToolVariants.hasCopperTools;

public class MoreToolVariantCopper {
    public static final ToolMaterial COPPER = hasCopperTools ? getCopperToolMaterial() : ToolMaterial.STONE;
    private static ToolMaterial getCopperToolMaterial() {
        return ToolMaterial.COPPER;
    }
}
