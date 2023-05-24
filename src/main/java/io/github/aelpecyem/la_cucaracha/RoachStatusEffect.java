package io.github.aelpecyem.la_cucaracha;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.InstantStatusEffect;
import net.minecraft.entity.effect.StatusEffect;

public class RoachStatusEffect extends InstantStatusEffect {

	public RoachStatusEffect(StatusEffect statusEffectType, int i) {
		super(statusEffectType.getCategory(), i);
	}

	@Override
	public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		super.onApplied(entity, attributes, amplifier);
	}
}
