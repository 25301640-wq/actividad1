import java.util.Stack;

public class HistorialAcciones {

   private Stack<String> acciones = new Stack<>();

   public void guardarAccion(String accion) {
       acciones.push(accion);
   }

   public String deshacerAccion() {

       if (acciones.isEmpty()) {
           return null;
       }

       return acciones.pop();
   }
}