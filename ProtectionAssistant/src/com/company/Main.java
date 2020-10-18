package com.company;

import com.company.model.OwnerInvocationHandler;
import com.company.model.Person;
import com.company.model.PersonInterface;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        PersonInterface person = getOwnerProxy(new Person("viktor"));
        System.out.println(person.getName());
        person.setHotOrNot(12);
    }

    static PersonInterface getOwnerProxy(PersonInterface person) {

        return (PersonInterface) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
