public class Quadrado extends PoligonoRegular{
    public Quadrado(Integer numLados, Float tamlado) {
        super(numLados, tamlado);
    }

    public float calcularArea() {
        return getTamlado()*getTamlado();
    }
}
