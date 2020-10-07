import java.util.List;

public class Projeto {
    public int d;
    public boolean isEntregue() {
        return false;
    }
    public List<Cliente> getClientes() {
        return null;
    }

    public String checar(){
        if (d < 90) {
            // verifica se projeto ainda está em andamento
            if (!isEntregue()) {
                // projeto ainda em andamento e com prazo curto para entrega
                return "Projeto está apertado" ;
            } else {
                return "Projeto entregue";}
        }
        else {
            avisaAtraso();
            return "Projeto atrasado";
        }
    }

    private void avisaAtraso() {
        List<Cliente> clients = getClientes();
        for (Cliente c : clients) {
            c.avisaAtraso(d);
        }
    }
}
