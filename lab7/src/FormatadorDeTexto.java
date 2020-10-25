
public class FormatadorDeTexto {

    private String texto;

    public FormatadorDeTexto(){}

    public String getTextoFormatado(IFormataTexto formatador){
        return formatador.formata(this.texto);
    }

    public void setTexto(String novoTexto){
        this.texto = novoTexto;
    }
}
