package it.zbaldi.model.extractors;

import it.zbaldi.model.MetricExtractor;

public class CreationAgeExtractor implements MetricExtractor<Integer> {
    @Override
    public Integer startAnalysis() {
        return 0;
    }
}