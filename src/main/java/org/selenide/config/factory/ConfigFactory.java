package org.selenide.config.factory;

import org.aeonbits.owner.ConfigCache;
import org.selenide.config.FrameworkConfig;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig config (){ return ConfigCache.getOrCreate(FrameworkConfig.class); }
}
