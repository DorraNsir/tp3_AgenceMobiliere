package tpVehicule;

import tpVehicule.AgenceMobiliere;
import tpVehicule.Vehicule;

public class Main {
    public static void main(String[] args) {
        Vehicule v=new Vehicule("clio","classique",2000,20.000);
        Vehicule w=new Vehicule("mercedes","Fantome",2008,60.000);
        Vehicule x=new Vehicule("kia","picanto",2012,35.000);
        AgenceMobiliere ag=new AgenceMobiliere(3);
        ag.ajoutVehicule(v);
        ag.ajoutVehicule(w);
        ag.ajoutVehicule(x);
        ag.affiche();
        System.out.println("**********************");
        ag.selection("mercedes");
        System.out.println("**********************");
        ag.selection(40.000);
        System.out.println("**********************");
        ag.ancienne();


    }
}