public class Mario {

    public long pontuacao = 0;
    public SituacaoMarioI situacaoMario = new MarioPequeno();

    public void pegarCogumelo() {
        situacaoMario.pegarCogumelo(this);
    }
    public void levarDano() throws Exception {
        situacaoMario.levarDano(this);
    }
    public void pegarFlor() {
        situacaoMario.pegarFlor(this);
    }

    public void setSituacaoMario(SituacaoMarioI novaSituacao){
        this.situacaoMario = novaSituacao;
    }

    @Override
    public String toString() {
        return "Mario{" +
                "pontuacao=" + pontuacao +
                ", situacaoMario=" + situacaoMario +
                '}';
    }
}
