public class Cliente {
    public static void main(String[] args) {
        FabricaBolo fBoloChocolate = new BoloDeChocolate(new CoberturaCaramelo());
        fBoloChocolate.preparaBolo();

        FabricaBolo fBoloBaunilha = new BoloDeBaunilha(new CoberturaMorango());
        fBoloBaunilha.preparaBolo();
    }
}
