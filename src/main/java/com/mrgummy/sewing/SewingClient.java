package com.mrgummy.sewing;

import com.mrgummy.sewing.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class SewingClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.TOMATO_PLUSHIE);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.ORANGE_PLUSHIE);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.SHARK_PLUSHIE);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.PINCUSHION);
	}
}
