public class Triangulo extends PoligonoRegular{

    public Triangulo(Integer numLados, Float tamlado) {
        super(numLados, tamlado);
    }

    public float calcularArea() {
        return (getTamlado() * getTamlado())/2;
    }
}
