/*
 * The MIT License
 *
 * Copyright 2012 Manuel Gauto.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.manuwebdev.gsafetydeposit.Listeners;

import com.griefcraft.lwc.LWC;
import com.griefcraft.lwc.LWCPlugin;
import com.griefcraft.model.Protection;
import com.manuwebdev.gsafetydeposit.GSafetyDeposit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author Manuel Gauto
 */
public class CreationListeners implements Listener {

    LWC lwc = null;

    public CreationListeners(GSafetyDeposit plugin) {
        Plugin lwcPlugin = plugin.getServer().getPluginManager().getPlugin("LWC");
        if (lwcPlugin != null) {
            lwc = ((LWCPlugin) lwcPlugin).getLWC();
        }
    }

    @EventHandler
    public void onBlockInteract(PlayerInteractEvent e) {
        Protection protection = lwc.findProtection(e.getClickedBlock());
    }
}
