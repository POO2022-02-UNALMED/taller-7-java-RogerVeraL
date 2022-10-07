package comunicacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Vera
 */
public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;
    
    //constructor

    public Alfabeto( String origen,String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
       
//getter & setter
    public static String[] getLetras(){
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //metodos
    public int cantidadLetras() {
        return getLetras().length;
    }
    @Override
    public String interpretacion(){
        return getInterpretacion();
    }
    @Override
    public String toString(){
        String cadena= "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
        return cadena;
    }
}
