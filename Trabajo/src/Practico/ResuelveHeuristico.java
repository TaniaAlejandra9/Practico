package Practico;
import Practico.Pedido;
import java.util.Arrays;

/**
 *
 * @author Tania Quilachamin
 */

public class ResuelveHeuristico {
    
    public static Pedido[] resuelve (Pedido [] pedidos){
        SolParcial sol = new SolParcial(pedidos);
        
        Arrays.sort(pedidos);
        
        for(Pedido p: pedidos){
            if(!sol.factible(p)){
                return sol.ordenDeFabricacion();
            }
            
            sol.añadePedido(p);
        }   
            return sol.ordenDeFabricacion();
        }
    }