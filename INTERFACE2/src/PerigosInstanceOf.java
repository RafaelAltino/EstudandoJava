// Validações de herança, neste caso para detectar 
// se o objeto pode ser um Gerente que extende  Funcionario 
// ou se é mesmo um Funcionario.

// if (objeto instanceof Funcionario) {
//     System.out.println("É ou Extende Funcionario");
//     // Se for Gerente também vai entrar aqui!!!
//     // Por isso não é seguro/exato
// }
// if (objeto instanceof Gerente) {
//     System.out.println("É ou Extende Gerente");
// }
// if (objeto.getClass().getSuperclass().equals(Funcionario.class)) {
//     System.out.println("Extende Funcionario");
// }
// if (objeto.getClass().equals(Funcionario.class)) {
//     System.out.println("É Funcionario");
// }
// if (objeto.getClass().equals(Gerente.class)) {
//     System.out.println("É Gerente");
// }


public class PerigosInstanceOf {
    
}
