package tpVehicule;

public class AgenceMobiliere {
    public Vehicule[] tab;
    public int max;
    public int nb = 0;

    public AgenceMobiliere(int max) {
        this.max = max;
        tab = new Vehicule[max];
    }

    public void ajoutVehicule(Vehicule v) {
        if (nb < this.max) {
            tab[nb] = new Vehicule(v.getMarque(), v.getModele(), v.getAnnee(), v.getPrix());
            this.nb++;
        } else
            System.out.println("no space");

    }

    public void selection(int n) {
        if (n < this.nb && n >= 0)
            System.out.println(tab[n].toString());
        else
            System.out.println("n'existe pas");
    }

    public void selection(String mq) {
        boolean test = false;
        for (int i = 0; i < this.max; i++) {
            if (mq == tab[i].getMarque()) {
                test = true;
                System.out.println(tab[i].decrisVehicule());
            }

        }
        if (!test)
            System.out.println("il n’y a pas de véhicules de cette marque");
    }

    public void selection(Double px) {
        boolean test = false;
        for (int i = 0; i < this.max; i++) {
            if (tab[i].getPrix() < px) {
                test = true;
                System.out.println(tab[i].decrisVehicule());
            }
        }
        if (!test) {
            System.out.println("« il n’y a pas de véhicules dans cette marge de prix");
        }
    }

    public void affiche() {
        for (int i = 0; i < nb; i++) {
            selection(i);
        }

    }
public void ancienne(){
       Vehicule  min=tab[0];
    for (int i = 1; i < nb; i++) {
        if(tab[i].getAnnee()<min.getAnnee()){
            min=tab[i];

        }
    }
    System.out.println(min);
}

}

