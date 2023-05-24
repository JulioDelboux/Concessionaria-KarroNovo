public abstract class Automotor extends Veiculo{
    private String combustivel;
    public Automotor(String combustivel, String codigo, String cor, String marca, String modelo, String valor){
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
    public Automotor(String combustivel, String codigo, String cor, String marca, String modelo, String valor){
        super(codigo, cor, marca, modelo, valor);
        this.combustivel = combustivel;
    }

    @Override
    public void editar(){
        super.editar();
        System.out.println("Tipo Combustivel Atual: " + this.combustivel);
        System.out.println("Qual o novo tipo de combustivel");
        System.out.println("G - Gasolina");
        System.out.println("A - Álcool");
        System.out.println("F - Flex");
        System.out.println("E - Elétrico");
        System.out.println("D - Diesel");
        this.combustivel = scanner.next();

        while(!(this.combustivel.contains("G")  || this.combustivel.contains("A") || this.combustivel.contains("F") || this.combustivel.contains("E") || this.tipoCombustivel.contains("D"))){
            System.out.println(" Tipo Combustivel Atual: " + this.combustivel);
            System.out.println("Qual o novo tipo de combustivel");
            System.out.println("G - Gasolina");
            System.out.println("A - Álcool");
            System.out.println("F - Flex");
            System.out.println("E - Elétrico");
            System.out.println("D - Diesel");
            this.combustivel = scanner.next();
        }
    }

    @Override
    public void exibir(){
        super.exibir();
        System.out.println(" Tipo Combustivel: " + this.combustivel);
    }
}