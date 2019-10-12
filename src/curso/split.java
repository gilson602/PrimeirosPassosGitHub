package curso;

public class split {
    public static void main(String[] args) {
        String lista = "abacate maçã limão melancia melão laranja";
        String[] fruta = lista.split(" ");
        for (int i=0; i < 6; i++) {
            System.out.println("Fruta " + (i+1) + ": " + fruta[i]);
    
        }
    }
}
