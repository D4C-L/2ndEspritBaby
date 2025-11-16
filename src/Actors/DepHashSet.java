package Actors;

import Management.IDepartement;

import java.util.*;

public class DepHashSet implements IDepartement<Departement>{

    private HashSet<Departement> deps;

    public DepHashSet() {
        this.deps = new HashSet<>();
    }

    @Override
    public void ajouterDep(Departement departement) {
        deps.add(departement);
    }

    @Override
    public boolean rechercherDep(String nom) {
        Iterator<Departement> it = deps.iterator();
        while (it.hasNext())
            if (it.next().getNom().equals(nom))
                return true;
        return false;
    }

    @Override
    public boolean rechercherDep(Departement dep) {
        return deps.contains(dep);
    }

    @Override
    public void deleteDep(Departement departement) {
        Iterator<Departement> it = deps.iterator();
        while (it.hasNext())
            if (it.next().equals(departement)) {
                it.remove();
                return;
            }
    }

    @Override
    public void afficheDep() {
        for (Departement dep : deps)
            System.out.println(dep);
    }

    @Override
    public void trierDepParId() {
        ArrayList<Departement> list = new ArrayList<>(deps);
        IdComparator idComparator = new IdComparator();
        list.sort(idComparator);
        for (Departement dep : list)
            System.out.println(dep);
    }

    @Override
    public void trierDepParNomEtNbrEmps() {
        ArrayList<Departement> list = new ArrayList<>(deps);
        NameEmpsComparator NEComparator = new NameEmpsComparator();
        list.sort(NEComparator);
        for (Departement dep : list)
            System.out.println(dep);
    }
}

class IdComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        return  d1.getId()-d2.getId();
    }
}

class NameEmpsComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        int n=d1.getNom().compareTo(d2.getNom());
        if(n!=0)
            return n;
        return d1.getNbrEmps()-d2.getNbrEmps();
    }
}


