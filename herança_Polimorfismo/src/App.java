public class App {
    public static void main(String[] args) throws Exception {
        // Exemplo de como utilizar a sobrecarga:
        Circulo c = new Circulo();
        Circulo c2 = new Circulo(2.3f);
        // OBS -> Sobrecarga é o mesmo atributo com assinaturas diferentes, e com assinaturas diferentes reagem diferente
        Retangulo r = new Retangulo();
        Triangulo t = new Triangulo();
        // Uma classe generica, consigo acessar com as demais classes a partir da herança;
        c.area = 0.9f;
        c.perimetro = 0.3f;
        c.calculaArea();
        c.calculaPerimetro();

        r.area = 0.0f;
        r.perimetro = 0.0f;
        
        // Exemplo de sobrecarga:
        c2.calculaArea();
        c2.calculaArea(2.3f);
    }
}
