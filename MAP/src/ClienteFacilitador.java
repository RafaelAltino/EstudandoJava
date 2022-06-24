import java.util.Map;

public class ClienteFacilitador {
    public static <T> T inicializa(Map<String, String> dados, Class<T> cls){
        if(cls.equals(PessoaFisica.class)){
            PessoaFisica p = new PessoaFisica();
        }
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome(dados.get("nome"));
        pessoa.setCpf(dados.get("cpf"));
        return null;
    }
}
