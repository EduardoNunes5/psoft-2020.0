public class Negrito implements IFormataTexto {
    @Override
    public String formata(String texto) {
        return "\033[0;1m"+ texto +"\033[0;0m";
    }
}
