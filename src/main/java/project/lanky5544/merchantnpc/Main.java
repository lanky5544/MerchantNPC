package project.lanky5544.merchantnpc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() {
		getLogger().info("Plugin Enabled");
	}
	
	public void onDisable() {
		getLogger().info("Plugin Disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("hub")){
				String hub = "spawn " + player.getName();
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), hub);
				player.sendMessage(ChatColor.AQUA + "Returning to Hub!");
				
			}
		}
	
	return false;
	}
	
}
