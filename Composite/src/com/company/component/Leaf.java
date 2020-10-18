package com.company.component;

import com.company.iterator.NullIterator;

import java.util.Iterator;

public class Leaf implements Component {

    private final String description;

    public Leaf(String description) {
        this.description = description;
    }

    @Override
    public String execute() {
        return description;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }

    @Override
    public Iterator<Component> iterator() {
        return new NullIterator();
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "description='" + description + '\'' +
                '}';
    }
}
