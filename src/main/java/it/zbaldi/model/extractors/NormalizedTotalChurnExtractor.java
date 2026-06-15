package it.zbaldi.model.extractors;

import it.zbaldi.model.MetricExtractor;

public class NormalizedTotalChurnExtractor implements MetricExtractor<Float> {
    @Override
    public Float startAnalysis() {
        return 0.0f;
    }
}