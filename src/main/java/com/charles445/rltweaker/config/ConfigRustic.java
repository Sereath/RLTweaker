package com.charles445.rltweaker.config;

import net.minecraftforge.common.config.Config;

public class ConfigRustic
{
	@Config.Comment("Master switch for this mod compatibility")
	@Config.Name("ENABLED")
	@Config.RequiresMcRestart
	public boolean enabled = true;
	
	@Config.Comment("Fix for rustic log and wood not having their tool set to axe. May act strangely if not matched on the client.")
	@Config.Name("Wood Harvest Tool Fix")
	@Config.RequiresMcRestart
	public boolean woodHarvestToolFix = false;
	
	@Config.Comment("Validates containers when players have the UI open to prevent dupes")
	@Config.Name("Validate Containers")
	public boolean validateContainers = true;
}
