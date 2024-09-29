package com.mrgummy.sewing.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mrgummy.sewing.Sewing;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class SewingNeedleScreen extends HandledScreen<SewingNeedleScreenHandler> {
	private static final Identifier TEXTURE = new Identifier(Sewing.MOD_ID, "textures/gui/container/sewing_needle.png");
	public SewingNeedleScreen(SewingNeedleScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
	}

	@Override
	protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
		RenderSystem._setShaderTexture(0, TEXTURE);
	}

	@Override
	public ItemRenderer getItemRenderer() {
		return super.getItemRenderer();
	}

	@Override
	public TextRenderer getTextRenderer() {
		return super.getTextRenderer();
	}
}
