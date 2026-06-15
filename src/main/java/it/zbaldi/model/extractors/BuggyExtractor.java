package it.zbaldi.model.extractors;

import it.zbaldi.model.MetricExtractor;

public class BuggyExtractor implements MetricExtractor<Boolean> {
    @Override
    public Boolean startAnalysis() {
        return false;
    }
}