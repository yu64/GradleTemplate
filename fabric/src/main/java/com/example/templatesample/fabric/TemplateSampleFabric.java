package com.example.templatesample.fabric;

import com.example.templatesample.TemplateSample;
import net.fabricmc.api.ModInitializer;

public final class TemplateSampleFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TemplateSample.init();
    }
}
