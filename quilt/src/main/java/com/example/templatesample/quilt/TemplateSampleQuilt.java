package com.example.templatesample.quilt;

import com.example.templatesample.TemplateSample;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public final class TemplateSampleQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        TemplateSample.init();
    }
}
