public class Hamburguer {

    public  String nome;
    public Double valor;
    public Boolean tipoHamburguer;

    public Double valorHamburguer(Boolean tipoHamburguer){
        if(tipoHamburguer) return valor + 8.00;
        return valor;

    }

    public String ConsultarNome(){
        return nome;
    }



}
