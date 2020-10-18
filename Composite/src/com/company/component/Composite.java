package com.company.component;

import com.company.iterator.CustomIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component{

    List<Component> childList;
    private Iterator<Component> iterator;

    public Composite() {
        childList = new ArrayList<>();
    }

    @Override
    public void addNewComponent(Component comp){
        childList.add(comp);
        iterator = childList.iterator();
    }

    @Override
    public boolean removeComponent(Component comp){
        int index = childList.indexOf(comp);

        if(index<0) return false;
        else childList.remove(index);
        iterator = childList.iterator();
        return true;
    }

    @Override
    public String execute() {
        var ans = new StringBuilder();
        for(var i: childList)
            ans.append(i.execute()).append("\n");
        return ans.toString();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Component next() {
        return iterator.next();
    }

    @Override
    public Iterator<Component> iterator() {
        return new CustomIterator(iterator);
    }

    @Override
    public String toString() {
        return "Composite{" +
                "childList=" + childList +
                '}';
    }
}
