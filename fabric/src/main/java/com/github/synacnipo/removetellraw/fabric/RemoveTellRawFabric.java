package com.github.synacnipo.removetellraw.fabric;

import com.mojang.brigadier.Command;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;

public final class RemoveTellRawFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("tellraw").executes(context -> Command.SINGLE_SUCCESS));
            dispatcher.register(CommandManager.literal("minecraft:tellraw").executes(context -> Command.SINGLE_SUCCESS));
        });
    }
}
