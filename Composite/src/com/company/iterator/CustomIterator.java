package com.company.iterator;

import com.company.component.Component;

import java.util.Iterator;
import java.util.Stack;

public class CustomIterator implements Iterator<Component> {
    Stack<Iterator<Component>> iteratorStack;

    public CustomIterator(Iterator<Component> iterator) {
        iteratorStack = new Stack<>();
        iteratorStack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(iteratorStack.isEmpty()) return false;

        Iterator<Component> iter = iteratorStack.peek();

        if(iter.hasNext()){
            return true;
        }else{
            iteratorStack.pop();
            return hasNext();
        }
    }

    @Override
    public Component next() {
        if(hasNext()){
            Iterator<Component> iter = iteratorStack.peek();
            Component next = iter.next();
            iteratorStack.push(next.iterator());

            return next;
        }
        return null;
    }
}
