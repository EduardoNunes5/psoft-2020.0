public class MarioFogo implements SituacaoMarioI{
    @Override
    public void pegarCogumelo(Mario mario) {
        mario.pontuacao += 1000;
    }

    @Override
    public void levarDano(Mario mario) throws Exception {
        mario.setSituacaoMario(new MarioGrande());
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.pontuacao += 1000;
    }

    public String toString(){
        return "2";
    }
}
