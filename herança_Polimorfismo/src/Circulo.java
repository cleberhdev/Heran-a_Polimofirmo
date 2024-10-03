public class Circulo extends Forma2D{
    float raio;
    float PI = 3.1416f;
    // Polimorfismo por sobregarga -> Não depende da herança, porque de acordo a assinatura ele muda dentro na mesma classe
    public Circulo(){
        this.raio = 0;
    }
    public Circulo(float raio){
        this.raio = raio;
        this.calculaArea();
    }
    // Polimofirsmo por Override -> Só funciona se herdar, porque sobrescreve o método na classe filho
    // Logo depende de herança
    @Override // Sobreposição
    float calculaArea(){
        super.area = PI*this.raio*this.raio;
        return super.area;
    }
    float calculaArea(float raio){
        super.area = PI*raio*raio;
        return super.area;
    }
}
