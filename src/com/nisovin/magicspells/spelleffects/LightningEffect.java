package com.nisovin.magicspells.spelleffects;

import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;

public class LightningEffect extends SpellEffect {

	@Override
	public void loadFromString(String string) {
		//no current string loading schema
	}

	@Override
	public void loadFromConfig(ConfigurationSection config) {
		//TODO make a config loading schema
	}

	@Override
	public void playEffectLocation(Location location) {
		location.getWorld().strikeLightningEffect(location);
	}

}
