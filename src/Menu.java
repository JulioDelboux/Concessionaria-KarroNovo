import java.util.Scanner;

public class Menu {
    public Menu(){
        veiculos = new ArrayList<>();
        veiculos.add(new Carro(35, "G", 4, "Preto", "Volkswagen", "Golf", 59000.0));
        veiculos.add(new Carro(21, "G", 4, "Azul", "Volkswagen", "T-Cross", 92900.0));
        veiculos.add(new Carro(17, "E", 2, "Preto", "Chevrolet", "Celta", 14900.0));
        scanner = new Scanner(System.in);
    }
    public List<Veiculo> veiculos = new ArrayList<Veiculo>();
    Scanner scanner = new Scanner(System.in);
    public void exibirMenu(){
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Cadastrar novo veículo");
        System.out.println("2 - Editar veículo");
        System.out.println("3 - Ver informações de um veículo específico");
        System.out.println("4 - Excluir um veículo");
        System.out.println("5 - Ver todos os veículos");
        System.out.println("6 - Sair");

        Integer opcao = scanner.nextInt();


    switch (opcao){
        case 1:
            veiculo.cadastrarVeiculo();
            break;
        case 2:
            veiculo.editarVeiculo();
            break;
        case 3:
            veiculo.verInformacoes();
            break;
        case 4:
            veiculo.excluirVeiculo();
            break;
        case 5:
            veiculo.exibirVeiculo();
            break;
        case 6:
            veiculo.sair();
            break;
        case 7:
            return;
        default:
            System.out.println("Alternativa inválida. Por favor escolha outra.");

    }
    }
    public void cadastrarVeiculo(){
        System.out.println("Qual tipo de veículo sera cadastrado?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");
        System.out.println("4 - Bicicleta");
        System.out.println("5 - Voltar");

        Integer input = scanner.nextInt();

        switch (input) {
            case 1:
                this.veiculos.add(new Carro());
                break;
            case 2:
                this.veiculos.add(new Moto());
                break;
            case 3:
                this.veiculos.add(new Caminhao());
                break;
            case 4:
                this.veiculos.add(new Bicicleta());
                break;
            case 5:
                return;
            default:
                System.out.println("Alternativa inválida. Por favor escolha outra.");

        }
    }


    public void obterVeiculo(){
        Integer indice = this.getIndiceVeiculo();

        if(indice != -1){
            this.veiculos.get(indice).exibir();
        }else{
            System.out.println("Veiculo não encontrado");
        }
    }

    public void excluirVeiculo(){
        Integer indice = this.getIndiceVeiculo();

        if(indice != -1){
            System.out.println("Você tem certeza que deseja excluir esse veiculo?");
            this.veiculos.get(indice).exibir();
            System.out.println("Para confirmar digite SIM");
            Scanner obterValores = new Scanner(System.in);
            String valorDigitado = obterValores.nextLine();
            if(valorDigitado.equals("SIM")){
                this.veiculos.remove(this.veiculos.get(indice));
                System.out.println("Veiculo Excluido!");
            }else{
                System.out.println("Operação cancelada");
            }
        }else{
            System.out.println("Veiculo não localizado");
        }
    }

    public void editarVeiculo(){
        System.out.println("Edição de Veiculos");
        Integer indice = this.getIndiceVeiculo();

        if(indice != -1){
            System.out.println("Você estará editando o veiculo abaixo");
            this.veiculos.get(indice).exibir();
            this.veiculos.get(indice).editar();
        }else{
            System.out.println("Veiculo não encontrado");
        }
    }

    public Integer getIndiceVeiculo(){
        System.out.println("Digite o Nome ou o Codigo do veiculo");
        Scanner obterValores = new Scanner(System.in);
        Integer codigo = obterValores.nextInt();

        Integer indice = 0;
        for(Veiculo veiculo:this.veiculos){
            if(veiculo.getCodigo().equals(codigo)){ //Verifica se o CPF da conta é igual ao cpf passado
                return indice;
            }else{
                indice++;
            }
        }
        return -1;
    }
}

