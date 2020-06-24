package dev.emi.stepheightentityattribute;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StepHeightEntityAttributeMain implements ModInitializer {
	public static final EntityAttribute STEP_HEIGHT = register("stepheight", new ClampedEntityAttribute("generic.step-height-entity-attributes.step-height", 0.0F, -1024.0F, 1024.0F).setTracked(true));

	@Override
	public void onInitialize() {
	}

	public static float getStepHeight(LivingEntity entity) {
		return entity.stepHeight + (float) entity.getAttributeInstance(STEP_HEIGHT).getValue();
	}

	private static EntityAttribute register(String name, EntityAttribute attribute) {
		return Registry.register(Registry.ATTRIBUTE, new Identifier("stepheightentityattribute", name), attribute);
	}
}
