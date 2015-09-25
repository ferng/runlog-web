package com.thecrunchycorner.runlogweb.week;

import org.apache.commons.lang3.time.DurationFormatUtils;

import java.io.Serializable;
import java.time.Duration;

public class FormattedDuration implements Serializable {
    Duration duration;

    FormattedDuration(int hours, int minutes, int seconds) {
        duration = Duration.ofHours(hours);
        duration = duration.plusMinutes(minutes);
        duration = duration.plusSeconds(seconds);
    }

    public Duration getDuration() {
        return duration;
    }

    public String toString() {
        return DurationFormatUtils.formatDuration(duration.toMillis(), "HH:mm:ss");
    }
}
