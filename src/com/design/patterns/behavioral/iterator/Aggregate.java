package com.design.patterns.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
