
/**
 *
 * @author Tania Quilachamin
 */
public class ResuelveVa {

    public static Pedido[] resuelve(Pedido[] pedidos){
       SolParcial sol = new SolParcial(pedidos);
       
       boolean encontradaSolucion = resuelveRec(pedidos, sol);
          
            if(encontradaSolucion)       
                return sol.ordenDeFabricacion();
            else
                return null;
    }
    
    private static boolean resuelveRec(Pedido [] pedidos, SolParcial sol){
        if(sol.numPedidosIncluidos() == pedidos.length){
            return true;
        }
        for(Pedido p: pedidos){
            if(sol.pedidoIncluido(p) || !sol.factible(p)) 
                continue;
            
            sol.añadePedido(p);
            boolean encontradaSolucion = resuelveRec(pedidos,sol);
            
            if(encontradaSolucion)
                return true;
            
            sol.eliminaPedido(p);
        }
        return false;
    }

 }
    