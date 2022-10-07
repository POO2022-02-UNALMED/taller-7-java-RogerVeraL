package comunicacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Vera
 */
public class Fabula extends Escrito{
    private String ensenanza,interpretacion;

    
    
    //constructor

    public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    //getter & setter
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
 
    //metodos
    @Override
    public int palabrasTotales(int p){
        int factor=1;
        return getPaginas()* p *factor;
    }
    @Override
    public String interpretacion(){
        return getInterpretacion();
    }
    @Override
    public String toString(){
        return getOrigen()+"\n"+  getTitulo()+"\n"+  getAutor()+"\n"+ getPaginas()+"\n"+ getEnsenanza();
    }
}
