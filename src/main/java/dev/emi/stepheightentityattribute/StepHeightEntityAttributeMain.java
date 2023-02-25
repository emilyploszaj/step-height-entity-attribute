package dev.emi.stepheightentityattribute;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;

public class StepHeightEntityAttributeMain {
	public static EntityAttribute STEP_HEIGHT;

	public static float getStepHeight(float baseStepHeight, LivingEntity entity) {
		return baseStepHeight + (float) entity.getAttributeInstance(STEP_HEIGHT).getValue();
	}
}
