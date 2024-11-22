public class CaminhaoEncapsulamento {
    private String modelo;
    private double capacidadedeCarga;

    //Construtor
    public CaminhaoEncapsulamento(String modelo, double capacidadedeCarga) {
        this.modelo = modelo;
        this.capacidadedeCarga = capacidadedeCarga;
    }

    // Métodos públicos para acessar os dados
    public String getModelo() {
        return modelo;
    }

    public double getcapacidadedeCarga() {
        return capacidadedeCarga;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setcapacidadedeCarga(double capacidadedeCarga) {
        if(capacidadedeCarga < 0) {
            throw new IllegalArgumentException("A capacidade de carga não pode ser negativa");
        }
        this.capacidadedeCarga = capacidadedeCarga;
    }

    // Método principal
    public static void main(String[] args) {
        // Criando um objeto caminhão
        CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento("volvo FH", 25.5);

        // Exibindo os dados do caminhão
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Capacidade de Carga: " + caminhao.getcapacidadedeCarga() + " toneladas ");

        // Atualizando os dados do caminhão
        caminhao.setModelo("Scania R450");
        caminhao.setcapacidadedeCarga(30.0);

        //Exibindo os dados atualizados
        System.out.println("Modelo atualizado: " + caminhao.getModelo());
        System.out.println("Capacidade de Carga atualizada: " + caminhao.getcapacidadedeCarga() + " toneladas ");
    }



}