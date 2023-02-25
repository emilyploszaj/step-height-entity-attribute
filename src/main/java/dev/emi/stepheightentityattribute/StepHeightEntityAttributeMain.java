package dev.emi.stepheightentityattribute;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;

public class StepHeightEntityAttributeMain {
	public static EntityAttribute STEP_HEIGHT;

	public static float getStepHeight(LivingEntity entity) {
		return entity.getStepHeight() + (float) entity.getAttributeInstance(STEP_HEIGHT).getValue();
	}
}
