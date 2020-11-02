public class BoloDeBaunilha extends FabricaBolo{
    public BoloDeBaunilha(FabricaCobertura fabricaCobertura) {
        super(fabricaCobertura);
    }

    public BoloDeBaunilha() {

    }

    @Override
    protected void fazerMassa() {
        System.out.println("Faz massa de baunilha");
    }
}
