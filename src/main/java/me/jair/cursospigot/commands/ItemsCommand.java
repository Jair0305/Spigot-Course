package me.jair.cursospigot.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class ItemsCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);

        ItemMeta meta = espada.getItemMeta();

        meta.displayName(Component.text("Espada de Diamante"));

        espada.setItemMeta(meta);

        if(sender instanceof Player player)
        {
            player.getInventory().addItem(espada);
        }

        return true;
    }
}
