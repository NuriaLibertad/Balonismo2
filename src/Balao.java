public class Balao {

    // Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    int capacidade;
    double valorBalao;

    //Métodos
    public String voar(Combustívle gasPropano){
        return "voando com" + gasPropano;
    }
}
