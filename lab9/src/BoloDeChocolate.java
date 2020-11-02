public class BoloDeChocolate extends FabricaBolo{

    public BoloDeChocolate(FabricaCobertura fabricaCobertura) {
        super(fabricaCobertura);
    }

    @Override
    protected void fazerMassa() {
        System.out.println("Faz massa de chocolate");
    }
}
