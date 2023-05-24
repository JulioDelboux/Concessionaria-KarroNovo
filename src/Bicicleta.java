public class Bicicleta extends Veiculo {
    private String freio;

    public Bicicleta() {
        super();
        do {
            System.out.println("Digite o Tipo de Freio para a Bicicleta:");
            System.out.println("C - Cantilever");
            System.out.println("V - V-Brake");
            System.out.println("F - Ferradura");
            System.out.println("M - Disco Mecânico");
            System.out.println("H - Disco Hidráulico");

            String freio = scanner.next();
            scanner.nextLine();

            switch (tipoFreio.toUpperCase()) {
                case "C":
                case "V":
                case "F":
                case "M":
                case "H":
                    this.freio = tipoFreio;
                    tipoFreioValido = true;
                    break;
                default:
                    System.out.println("Digite um valor válido para o Tipo de Freio!");
                    break;
            }
        } while (!tipoFreioValido);

        this.exibir();
    }

    public Bicicleta(String tipoFreio, String codigo, String cor, String marca, String modelo, String valor) {
        super(codigo, cor, marca, modelo, valor);
        this.freio = tipoFreio;
    }

    public void editarVeiculo() {
        super.editar();
        boolean tipoFreioValido = false;

        do {
            System.out.println("Tipo de Freio Atual: " + this.freio);
            System.out.println("Digite o novo Tipo de Freio para a Bicicleta:");
            System.out.println("C - Cantilever");
            System.out.println("V - V-Brake");
            System.out.println("F - Ferradura");
            System.out.println("M - Disco Mecânico");
            System.out.println("H - Disco Hidráulico");

            String tipoFreio = scanner.next();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (tipoFreio.toUpperCase()) {
                case "C":
                case "V":
                case "F":
                case "M":
                case "H":
                    this.freio = tipoFreio;
                    tipoFreioValido = true;
                    break;
                default:
                    System.out.println("Digite um valor válido para o Tipo de Freio!");
                    break;
            }
        } while (!tipoFreioValido);
    }

    public void exibir() {
        System.out.println("Bicicleta Selecionada");
        super.exibir();
        System.out.println("O tipo de freio é: " + this.freio);
    }
}