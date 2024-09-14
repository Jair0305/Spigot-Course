package me.jair.cursospigot;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerListener implements Listener {

//    @EventHandler
//    public void onPlayerMove(PlayerMoveEvent event)
//    {
//        event.setCancelled(true);
//        Player player = event.getPlayer();
//        player.sendMessage(Component.text("No puedes moverte", NamedTextColor.RED).decorate(TextDecoration.BOLD));
//    }
//    @EventHandler
//    public void onPlayerSneak(PlayerToggleSneakEvent event)
//    {
//        Player player = event.getPlayer();
//        player.sendMessage(Component.text("Estas agachado", NamedTextColor.GREEN).decorate(TextDecoration.BOLD));
//
//        Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
//        zombie.setBaby();
//    }
//    @EventHandler
//    public void onPlayerMove(PlayerMoveEvent event)
//    {
////        Player player = event.getPlayer();
////        Location location = new Location(player.getWorld(),0,0,0);
////        World world = player.getWorld();
////        player.sendMessage(Component.text("Distancia: hasta 0 0 0" + player.getLocation().distance(location), NamedTextColor.GREEN));
//
//        Player player = event.getPlayer();
//
//        player.getLocation().clone().add(0,1,0).getBlock().setType(Material.DIAMOND_BLOCK);
//    }



}
