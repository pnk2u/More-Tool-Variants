package de.pnku.mstv_mtoolv;

import de.pnku.mstv_mtoolv.item.MoreToolVariantItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreToolVariants implements ModInitializer {

	public static final String MOD_ID = "mstv-mtoolv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static boolean hasCopperTools = false;
	
	@Override
	public void onInitialize() {
		if (versionIsAtLeast(1, 21, 9)) hasCopperTools = true;
		MoreToolVariantItems.registerToolItems();
	}

	public static ResourceLocation asId(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	public static boolean versionIsAtLeast(int major, int minor, int patch) {
		try {
			var minecraft = FabricLoader.getInstance().getModContainer("minecraft");
			if (minecraft.isEmpty()) throw new Exception("Couldn't find Minecraft.");
			String[] semVer = minecraft.get().getMetadata().getVersion().getFriendlyString().split("-", 2)[0].split("\\.");
			int x = Integer.parseInt(semVer[0]), y = Integer.parseInt(semVer[1]), z = Integer.parseInt(semVer[2]);
			return x > major || (x == major && (y > minor || (y == minor && z >= patch)));
		} catch (Exception e) {
			LOGGER.error("Error checking Minecraft version", e);
			return false;
		}
	}
}
