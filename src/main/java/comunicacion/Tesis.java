package comunicacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Vera
 */
public class Tesis extends Escrito{
    private String idea;
    private static String[] argumentos;
    private String conclusion,referencias,interpretacion;
    
    //constructor

    public Tesis(String origen, String titulo, String autor, int paginas,String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }
    
    
    //getter & setter

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public static String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
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
        int factor=5;
        return getPaginas()* p *factor;
    }
    @Override
    public String interpretacion(){
        return getInterpretacion();
    }
    @Override
    public String toString(){
        return getOrigen()+"\n"+  getTitulo()+"\n"+  getAutor()+"\n"+ getPaginas()+"\n"+ getIdea()+"\n"+ getArgumentos().length+"\n"+ getConclusion()+"\n"+ getReferencias();
    }
    
}
