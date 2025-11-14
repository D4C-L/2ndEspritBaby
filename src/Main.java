import Actors.Employee;
import Actors.Societe;

public class Main {
    public static void main(String[] args) {
        Societe s = new Societe();
        Employee employee=new Employee(3, "ManOF", "Steal", "lowel", 21);
        s.ajouterEmployee(employee);
        s.ajouterEmployee(new Employee(1, "xavier", "xmen", "lowel", 16));
        s.ajouterEmployee(new Employee(2, "Robbin", "DaHood", "theni", 17));
        s.ajouterEmployee(new Employee(4, "Anes", "Chammakhi", "theni", 1));
        s.ajouterEmployee(new Employee(5, "Funny", "Valentine", "lowel", 20));
        System.out.println("-----------------------------------------------\nRecherche:");
        if(s.rechercherEmployee("ManOF"))
            System.out.println("He s here");
        else
            System.out.println("He s not here");
        System.out.println(s.rechercherEmployee(employee));
        System.out.println("-----------------------------------------------\nAffichage:");
        s.displayEmployee();
        System.out.println("-----------------------------------------------\nTriage par ID:");
        s.trierEmployeeParId();
        s.displayEmployee();
        System.out.println("-----------------------------------------------\nTriage par Nom, Departement et grade:");
        s.trierEmployeParNomDepartementEtGrade();
        s.displayEmployee();
        System.out.println("-----------------------------------------------\nRecherche par departement:");
        Societe.display(s.rechercherParDepartement("lowel"));
    }
}