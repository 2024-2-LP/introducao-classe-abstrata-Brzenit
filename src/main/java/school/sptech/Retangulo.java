package school.sptech;

public class Retangulo extends Figura {

    private Double altura;
    private Double base;

    public Retangulo() {
    }
    public Retangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularArea() {
        return altura * base;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
