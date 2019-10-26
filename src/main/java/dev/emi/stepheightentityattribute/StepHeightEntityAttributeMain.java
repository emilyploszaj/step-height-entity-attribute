package dev.emi.stepheightentityattribute;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;

public class StepHeightEntityAttributeMain implements ModInitializer {
	public static final EntityAttribute STEP_HEIGHT = new ClampedEntityAttribute(null, "generic.step-height-entity-attributes.step-height", 0.0F, -1024.0F, 1024.0F).setName("Step Height").setTracked(true);

	@Override
	public void onInitialize() {
	}

	public static float getStepHeight(LivingEntity entity) {
		return entity.stepHeight + (float) entity.getAttributeInstance(STEP_HEIGHT).getValue();
	}
}
