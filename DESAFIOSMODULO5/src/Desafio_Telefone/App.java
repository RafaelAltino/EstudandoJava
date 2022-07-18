package Desafio_Telefone;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args)throws Exception {
        List<Map<String, String>> contatos = List.of(
            Map.of("nome", "João", "telefone", "9329823423"),
            Map.of("nome", "Maria", "telefone", "9124235435"),
            Map.of("nome", "Marta", "telefone", "9456335387"),
            Map.of("nome", "José", "telefone", "9632874738"),
            Map.of("nome", "Ana", "telefone", "9632844878"),
            Map.of("nome", "Carlos", "telefone", "9632855538"),
            Map.of("nome", "Zuleica", "telefone", "9632867638"),
            Map.of("nome", "Fernando", "telefone", "9632861638"),
            Map.of("nome", "Romilda", "telefone", "9632874738"),
            Map.of("nome", "Judas", "telefone", "9329244683")
        );

        contatos.stream()
            .filter( s -> s.get("telefone").contains("7"))
            .sorted((s1, s2) -> s1.get("nome").compareTo(s2.get("nome")))           
            .forEach( s -> System.out.println(s.get("nome")));
    }
}
