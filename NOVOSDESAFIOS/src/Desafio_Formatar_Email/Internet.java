package Desafio_Formatar_Email;

import java.util.ArrayList;
import java.util.List;

public class Internet {
    public static List<Usuario> listaDeUsuarios = new ArrayList<>();

    public static void cadastrarUsuario(Usuario usuario){
        listaDeUsuarios.add(usuario);
    }

    public static Usuario getUsuario(String enderecoDeEmail){
        for(int i = 0; i < listaDeUsuarios.size(); i++){
            if(listaDeUsuarios.get(i).getEmail().equals(enderecoDeEmail)){
                return listaDeUsuarios.get(i);
            }
        }
        System.out.println("Não foi encontrado usuário com este email");
        return null;
    }
}
