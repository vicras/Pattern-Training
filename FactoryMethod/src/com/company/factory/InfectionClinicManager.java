package com.company.factory;

import com.company.model.clinics.Clinic;
import com.company.model.clinics.InfectionClinic;

public class InfectionClinicManager extends Manager {
    public InfectionClinicManager() {
        createClinic();
    }

    @Override
    Clinic createClinic() {
        return new InfectionClinic();
    }
}
