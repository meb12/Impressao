public class Fila {
    private static Fila instancia = null;
    private void imprimeDocumento(){

    }
    private void removeDocumento(){

    }
    private void removeTodosDocumentos(){
        
    }
    private Fila(){

    }

    public static Fila getInstance(){
        if(instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }
}
