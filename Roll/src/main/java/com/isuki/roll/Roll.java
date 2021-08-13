package com.isuki.roll;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Roll extends JavaPlugin
{

    @Override
    public void onEnable() {
        this.getCommand("roll").setExecutor(new RollCommand());
    }

    @Override
    public void onDisable() {
    }
}
