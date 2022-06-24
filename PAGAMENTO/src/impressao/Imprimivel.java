package impressao;
public interface Imprimivel {
    //Quero indicar o que pode ser impresso na impressora


    public String getCabecalhoPagina();
    public String getCorpo();

    // Não importa quais são os dados imprimíveis, só
    // preciso definir quais partes são imprimíveis
}
