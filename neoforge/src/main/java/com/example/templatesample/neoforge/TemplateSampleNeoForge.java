package com.example.templatesample.neoforge;

import com.example.templatesample.TemplateSample;
import net.neoforged.fml.common.Mod;

@Mod(TemplateSample.MOD_ID)
public final class TemplateSampleNeoForge {
    public TemplateSampleNeoForge() {
        TemplateSample.init();
    }
}
