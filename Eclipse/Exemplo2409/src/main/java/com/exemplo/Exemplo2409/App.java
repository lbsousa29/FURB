package com.exemplo.Exemplo2409;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RoupaCasa r = new RoupaCasa(4, "rosa");
        System.out.println(r.getCor());
        System.out.println(r.getTamanho());
        r.usar();
        
    }
}
