package com.company.factory;

import com.company.model.Patient;
import com.company.model.clinics.Clinic;

public abstract class Manager {

    public void addNewPatient(Patient patient){
        var clinic = createClinic();
        clinic.addNewPatient(patient);
    }

    abstract Clinic createClinic();

}
