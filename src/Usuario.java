public class Usuario {
    public static void main(String[] args) {
        Tv tv = new Tv();
        
        System.out.println("Tv: " + tv.ligada);
        System.out.println("Canal " + tv.canal);
        System.out.println("Brilho: " + tv.brilho);
        System.out.println("Fonte: " + tv.fonte);

        tv.ligar();
        tv.canal = 12;
        tv.brilho = tv.aumentar((int) tv.brilho, 10); // Assuming 10 is the second argument
        tv.mudarFonte("PS4");

        System.out.println("Tv: " + tv.ligada);
        System.out.println("Canal " + tv.canal);
        System.out.println("Brilho: " + tv.brilho);
        System.out.println("Fonte: " + tv.fonte);
    }
}
