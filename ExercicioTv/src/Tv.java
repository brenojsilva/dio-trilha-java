import java.util.Scanner;

public class Tv {
    boolean ligada=false;
    int canal=0;
    float brilho=50;
    String fonte;
    int opcao;
    Scanner scanner = new Scanner(System.in);

    public int aumentar(int valor, int incremento){
        return valor + incremento;
    }

    public int diminuir(int valor, int incremento){
        return valor - incremento;
    }

    public boolean ligar(){
        return ligada=true;
    }

    public boolean desligar(){
        return ligada=false;
    }

    public int mudarCanal(){
        System.out.print("Digite o novo canal: ");
        canal = scanner.nextInt();
        return canal;
    }

    public float mudarBrilho(){
        System.out.print("Digite o novo brilho: ");
        brilho = scanner.nextFloat();
        return brilho;
    }

    public void mudarFonte(String novaFonte) {
        fonte = novaFonte;
    }
}