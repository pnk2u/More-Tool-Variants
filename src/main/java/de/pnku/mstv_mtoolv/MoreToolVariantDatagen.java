package de.pnku.mstv_mtoolv;

import de.pnku.mstv_mtoolv.datagen.MoreToolVariantLangGenerator;
import de.pnku.mstv_mtoolv.datagen.MoreToolVariantModelGenerator;
import de.pnku.mstv_mtoolv.datagen.MoreToolVariantRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class MoreToolVariantDatagen implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();

		pack.addProvider(MoreToolVariantRecipeGenerator::new);
		pack.addProvider(MoreToolVariantLangGenerator::new);
		pack.addProvider(MoreToolVariantModelGenerator::new);
	}

}
