package com.github.synacnipo.removetellraw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TellRawMatcherTest {

    @Test
    void matchesTellRawCommands() {
        assertTrue(TellRawMatcher.isTellRawCommand("/tellraw @a {\"text\":\"hi\"}", "/tellraw", "/minecraft:tellraw"));
        assertTrue(TellRawMatcher.isTellRawCommand("tellraw @a {\"text\":\"hi\"}", "tellraw", "minecraft:tellraw"));
        assertTrue(TellRawMatcher.isTellRawCommand("/minecraft:tellraw @a {\"text\":\"hi\"}", "/tellraw", "/minecraft:tellraw"));
        assertTrue(TellRawMatcher.isTellRawCommand("minecraft:tellraw @a {\"text\":\"hi\"}", "tellraw", "minecraft:tellraw"));
    }

    @Test
    void ignoresNonTellRawCommands() {
        assertFalse(TellRawMatcher.isTellRawCommand("/me hi", "/tellraw", "/minecraft:tellraw"));
        assertFalse(TellRawMatcher.isTellRawCommand("/say hello", "/tellraw", "/minecraft:tellraw"));
        assertFalse(TellRawMatcher.isTellRawCommand("/tellrawx test", "/tellraw", "/minecraft:tellraw"));
    }
}
