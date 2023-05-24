import java.util.Scanner;

public class Moto extends Automotor {
    private Integer cilindradas;
    private Boolean partidaEletrica;

    public Moto(Integer cilindradas, Boolean partidaEletrica, String combustivel, String codigo, String cor, String marca, String modelo, String valor) {
        super(combustivel, codigo, cor, marca, modelo, valor);
    }

    Scanner scanner = new Scanner(System.in);

    public Moto() {
        super(combustivel, codigo, cor, marca, modelo, valor);
        System.out.println("A moto possui partida eletrica?");
        String partidaEletrica = scanner.nextLine();

        if (partidaEletrica == "Sim") {
            this.partidaEletrica = true;
        } else if (partidaEletrica == "Não") {
            this.partidaEletrica = false;
        }

        System.out.println("Quantas cilindradas a moto possui?");
        this.cilindradas = scanner.nextInt();

    }
    @Override
    public void exibir () {
        super.exibir();
        System.out.println("O combustivel usado na moto é: " + this.combustivel);
    }

    @Override
    public void editar() {
        super.editar();
        while (true) {
            System.out.println("Digite o Tipo de Combustível para o Veículo:");
            System.out.println("G - Gasolina");
            System.out.println("A - Álcool");
            System.out.println("F - Flex");
            System.out.println("E - Elétrico");
            System.out.println("D - Diesel");

            String combustivel = scanner.next();
            scanner.nextLine();

            switch (combustivel.toUpperCase()) {
                case "G":
                case "A":
                case "F":
                case "E":
                case "D":
                    this.combustivel = combustivel;
                    return;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}