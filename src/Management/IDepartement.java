package Management;

import Actors.Departement;

public interface IDepartement<T> {
    void ajouterDep(T t);
    boolean rechercherDep(String nom);
    boolean rechercherDep(T t);
    void deleteDep(T t);
    void afficheDep();
    void trierDepParId();
    void trierDepParNomEtNbrEmps();
}
