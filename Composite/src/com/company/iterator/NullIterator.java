package com.company.iterator;

import com.company.component.Component;

import java.util.Iterator;

public class NullIterator implements Iterator<Component> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }
}
