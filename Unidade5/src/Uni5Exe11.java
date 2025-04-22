public class Uni5Exe11 {
    public static void main(String[] args) {
        int qtdBiscoitos = 0;
        for (int hora = 1; hora <= 16; hora++){
            switch (hora) {
                case 1:
                    qtdBiscoitos++;
                    break;
                case 2:
                    qtdBiscoitos += 3;
                    break;
            
                default:
                    qtdBiscoitos *= 3;
                    break;
            }

        }

        System.out.println("Quantidade de Biscoitos quebrados no dia: "+qtdBiscoitos);
    }
}