public class Usuario {
    public static void main(String[] args) {
        Tv tv = new Tv();
        

        tv.ligar();
        tv.mudarCanal();
        tv.mudarBrilho();
        tv.mudarFonte("PS4");
        

        System.out.println("Tv: " + tv.ligada);
        System.out.println("Canal " + tv.canal);
        System.out.println("Brilho: " + tv.brilho);
        System.out.println("Fonte: " + tv.fonte);
    }
}
