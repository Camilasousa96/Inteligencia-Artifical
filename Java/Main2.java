// Superclasse Carro
class Carro {
    public void acelerar() {
        System.out.println("O carro esta acelerando.");
    }
}
// Subclasse Fusca
class Fusca extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Fusca acelera lentamente: Vruum!");
    }
}
// Subclasse Gol
class Gol extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Gol acelera com potência: Vruuuum!");

    }
}
// Subclasse Jetta
class Jetta extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Jetta acelera rapidamente: Vruuuuuum!");
    }
}
// Classe Principal para Testar o Polimorfismo
public class Main2 {
    public static void main(String[] args) {
        // Criando um Array de Carro
        Carro[] carros = new Carro[3];
        carros[0] = new Fusca();
        carros[1] = new Gol();
        carros[2] = new Jetta();

// Chamando o método acelerar() para cada carro
        for (Carro carro : carros) {
            carro.acelerar(); // Polimorfismo em ação
        }
    }
}


