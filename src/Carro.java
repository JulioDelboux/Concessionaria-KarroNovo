import java.util.Scanner;
public class Carro extends Automotor {
    private Integer qtdPortas;

    Scanner scanner = new Scanner(System.in);

    public Carro() {
        super(combustivel, codigo, cor, marca, modelo, valor);
        System.out.println("Digite a quantiade de Portas do carro: ");
        this.qtdPortas = scanner.nextInt();
        this.exibir();
    }

    public Carro(Integer qtdPortas, String combustivel, Integer codigo, String cor, String marca, String modelo, Double valor) {
        super(combustivel, codigo, cor, marca, modelo, valor);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void editar(){
        System.out.println(" Quantidade de Portas atuais: " + this.qtdPortas);
        System.out.println(" Digite a Quantidade de Portas do Veiculo: ");
        this.qtdPortas = scanner.nextInt();

    }
    @Override
    public void exibir(){
        System.out.println(" Quantidade de Portas: " + this.qtdPortas);
    }
}
