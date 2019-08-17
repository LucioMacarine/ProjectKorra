package com.projectkorra.projectkorra.ability;

import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.configuration.configs.abilities.AbilityConfig;

public abstract class MetalAbility<C extends AbilityConfig> extends EarthAbility<C> implements SubAbility {

	public MetalAbility(final C config, final Player player) {
		super(config, player);
	}

	@Override
	public Class<? extends Ability> getParentAbility() {
		return EarthAbility.class;
	}

	@Override
	public Element getElement() {
		return Element.METAL;
	}

}
