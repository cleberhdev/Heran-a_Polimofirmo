public class Circulo extends Forma2D{
    float raio = 0.0f;
    float PI = 3.1416f;
    @Override
    float calculaArea(){
        super.area = PI*raio*raio;
        return super.area;
    }
}
