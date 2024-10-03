package de.pnku.mstv_mtoolv;

import de.pnku.mstv_mtoolv.client.ui.MtoolvCreativeTab;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value = EnvType.CLIENT)
public class MoreToolVariantsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		MtoolvCreativeTab.registerMtoolvCreativeTab();
	}
}
