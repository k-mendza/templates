package com.templates.structural.adapter;

public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap instance;


    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.instance = employeeFromLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    // this method can be a step into decorator pattern instead of adapter
    @Override
    public String toString() {
        return "EmployeeAdapterLdap{" +
                "instance=" + instance +
                '}';
    }
}
