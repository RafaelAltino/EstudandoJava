public class Argumentos {
    public static void main(String[] args) throws Exception {

        if(args != null && args.length > 0){
            for(String s : args){
                System.out.println(s);
            }
        } else{
            System.out.println("Sem Args");
        }










    }
}
