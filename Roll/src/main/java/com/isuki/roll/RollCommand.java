package com.isuki.roll;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RollCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be in-game to use this command!");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("roll")) {
            if (args.length >= 2) {
                int min = Integer.parseInt(args[0]);
                int max = Integer.parseInt(args[1]);
                int result = (int) Math.floor(Math.random() * (max - min + 1) + min);
                Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + Integer.toString(result));
            } else {
                player.sendMessage("Invalid arguments!");
            }
        }
        return true;
    }
}
