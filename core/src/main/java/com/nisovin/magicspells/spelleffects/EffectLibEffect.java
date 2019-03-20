package com.nisovin.magicspells.spelleffects;

import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;

import com.nisovin.magicspells.MagicSpells;

import de.slikey.effectlib.EffectManager;

public class EffectLibEffect extends SpellEffect {

	ConfigurationSection effectLibSection;
	EffectManager manager = MagicSpells.plugin.effectManager;
	String className;
	
	@Override
	public void loadFromString(String string) {
		// nope
	}

	@Override
	protected void loadFromConfig(ConfigurationSection config) {
		effectLibSection = config.getConfigurationSection("effectlib");
		className = effectLibSection.getString("class");
	}

	@Override
	protected Runnable playEffectLocation(Location location) {
		manager.start(className, effectLibSection, location);
		return null;
	}
	
}
