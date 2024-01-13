package org.server.godofhacking.farming.event

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta
import org.server.godofhacking.GodOfHacking

object BlockBreakEvent : Listener {
    @EventHandler
    fun onPlayerBlockBreakEvent(e : BlockBreakEvent) {
        if (e.block.type == Material.COAL_ORE) {
            GodOfHacking.instance?.server?.broadcastMessage("석탄 블럭을 깨버림!");

            val itemStack : ItemStack = ItemStack(Material.DIAMOND_BLOCK)
            val itemMeta : ItemMeta? = itemStack.itemMeta;

            if (itemMeta != null) {
                itemMeta.setDisplayName("테스트")
                itemMeta.setCustomModelData(2546987)
                itemStack.setItemMeta(itemMeta)
            }

            val inventory : Inventory = e.player.inventory
            inventory.addItem(itemStack)
        }
    }
}