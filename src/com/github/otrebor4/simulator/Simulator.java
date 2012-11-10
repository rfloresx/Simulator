package com.github.otrebor4.simulator;

import org.bukkit.plugin.java.JavaPlugin;

public class Simulator extends JavaPlugin{
public static Simulator plugin;
	
	@Override
	public void onEnable(){ 
		plugin = this;
		Settings.setupVariables();
		SPSettings.setupVariables();
		 
	}
	 
	@Override
	public void onDisable(){ 
	 
	}
}
