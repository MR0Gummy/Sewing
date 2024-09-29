package com.mrgummy.sewing.items;

import com.mrgummy.sewing.Sewing;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.*;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SewingNeedleItemExperimental extends ToolItem {
	private static final Text TITLE = Text.translatable("container.sewing.sewing_needle");

	public SewingNeedleItemExperimental(Settings settings) {
		super(ToolMaterials.IRON,settings);
	}


	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		BlockPos pos = user.getSteppingPosition();
		if (!world.isClient) {
			return TypedActionResult.success(itemStack);
		} else {
			user.openHandledScreen(new ExtendedScreenHandlerFactory() {
				@Override
				public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
					buf.writeItemStack(itemStack);
				}

				@Override
				public Text getDisplayName() {
					return TITLE;
				}

				@Nullable
				@Override
				public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
					return new CraftingScreenHandler(1, playerInventory, ScreenHandlerContext.create(world, pos));
				}
			});
			Sewing.LOGGER.info("waaah");
			return TypedActionResult.consume(itemStack);
		}
	}
}
