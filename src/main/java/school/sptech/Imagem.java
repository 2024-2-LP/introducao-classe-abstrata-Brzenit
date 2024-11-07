package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {

    }


    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double resultado = 0.0;
        for(Figura figura : figuras){
            resultado += figura.calcularArea();
        }
        return resultado;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> resultado = new ArrayList<Figura>();
        for(Figura figura : figuras){
            if(figura.calcularArea() > 20){
                resultado.add(figura);
            }
        }
        return resultado;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();

        for(Figura figura : figuras){
            if(figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
