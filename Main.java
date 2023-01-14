import model.veiculos.Carro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Commit inicial.");

        Carro carro = new Carro();

        System.out.println(carro.getModel());
        carro.setModel("Alabama");
        System.out.println(carro.getModel());
    }
}
