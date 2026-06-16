package it.zbaldi.model;

public interface MetricExtractor<X,T> {

    T startAnalysis(X input);
}
