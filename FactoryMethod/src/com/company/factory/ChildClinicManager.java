package com.company.factory;

import com.company.model.clinics.ChildClinic;
import com.company.model.clinics.Clinic;

public class ChildClinicManager extends Manager {
    public ChildClinicManager() {
        createClinic();
    }

    @Override
    Clinic createClinic() {
        return new ChildClinic();
    }
}
