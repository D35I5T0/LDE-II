package ED;
public class LDEPessoas {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() {
        return this.primeiro == null && this.ultimo == null && this.qtd == 0;
    }

    public void inserir (Pessoa pessoa) {
        LDENode novo = new LDENode(pessoa);
        LDENode retorno = this.buscar(pessoa);
        if (retorno != null) {
            System.out.println("Valor já existe na lista.");
        }
        else {
            if (this.isEmpty() == true) {
                this.primeiro = novo;
                this.ultimo = novo;
                this.qtd++;
            }
            else {
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo = novo;
                this.qtd++;
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public LDENode buscar(Pessoa pessoa) {
        LDENode aux = this.primeiro;
        boolean achou = false;
        while (aux != null) {
            if (pessoa.compareTo(aux.getInfo()) == 0) {
                achou = true;
                break;
            } 
            else {
                aux = aux.getProx();
            }
        }
        if (achou == false) {
            return null;
        }
        else {
            return aux;
        }
    }

    public int verificarQuantidade() {
        return this.qtd;
    }

    public void exibirDados() {
        LDENode aux = this.primeiro;
        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
        } 
        else {
            while (aux != null) {
                Pessoa info = aux.getInfo();
                System.out.println(info.getNome());
                System.out.println(info.getRg());
                aux = aux.getProx();
            }
        }
    }

    public void remover(Pessoa pessoa) {
        Pessoa info1 = this.primeiro.getInfo();
        Pessoa info2 = this.ultimo.getInfo();

        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
        } 
        else if (info1.getRg().equals(pessoa.getRg())) {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            if (this.qtd == 0) {
                this.ultimo = null;
            } 
            else {
                this.primeiro.setAnt(null);
            }
            System.out.println("Remoção efetuada!");
        } 
        else if (info2.getRg().equals(pessoa.getRg())) {
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.setProx(null);
            this.qtd--;
            System.out.println("Remoção efetuada!");
        } 
        else {
            LDENode retorno = this.buscar(pessoa);
            LDENode anterior, proximo;
            if (retorno == null) {
                System.out.println("Valor não encontrado.");
            } 
            else {
                anterior = retorno.getAnt();
                proximo = retorno.getProx();
                anterior.setProx(proximo);
                proximo.setAnt(anterior);
                qtd--;
                System.out.println("Remoção efetuada!");
            }
        }
    }

    public void cancelarEntrada() {
        this.ultimo = this.ultimo.getAnt();
        this.ultimo.setProx(null);
        this.qtd--;
        System.out.println("Remoção efetuada!");
    }
}
