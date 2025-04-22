public class Uni5Exe10 {
    public static void main(String[] args) {
         int soma = 0, resultado = 0, contador = 0;
         String termoFinal = "";
         for (int numero1 = 1; numero1 < 10000; numero1++){
             for (int numero2 = 1; numero2 < 10000; numero2++){
                 soma = numero1+numero2;
                 resultado = soma * soma;
                 termoFinal = resultado + "";
                 if (termoFinal.equals(numero1+""+numero2)){
                     System.out.println(numero1+" + "+numero2 +
                                        " = "+soma+" -> "+soma+
                                        "² = "+resultado);
                     contador++;
                     if (contador >= 10){
                         break;
                     }
                 }
                 
                 if (contador >= 10){
                     break;
                 }
 
             }
         }
    } 
 }