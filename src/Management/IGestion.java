package Management;

public interface IGestion<T> extends IRechercheAvancee<T> {
    void ajouterEmployee(T t);
    boolean rechercherEmployee(T t);
    boolean rechercherEmployee(String nom);
    void supprimerEmployee(T t);
    void displayEmployee();
    void trierEmployeeParId();
    void trierEmployeParNomDepartementEtGrade();
}
