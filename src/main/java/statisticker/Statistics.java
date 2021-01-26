package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        if (numbers.isEmpty()) {
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        }

        float sum = 0.0f;

        for (float i : numbers) {
            sum += i;
        }
        Float max = numbers.stream().max(Float::compare).get();
        Float min = numbers.stream().min(Float::compare).get();

        return new Stats(sum/numbers.size(), min, max);

    }

    public static class Stats {

        private Float average;
        private Float min;
        private Float max;

        public Stats(float average, float min, float max) {
            this.average = average;
            this.min = min;
            this.max = max;
        }

        public Float getAverage() {
            return average;
        }

        public void setAverage(Float average) {
            this.average = average;
        }

        public Float getMin() {
            return min;
        }

        public void setMin(Float min) {
            this.min = min;
        }

        public Float getMax() {
            return max;
        }

        public void setMax(Float max) {
            this.max = max;
        }
    }
}
