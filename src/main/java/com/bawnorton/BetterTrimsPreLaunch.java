package com.bawnorton;

import com.llamalad7.mixinextras.MixinExtrasBootstrap;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class BetterTrimsPreLaunch implements PreLaunchEntrypoint {

    @Override
    public void onPreLaunch() {
        BetterTrims.LOGGER.info("PreLaunching Better Trims");
        MixinExtrasBootstrap.init();
    }
}
