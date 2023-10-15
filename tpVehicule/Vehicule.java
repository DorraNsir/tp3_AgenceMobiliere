package tpVehicule;

public class Vehicule {
    private  int num;
    private String marque;
    private String  modele;
    private int annee;
    private double prix;
    private static int count;

    public Vehicule(String marque, String modele, int annee, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        count++;
    }
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;

    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele=" + modele +
                ", annee=" + annee +
                ", prix=" + prix +
                '}';
    }
    public String  decrisVehicule(){
        return this.toString();
    }

}
