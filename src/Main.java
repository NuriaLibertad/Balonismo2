public class Main {

    public static void main(String[] args) {
        //Construir balão
        Balao b1 = new Balao();
        //Acionar voo do balão
        //Chmada do método voar();
        String resposta = b1.voar(new Combustívle());
        // Apresentacao de retorno
        System.out.println(resposta);
        Balao b2 = new Balao()
        Combustivel alcool = new Combustivel();
        System.out.println(b2.voar(alcool));

    }
}