package com.company;

import com.company.component.Component;
import com.company.component.Composite;
import com.company.component.Leaf;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Component tree = new Composite();
//        tree.addNewComponent(new Leaf("leaf 1"));
//        tree.addNewComponent(new Leaf("leaf 2"));
//        tree.addNewComponent(new Leaf("leaf 3"));

        Composite comp = new Composite();
        comp.addNewComponent(new Leaf("leaf 2.1"));
        comp.addNewComponent(new Leaf("leaf 2.2"));
        comp.addNewComponent(new Leaf("leaf 2.3"));
        Composite comp2 = new Composite();
        comp2.addNewComponent(new Leaf("leaf3.1"));
        comp2.addNewComponent(new Leaf("leaf3.2"));
        Composite comp3 = new Composite();
        comp3.addNewComponent(new Leaf("leaf4.1"));
        comp3.addNewComponent(new Leaf("leaf4.2"));
        comp2.addNewComponent(comp3);
        comp.addNewComponent(comp2);
        tree.addNewComponent(comp);


        String execute = tree.execute();

        System.out.println(execute);

        Iterator<Component> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************************");
        for(var i: tree){
            System.out.println(i);
        }
    }
}
