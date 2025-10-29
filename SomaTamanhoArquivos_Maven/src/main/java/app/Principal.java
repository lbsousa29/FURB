package app;

import java.io.File;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        

      

        try {
            File diretorio = new File("C:\\Users\\lbsousa\\Documents\\FURB");

            if (!diretorio.exists() || !diretorio.isDirectory()) {
                throw new diretorio ("Erro: o diretório informado não existe!");
            }

            long tamanhoTotalBytes = calcularTamanho(diretorio);
            double tamanhoMB = tamanhoTotalBytes / (1024.0 * 1024.0);

            System.out.printf("Tamanho total dos arquivos: %.2f MB%n", tamanhoMB);

        } catch ( diretorio e) {
            System.out.println(e.getMessage());
        } finally {
            
        }
    }

    public static long calcularTamanho(File diretorio) {
        long tamanho = 0;

        File[] arquivos = diretorio.listFiles();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isFile()) {
                    tamanho += arquivo.length();
                } else if (arquivo.isDirectory()) {
                    tamanho += calcularTamanho(arquivo);
                }
            }
        }

        return tamanho;
    }
}
