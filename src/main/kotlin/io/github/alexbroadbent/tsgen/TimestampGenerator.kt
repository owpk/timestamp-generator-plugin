package io.github.alexbroadbent.tsgen

import io.github.alexbroadbent.tsgen.config.TimestampGeneratorSettings
import java.time.Instant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object TimestampGenerator {

    fun generateTimestamp(
            instant: Instant = Instant.now(),
            settings: TimestampGeneratorSettings = TimestampGeneratorSettings.instance
    ): String {
        val currentDate = LocalDateTime.now();
        val format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return currentDate.format(format);
    }
}
