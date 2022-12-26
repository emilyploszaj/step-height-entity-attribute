package dev.emi.stepheightentityattribute.mixin;

import dev.emi.stepheightentityattribute.StepHeightEntityAttributeMain;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityAttributes.class)
public abstract class EntityAttributesMixin {
	@Shadow
	private static EntityAttribute register(String id, EntityAttribute attribute) {
		throw new UnsupportedOperationException();
	}

	static {
		StepHeightEntityAttributeMain.STEP_HEIGHT = register("stepheightentityattribute:stepheight", new ClampedEntityAttribute("generic.step-height-entity-attributes.step-height", 0.0F, -1024.0F, 1024.0F).setTracked(true));
	}
}
