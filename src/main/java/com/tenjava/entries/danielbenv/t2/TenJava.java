package com.tenjava.entries.danielbenv.t2;

import org.bukkit.plugin.java.JavaPlugin;

import com.tenjava.entries.danielbenv.t2.executors.CommandExecutor;

public class TenJava extends JavaPlugin {
	
	// The main class instance
	private static TenJava instance;
	
	/*
	 * getInstance method; for getting the main class instance from other classes
	 */
	
	public static TenJava getInstance() {
		// return the class instance
		return instance;
	}
	
	public void onEnable() {
		// Setting the instance to this
		instance = this;
		getCommand("energy").setExecutor(new CommandExecutor(this));
	}
	
	public void onDisable() {
		
	}
	
}
