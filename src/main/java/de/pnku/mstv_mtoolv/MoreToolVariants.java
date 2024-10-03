package de.pnku.mstv_mtoolv;

import de.pnku.mstv_mtoolv.item.MoreToolVariantItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreToolVariants implements ModInitializer {

	public static final String MOD_ID = "mstv-mtoolv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	
	@Override
	public void onInitialize() {
		MoreToolVariantItems.registerToolItems();
	}

	public static ResourceLocation asId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
