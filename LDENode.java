package ED;
public class LDENode {
    private LDENode ant;
    private Pessoa info;
    private LDENode prox;

    public LDENode (Pessoa novaPessoa) {
        this.info = novaPessoa;
    }
    
    public void setInfo (Pessoa novaPessoa) {
        this.info = novaPessoa;
    }
    
    public void setProx (LDENode novoProx) {
        this.prox = novoProx;
    }
    
    public void setAnt (LDENode novoAnt) {
        this.ant = novoAnt;
    }
    
    public Pessoa getInfo() {
        return this.info;
    }
    
    public LDENode getProx () {
        return this.prox;
    }
    
    public LDENode getAnt () {
        return this.ant;
    }
}
