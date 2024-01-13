package org.server.godofhacking

import org.server.godofhacking.farming.event.BlockBreakEvent

object EventManager {
    fun registerEvents() {
        GodOfHacking.instance?.let {
            it.server.pluginManager.run {
                registerEvents(BlockBreakEvent, it)
            }
        }
    }
}