public class App {
    public static void main(String[] args) throws Exception {

        var pausa = new Thread( () -> pause());
        pausa.start();
        pausa.setDaemon(false);
        System.out.println("C");

        // System.out.println("1");
        // new Thread( () -> System.out.println("hello") ).start();
        // for(int i = 0; i < 9999999; i++){}
        // System.out.println("world");



    }

    public static void pause(){
        try{
            System.out.println("A");
            Thread.sleep(3000);
            System.out.println("B");
        } catch(InterruptedException e){
            System.out.println("E");
        }
    }
}
