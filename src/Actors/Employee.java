package Actors;

public class Employee {
    int id;
    String nom;
    String prenom;
    String nomDep;
    int grade;

    public  Employee(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }
    public  Employee(){}

    public int getId() {return id;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public void setId(int id) {this.id = id;}
    public void setNom(String nom) {this.nom = nom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public void setNomDep(String nomDep) {this.nomDep = nomDep;}
    public void setGrade(int grade) {this.grade = grade;}
    public int getGrade() {return grade;}
    public String getNomDep() {return nomDep;}

    public String toString(){return "id: "+id+"\nNom: "+nom + "\nPrenom: " + prenom + "\nGrade: " + grade + "\nNom de Departement: " + nomDep;}

}
