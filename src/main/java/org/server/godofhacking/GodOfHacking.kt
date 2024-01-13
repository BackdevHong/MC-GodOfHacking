package org.server.godofhacking

import org.bukkit.plugin.java.JavaPlugin

class GodOfHacking : JavaPlugin() {
    companion object{
        var instance : GodOfHacking? = null
    }
    override fun onEnable() {
        instance = this
        EventManager.registerEvents()
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
