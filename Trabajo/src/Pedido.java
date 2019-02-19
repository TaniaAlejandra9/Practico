
/**
 *
 * @author Tania Quilachamin
 */
public class Pedido implements Comparable<Pedido> {
private int diasProduccion;
private double contaminacion;

public Pedido(int diasProduccion,double contaminacin){
    this.diasProduccion = diasProduccion;
    this.contaminacion = contaminacion;
}

public int diasProduccion() {
    return diasProduccion;
}

public double contaminacionTotal(){
    return contaminacion;
}
        
    @Override
    public int compareTo(Pedido p) {
        return(int)(contaminacion/diasProduccion - p.contaminacion/p.diasProduccion);
        
    }
}
