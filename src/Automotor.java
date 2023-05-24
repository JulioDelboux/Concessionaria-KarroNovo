public abstract class Automotor extends Veiculo{
    private String combustivel;
    public Automotor(String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        System.out.println("Qual o tipo de combustivel que o carro utilliza?");
        System.out.println("G - Gasolina");
        System.out.println("A - Álcool");
        System.out.println("F - Flex");
        System.out.println("E - Elétrico");
        System.out.println("D - Diesel");
        this.combustivel = scanner.nextln();

        if (combustivel.equals("G") || combustivel.equals("A") || combustivel.equals("F") || combustivel.equals("E") || combustivel.equals("D")) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Tipo de combustivel invalido");
        }
    }
    public Automotor(String tipoCombustivel, String codigo, String cor, String marca, String modelo, String valor){
        super(codigo, cor, marca, modelo, valor);
    }

    public abstract void editar();
    public abstract void exibir();
}
