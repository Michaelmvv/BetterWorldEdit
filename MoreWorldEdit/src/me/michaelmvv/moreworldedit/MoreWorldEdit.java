package me.michaelmvv.moreworldedit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MoreWorldEdit extends JavaPlugin {

	public void onEnable() {
		getLogger().info("Save Plugin Starting");

	}

	public void onDisable() {
		getLogger().info("Save Plugin Off");
	}

	// public class PlayerCommandPreprocessEventListener implements Listener {
	//
	// @EventHandler(priority = EventPriority.LOWEST)
	// public void onCommandPreProcess(PlayerCommandPreprocessEvent event){
	// if(event.getMessage().toLowerCase().startsWith("//wand")){
	//
	// event.setCancelled(true);
	// event.getPlayer().sendMessage("");
	// Player player = event.getPlayer();
	// ItemStack Wand = new ItemStack(Material.WOOD_AXE);
	// ItemMeta meta = Wand.getItemMeta();
	// meta.setDisplayName(ChatColor.GOLD + "WorldEdit Wand Tool");
	// Wand.setItemMeta(meta);
	// player.getInventory().addItem(Wand);
	//
	// }
	// }
	// }

	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		// Compass Tool
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("/TP")) {

				ItemStack commpass = new ItemStack(Material.COMPASS);
				ItemMeta meta = commpass.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Teleport Tool");
				commpass.setItemMeta(meta);
				player.getInventory().addItem(commpass);

			}

		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("WTP")) {
				ItemStack commpass = new ItemStack(Material.COMPASS);
				ItemMeta meta = commpass.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Teleport Tool");
				commpass.setItemMeta(meta);
				player.getInventory().addItem(commpass);
			}

		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("WorldEditTP")) {
				ItemStack commpass = new ItemStack(Material.COMPASS);
				ItemMeta meta = commpass.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Teleport Tool");
				commpass.setItemMeta(meta);
				player.getInventory().addItem(commpass);
			}

		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("/WTP")) {
				ItemStack commpass = new ItemStack(Material.COMPASS);
				ItemMeta meta = commpass.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Teleport Tool");
				commpass.setItemMeta(meta);
				player.getInventory().addItem(commpass);

			}

		}
		// start Wand
		
		 if (sender instanceof Player) {
		 Player player = (Player) sender;
		 if (cmd.getName().equalsIgnoreCase("/wand")) {
		player.sendMessage("Left click: select pos #1; Right click: select pos #2");
		 ItemStack Wand = new ItemStack(Material.WOOD_AXE);
		 ItemMeta meta = Wand.getItemMeta();
		 meta.setDisplayName(ChatColor.GOLD + "WorldEdit Wand Tool");
		 Wand.setItemMeta(meta);
		 player.getInventory().addItem(Wand);
		
		 }
		
		 }
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("WW")) {
				player.sendMessage("Left click: select pos #1; Right click: select pos #2");
				ItemStack Wand = new ItemStack(Material.WOOD_AXE);
				ItemMeta meta = Wand.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Wand Tool");
				Wand.setItemMeta(meta);
				player.getInventory().addItem(Wand);
			}

		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("wand")) {
				player.sendMessage("Left click: select pos #1; Right click: select pos #2");
				ItemStack Wand = new ItemStack(Material.WOOD_AXE);
				ItemMeta meta = Wand.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Wand Tool");
				Wand.setItemMeta(meta);
				player.getInventory().addItem(Wand);
			}

		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("WorldEditWand")) {
				player.sendMessage("Left click: select pos #1; Right click: select pos #2");
				ItemStack Wand = new ItemStack(Material.WOOD_AXE);
				ItemMeta meta = Wand.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Wand Tool");
				Wand.setItemMeta(meta);
				player.getInventory().addItem(Wand);
			}

		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("/WW")) {
				player.sendMessage("Left click: select pos #1; Right click: select pos #2");
				ItemStack Wand = new ItemStack(Material.WOOD_AXE);
				ItemMeta meta = Wand.getItemMeta();
				meta.setDisplayName(ChatColor.GOLD + "WorldEdit Wand Tool");
				Wand.setItemMeta(meta);
				player.getInventory().addItem(Wand);
			}

		}
		return false;
	}

}
