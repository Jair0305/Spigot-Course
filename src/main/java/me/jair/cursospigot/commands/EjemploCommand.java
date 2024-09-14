package me.jair.cursospigot.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class EjemploCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(!sender.hasPermission("cursospigot.commands.ejemplo"))
        {
            sender.sendMessage(Component.text("No tienes permisos para ejecutar este comando"));
            return true;
        }

        if(args.length > 0)
        {
            sender.sendMessage(Component.text("Hola " + args[0]));
        }else
        {
            if(sender instanceof Player player)
            {
                player.sendMessage(Component.text("Hola ").append(player.displayName()));
            }else
            {
                sender.sendMessage(Component.text("Hola Consola"));
            }
        }
        sender.sendMessage(Component.text("buenas"));
        return true;
    }
}
