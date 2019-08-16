package com.projectkorra.projectkorra.configuration.better.configs.abilities.earth;

import com.projectkorra.projectkorra.configuration.better.configs.abilities.AbilityConfig;

public class DensityShiftConfig extends AbilityConfig {

	public final long Duration = 0;
	
	public DensityShiftConfig() {
		super(true, "", null);
	}

	@Override
	public String getName() {
		return "DensityShift";
	}

	@Override
	public String[] getParents() {
		return new String[] { "Abilities", "Water", "Passives" };
	}

}