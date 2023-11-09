public class Poly extends math  {
    private double[] coeff;

    public Poly(double[] coeff) {
        this.coeff = coeff;
    }

    public Poly addition(Poly P) {
        int len = Math.max(this.coeff.length, P.coeff.length);
        double[] result = new double[len];

        for (int i = 0; i < this.coeff.length; i++) {
            result[i] += this.coeff[i];
        }

        for (int i = 0; i < P.coeff.length; i++) {
            result[i] += P.coeff[i];
        }

        return new Poly(result);
    }

    public Poly soustraction(Poly P) {
        int len = Math.max(this.coeff.length, P.coeff.length);
        double[] result = new double[len];

        for (int i = 0; i < this.coeff.length; i++) {
            result[i] += this.coeff[i];
        }

        for (int i = 0; i < P.coeff.length; i++) {
            result[i] -= P.coeff[i];
        }

        return new Poly(result);
    }

    public Poly multiplication(Poly P) {
        int len = this.coeff.length + P.coeff.length - 1;
        double[] result = new double[len];

        for (int i = 0; i < this.coeff.length; i++) {
            for (int j = 0; j < P.coeff.length; j++) {
                result[i + j] += this.coeff[i] * P.coeff[j];
            }
        }

        return new Poly(result);
    }

    public String affiche() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coeff.length; i++) {
            sb.append(coeff[i] + "x^" + i + " ");
        }
        return sb.toString();
    }

    public double module() {
        return 0.0;
    }

    public static void main(String[] args) {
        double[] coeffs1 = { 1, 2, 3 };
        double[] coeffs2 = { 3, 2, 1 };

        Poly p1 = new Poly(coeffs1);
        Poly p2 = new Poly(coeffs2);

        Poly somme = p1.addition(p2);
        Poly difference = p1.soustraction(p2);
        Poly produit = p1.multiplication(p2);

        System.out.println("Somme : " + somme.affiche());

        System.out.println("Différence : " + difference.affiche());

        System.out.println("Produit : " + produit.affiche());
    }
}
