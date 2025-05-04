public class Uni5Exe21 {
    public static void main(String[] args) {

        double alturaInicial_Chico = 1.5;
        double alturaInicial_Ze = 1.1;

        int anos = 0;

        while (alturaInicial_Chico > alturaInicial_Ze) {

            alturaInicial_Chico += 0.02;
            alturaInicial_Ze += 0.03;

            anos++;
        }

        System.out.println("São necessários " + anos + " anos para que o Zé fique maior do que o Chico.");

    }
}
