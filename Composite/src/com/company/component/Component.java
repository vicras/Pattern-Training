package com.company.component;

import java.util.Iterator;

public interface Component extends Iterator<Component>, Iterable<Component> {
    String execute();

    default public boolean removeComponent(Component comp){
        throw new UnsupportedOperationException();
    }

    default public void addNewComponent(Component comp){
        throw new UnsupportedOperationException();
    }
}
