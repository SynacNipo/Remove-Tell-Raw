package com.github.synacnipo.removetellraw;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class RemoveTellRaw extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        overrideTellRawCommand();
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("RemoveTellRaw enabled — /tellraw has been fully disabled");
    }

    private void overrideTellRawCommand() {
        CommandMap commandMap = Bukkit.getCommandMap();

        Command existing = commandMap.getCommand("tellraw");
        if (existing != null) {
            existing.unregister(commandMap);
        }

        commandMap.register("minecraft", new Command("tellraw") {
            @Override
            public boolean execute(CommandSender sender, String label, String[] args) {
                return true;
            }
        });
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        String message = event.getMessage().toLowerCase().trim();
        if (message.startsWith("/tellraw") || message.startsWith("/minecraft:tellraw")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onConsoleCommand(ServerCommandEvent event) {
        String command = event.getCommand().toLowerCase().trim();
        if (command.startsWith("tellraw") || command.startsWith("minecraft:tellraw")) {
            event.setCancelled(true);
        }
    }
}
