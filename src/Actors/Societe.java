package Actors;

import Management.IGestion;

import java.util.ArrayList;
import java.util.List;

public class Societe implements IGestion<Employee> {
    List<Employee> employees;

    public Societe(List<Employee> employees) {
        this.employees = employees;
    }

    public Societe() {
        employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmployee(Employee employee) {employees.add(employee);}
    @Override
    public boolean rechercherEmployee(Employee employee){
        for(Employee e:employees)
            if(e.getNom().equals(employee.getNom()))
                return true;
        return false;
    }
    @Override
    public boolean rechercherEmployee(String nom){
        for(Employee e:employees)
            if(e.getNom().equals(nom))
                return true;
        return false;
    }
    @Override
    public void supprimerEmployee(Employee employee) {employees.remove(employee);}
    @Override
    public void displayEmployee() {
        for(Employee e:employees)
            System.out.println(e);
    }
    @Override
    public void trierEmployeeParId() {
        Employee swish;
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getId() > employees.get(j).getId()) {
                    swish = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, swish);
                }
            }
        }
    }
    @Override
    public void trierEmployeParNomDepartementEtGrade(){
        Employee swish;
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getGrade()>employees.get(j).getGrade()) {
                    swish = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, swish);
                }
            }
        }
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getNomDep().compareTo(employees.get(j).getNomDep())>0) {
                    swish = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, swish);
                }
            }
        }
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getNom().compareTo(employees.get(j).getNom())>0) {
                    swish = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, swish);
                }
            }
        }
    }
    @Override
    public List<Employee> rechercherParDepartement(String dep) {
        List<Employee> e = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getNomDep().equals(dep))
                e.add(employee);
        }
        return e;
    }
    public static void display(List<Employee> emps){
        for (Employee employee : emps)
            System.out.println(employee);
    }
}