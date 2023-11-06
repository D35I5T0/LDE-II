package ED;
public class Pessoa implements Comparable <Pessoa> {
    private String nome;
    private String rg;
    
    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int compareTo(Pessoa p) {
        String rgNovo;
        rgNovo = p.getRg();
        return this.rg.compareTo(rgNovo);
    }
}
