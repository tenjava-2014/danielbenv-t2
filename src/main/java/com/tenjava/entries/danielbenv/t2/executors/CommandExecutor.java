package com.tenjava.entries.danielbenv.t2.executors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.tenjava.entries.danielbenv.t2.TenJava;

public class CommandExecutor implements org.bukkit.command.CommandExecutor {

	private TenJava instance;
	private String[] usage = { ChatColor.RED + "A list of commands: ", "" };
	
	public CommandExecutor(TenJava plugin) {
		this.instance = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// Player check
		if(!(sender instanceof Player)) {
			sender.sendMessage("Players only");
			return false;
		}
		// Checking if the command is equals (ignore case) to energy
		if(cmd.getName().equalsIgnoreCase("energy")) {
			if(args.length == 0) {
				
				return false;	
			}
		}
		return false;
	}

}
