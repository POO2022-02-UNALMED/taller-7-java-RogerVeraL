package comunicacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Vera
 */
public class Periodico extends Escrito{
    private String fecha,primicia,interpretacion;
    
    //constructor

    public Periodico( String origen, String titulo, String autor, int paginas,String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }
    
    
    
    //getter & setter

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
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
        int factor=10;
        return getPaginas()* p *factor;
    }
    @Override
    public String interpretacion(){
        return getInterpretacion();
    }
    @Override
    public String toString(){
        return getOrigen()+"\n"+  getTitulo()+"\n"+  getAutor()+"\n"+ getPaginas()+"\n"+ getFecha()+"\n"+ getPrimicia();
    }
    
}
