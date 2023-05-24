public class Caminhao {
    public class Caminhao extends Automotor{
        private Double cargaMaxima;
        private Integer eixos;

        public Caminhao(){
            super();
            System.out.println("Digite a carga maxima do veiculo: ");
            this.cargaMaxima = scanner.nextDouble();
            System.out.println("Digite a quantidade de eixos do veiculo: ");
            this.eixos = scanner.nextInt();
            this.exibir();
        }
        public Caminhao(Double cargaMax, Integer numEixos, String tipoCombustivel, String codigo, String cor, String marca, String modelo, String valor){
            super(combustivel, codigo, cor, marca, modelo, valor);
            this.cargaMaxima = cargaMax;
            this.eixos = numEixos;
        }

        public void editar(){
            super.editar();
            System.out.println("A carga maxima atual em Kg é: " + this.cargaMaxima);
            System.out.println("Qual será a nova carga maxima? ");
            this.cargaMaxima = scanner.nextDouble();

            System.out.println("O numero de eixos atual é: " + this.eixos);
            System.out.println("Qual será o novo numero de eixos? ");
            this.eixos = scanner.nextInt();

        }
        @Override
        public void exibir(){
            super.exibir();
            System.out.println("A carga Maxima em Kg é: " + this.eixos );
            System.out.println("O numero de eixos é: " + this.cargaMaxima);
        }
    }
}
