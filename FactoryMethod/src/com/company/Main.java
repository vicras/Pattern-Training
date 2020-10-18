package com.company;

import com.company.factory.ChildClinicManager;
import com.company.factory.InfectionClinicManager;
import com.company.factory.Manager;
import com.company.model.Patient;

public class Main {

    public static void main(String[] args) {
        addNewPatient(new Patient("Viktor"));

    }

    static void addNewPatient(Patient patient){
        Manager manager = new InfectionClinicManager();
        manager.addNewPatient(patient);
    }
}
