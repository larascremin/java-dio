package metodos;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("tv ligada " + smartTv.ligada);
        System.out.println("canal atual  " + smartTv.canal);
        System.out.println("volume " + smartTv.volume);

        smartTv.ligar();
        System.out.println("tv ligada " + smartTv.ligada);

        smartTv.aumentar();
        smartTv.aumentar();
        System.out.println("volume " + smartTv.volume);

        smartTv.escolherCanal(15);
        System.out.println("canal atual  " + smartTv.canal);

    }

}
