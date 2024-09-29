// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.mrgummy.sewing.blocks.entities;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class PandaPlushie extends EntityModel<Entity> {
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	public PandaPlushie(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Head = modelPartData.addChild("Head", ModelPartBuilder.create().uv(20, 14).cuboid(-1.5F, -2.0F, -3.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -5.0F, -2.5F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, 0.0F));

		ModelPartData LeftEar_r1 = Head.addChild("LeftEar_r1", ModelPartBuilder.create().uv(18, 0).cuboid(-3.0F, -4.0F, 3.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.8F, -1.9F, -1.5F, 0.0F, 0.0F, 0.3927F));

		ModelPartData RightEar_r1 = Head.addChild("RightEar_r1", ModelPartBuilder.create().uv(26, 0).cuboid(-3.0F, -4.0F, 3.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -1.5F, 0.0F, 0.0F, -0.3927F));

		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create().uv(0, 11).cuboid(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.5F));

		ModelPartData RightLeg = modelPartData.addChild("RightLeg", ModelPartBuilder.create().uv(18, 5).cuboid(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 22.5F, 2.0F));

		ModelPartData LeftLeg = modelPartData.addChild("LeftLeg", ModelPartBuilder.create().uv(14, 17).cuboid(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 22.5F, 2.0F));

		ModelPartData RightArm = modelPartData.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 18.5F, 1.0F));

		ModelPartData RightArm_r1 = RightArm.addChild("RightArm_r1", ModelPartBuilder.create().uv(0, 23).cuboid(-2.0F, -1.0F, -5.0F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.3F, -0.4F, 1.2F, 0.0F, 0.3927F, 0.0F));

		ModelPartData LeftArm = modelPartData.addChild("LeftArm", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 18.5F, 1.0F));

		ModelPartData LeftArm_r1 = LeftArm.addChild("LeftArm_r1", ModelPartBuilder.create().uv(11, 26).cuboid(-1.0F, -1.0F, -5.0F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-1.3F, -0.4F, 1.2F, 0.0F, -0.3927F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		RightLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		LeftLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		RightArm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		LeftArm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
