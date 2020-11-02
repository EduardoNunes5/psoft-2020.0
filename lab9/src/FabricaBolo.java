public abstract class FabricaBolo {


    private FabricaCobertura fabricaCobertura;

    public FabricaBolo(FabricaCobertura fabricaCobertura) {
        this.fabricaCobertura = fabricaCobertura;
    }

    public FabricaBolo(){
    }

    public final void preparaBolo(){
        fazerMassa();
        levarAoForno();
        if(fabricaCobertura != null)
            fabricaCobertura.fazerCobertura();
        decorarBolo();
    }

    public void setFabricaCobertura(FabricaCobertura fb){
        this.fabricaCobertura = fb;
    }

    private void decorarBolo(){
        System.out.println("Decora bolo");
    }


    private  void levarAoForno(){
        System.out.println("Leva ao forno");
    }

    protected  abstract void fazerMassa();
}
