package it.zbaldi.model;

public interface DatasetDao<T> {

    void save(T data);
}
