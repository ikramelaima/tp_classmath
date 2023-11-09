public class Complxe extends math {
    public double img;
    public double re;

    public Complxe(double x, double y){
        this.img = x;
        this.re = y;
    }

    public Complxe ajout(Complxe z1){
        Complxe som = new Complxe(0, 0);
        som.re = this.re + z1.re;///3+2i
        som.img = this.img + z1.img;//3+4i
        return som;
    }

    public Complxe soustraction(Complxe z1) {
        Complxe diff = new Complxe(0, 0);
        diff.re = this.re - z1.re;
        diff.img = this.img - z1.img;
        return diff;
    }

    public Complxe multiplication(Complxe z1) {
        Complxe produit = new Complxe(0, 0);
        produit.re = this.re * z1.re - this.img * z1.img;
        produit.img = this.re * z1.img + this.img * z1.re;
        return produit;
    }

    public double module() {
        return Math.sqrt(this.re * this.re + this.img * this.img);
    }

    public String affiche() {
        return this.re + " + " + this.img + "i";
    }

    public static void main(String[] args) {
        Complxe C1 = new Complxe(3, 2);
        Complxe C2 = new Complxe(1, 1);

        Complxe somme = C1.ajout(C2);
        Complxe difference = C1.soustraction(C2);
        Complxe produit = C1.multiplication(C2);

        System.out.println("Somme : " + somme.affiche());
        System.out.println("Différence : " + difference.affiche());
        System.out.println("Produit : " + produit.affiche());
    }
}
