public class Italico implements IFormataTexto {
    @Override
    public String formata(String texto) {
        return "\033[0;3m"+ texto +"\033[0;0m";
    }
}
