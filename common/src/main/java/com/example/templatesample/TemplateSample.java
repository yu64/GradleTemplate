package com.example.templatesample;

import dev.architectury.event.events.common.CommandRegistrationEvent;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TemplateSample {
    public static final String MOD_ID = "template_sample";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private TemplateSample() {
    }

    //全ローダーから同じ初期化処理を呼ぶ。
    public static void init() {
        CommandRegistrationEvent.EVENT.register((dispatcher, registry, selection) -> {
            dispatcher.register(Commands.literal("templatehello").executes(context -> {
                context.getSource().sendSuccess(
                        () -> Component.literal("Hello from Architectury Sample!"), false);
                return 1;
            }));
        });
        LOGGER.info("Architectury Sample initialized. Use /templatehello in game.");
    }
}
