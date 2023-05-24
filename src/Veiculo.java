public class Veiculo{
    private String codigo;
    private String cor;
    private String marca;
    private String modelo;
    private String valor;

    public Veiculo(String codigo, String cor, String marca, String modelo, String valor) {
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }
    public Veiculo(){

        System.out.println("Digite o Código do veiculo");
        this.codigo = scanner.nextInt();

        System.out.println("Digite a marca do veiculo");
        this.marca = scanner.next();

        System.out.println("Digite o modelo do veiculo");
        this.modelo = scanner.next();

        System.out.println("Digite a cor do veiculo");
        this.cor = scanner.next();

        System.out.println("Digite o valor do veiculo");
        this.valor = scanner.nextDouble();

    }

class Concessionaria {
    private List<Veiculo> estoque;

    public Concessionaria() {
        estoque = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        estoque.add(veiculo);
    }

    public void listarEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Veiculo veiculo : estoque) {
                System.out.println(veiculo);
            }
        }
    }
}