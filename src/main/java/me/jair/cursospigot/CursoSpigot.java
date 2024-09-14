package me.jair.cursospigot;

import me.jair.cursospigot.commands.EjemploCommand;
import me.jair.cursospigot.commands.ItemsCommand;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;

public final class CursoSpigot extends JavaPlugin {

    @Override
    public void onEnable() {

        WorldCreator worldCreator = new WorldCreator("curso");
        worldCreator.generateStructures(false);
        World world = Bukkit.createWorld(worldCreator);

        world.setPVP(false);
        world.setTime(1000L);


        getCommand("ejemplo").setExecutor(new EjemploCommand());
        getCommand("items").setExecutor(new ItemsCommand());
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);

        System.out.println("Plugin habilitado");

//        Component.text().content("Hola")
//                .color(NamedTextColor.RED)
//                .decorate(TextDecoration.BOLD)
//                .clickEvent(ClickEvent.openUrl("https://github.com/Jair0305"))
//                .append(Component.text(" Mundo", NamedTextColor.GREEN));

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin deshabilitado");
    }
}
