package statisticker;

import java.util.List;
import java.util.Optional;

public class StatsChecker {
    private final float maxThreshold;
    private final IAlerter[] alerters;

    public StatsChecker(float maxThreshold, IAlerter[] alerters) {
        this.alerters = alerters;
        this.maxThreshold = maxThreshold;
    }

    public void checkAndAlert(List<Float> numbers) {
        final Optional<Float> max = numbers.stream().max(Float::compare);
        if(max.isPresent() && max.get() > maxThreshold){
            for (IAlerter i : alerters) {
                i.signalAlert();
            }
        }
    }
}
