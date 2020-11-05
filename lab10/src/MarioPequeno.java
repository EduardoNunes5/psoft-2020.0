public class MarioPequeno implements SituacaoMarioI {
    @Override
    public void pegarCogumelo(Mario mario) {
        mario.setSituacaoMario(new MarioGrande());
    }

    @Override
    public void levarDano(Mario mario) throws Exception {
        throw new Exception("Mario morreu");
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.setSituacaoMario(new MarioFogo());
    }

    public String toString(){
        return "0";
    }
}
