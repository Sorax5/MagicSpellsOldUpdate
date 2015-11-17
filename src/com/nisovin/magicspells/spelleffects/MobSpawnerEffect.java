package com.nisovin.magicspells.spelleffects;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;

public class MobSpawnerEffect extends SpellEffect {

	@Override
	public void loadFromString(String string) {
		//no current string loading schema
	}

	@Override
	public void loadFromConfig(ConfigurationSection config) {
		//TODO make a config schema for this effect
	}

	@Override
	public void playEffectLocation(Location location) {
		location.getWorld().playEffect(location, Effect.MOBSPAWNER_FLAMES, 0);
	}
	
}
