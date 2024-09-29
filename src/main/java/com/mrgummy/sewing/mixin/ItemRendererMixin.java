package com.mrgummy.sewing.mixin;

import com.mrgummy.sewing.Sewing;
import com.mrgummy.sewing.items.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useScytheModel(BakedModel value, ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.MITTEN) && renderMode == ModelTransformation.Mode.THIRD_PERSON_RIGHT_HAND) {
			return ((ItemRendererAccessor) this).sewing$getModels().getModelManager().getModel(new ModelIdentifier(Sewing.MOD_ID, "item/mitten_handheld", "inventory"));
        } else if (stack.isOf(ModItems.OPPOSITE_MITTEN) && renderMode == ModelTransformation.Mode.THIRD_PERSON_LEFT_HAND) {
			return ((ItemRendererAccessor) this).sewing$getModels().getModelManager().getModel(new ModelIdentifier(Sewing.MOD_ID, "item/opposite_mitten_handheld", "inventory"));
		}
        return value;

    }
}
