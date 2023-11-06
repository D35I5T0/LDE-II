package ED;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op;
        String nome = null, rg = null;
        Pessoa novaPessoa = new Pessoa(nome, rg);
        LDEPessoas lista = new LDEPessoas();
        do {
            menu();
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.println("Informe o nome e o RG da pessoa, respectivamente: ");
                    nome = sc.nextLine();
                    rg = sc.nextLine();
                    novaPessoa = new Pessoa(nome, rg);
                    lista.inserir(novaPessoa);
                    break;
                case 2:
                    lista.cancelarEntrada(); 
                    break;
                case 3: 
                    lista.exibirDados();
                    break;
                case 4:
                    System.out.println("Informe o RG da pessoa");
                    rg = sc.nextLine();
                    novaPessoa = new Pessoa(nome, rg);
                    LDENode result = lista.buscar(novaPessoa);
                    if (result == null) {
                        System.out.println("Ela não está presente");
                    }
                    else {
                        System.out.println("Ela está presente");
                    }
                    break;
                case 5:
                    System.out.println(lista.verificarQuantidade()); 
                    break;
                case 6:
                    System.out.println("Informe o nome e o RG da pessoa, respectivamente: ");
                    nome = sc.nextLine();
                    rg = sc.nextLine();
                    novaPessoa = new Pessoa(nome, rg);
                    lista.remover(novaPessoa);
                    break;
                case 0: 
                    System.out.println("Fim");
                    break;
                default: 
                    System.out.println("Opção errada");
            }
        } while (op != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Cancelar entrada");
        System.out.println("3 - Exibir informações");
        System.out.println("4 - Procurar pessoa");
        System.out.println("5 - Informar quantidade de pessoas no prédio");
        System.out.println("6 - Remover o cadastro");
        System.out.println("0 - Finalizar programa");
    }
}
