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

package com.manuwebdev.gsafetydeposit;

import com.manuwebdev.gsafetydeposit.Listeners.CreationListeners;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Manuel Gauto 
 */
public class GSafetyDeposit extends JavaPlugin{
/**
 * Log to console
 */
static final Logger log = Logger.getLogger("Minecraft");

/**
 * Name of plugin
 */
 private final String PLUGIN_NAME="GSafetyDeposit";

    @Override
    public void onDisable() {
        log.info("["+PLUGIN_NAME+"] Disabled.");
    }

    @Override
    public void onEnable() {
        log.info("["+PLUGIN_NAME+"] Enabled.");
        getServer().getPluginManager().registerEvents(new CreationListeners(this), this);
        
    }

}

    
