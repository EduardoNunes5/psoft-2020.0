public class CaixaAlta implements IFormataTexto {
    @Override
    public String formata(String texto) {
        return texto.toUpperCase();
    }
}
