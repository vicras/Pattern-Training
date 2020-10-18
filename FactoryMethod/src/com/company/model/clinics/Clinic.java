package com.company.model.clinics;

import com.company.model.Patient;

public interface Clinic {
    String getClinicName();
    default void addNewPatient(Patient patient){
        System.out.println("Patient " + patient.getName() + " was added to " + getClinicName());
    }

}
