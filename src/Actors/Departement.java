package Actors;

public class Departement {
    private int id;
    private String nom;
    private int nbrEmps;

    public Departement(int id, String nom, int nbrEmps) {
        this.id = id;
        this.nom = nom;
        this.nbrEmps = nbrEmps;
    }

    public Departement() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public int getNbrEmps() {return nbrEmps;}
    public void setNbrEmps(int nbrEmps) {this.nbrEmps = nbrEmps;}

    public boolean equals(Departement departement) {return this.id == departement.id && this.nom.equals(departement.nom);}

    public String toString() {return "ID: " + this.id+"\nNom du Departement: " + this.nom + "\nNombre d'employes: " + this.nbrEmps;}

}
