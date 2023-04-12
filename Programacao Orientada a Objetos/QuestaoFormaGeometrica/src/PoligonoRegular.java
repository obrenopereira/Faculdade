public abstract class PoligonoRegular {
    public int numLados;
    public float tamlado;

    public PoligonoRegular() {
        super();
    }

    public PoligonoRegular(Integer numLados, Float tamlado) {
        this.numLados = numLados;
        this.tamlado = tamlado;
    }

    public float calcularPerimetro(){

        return numLados * tamlado;
    };

    public abstract float calcularArea();

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public float getTamlado() {
        return tamlado;
    }

    public void setTamlado(float tamlado) {
        this.tamlado = tamlado;
    }
}
