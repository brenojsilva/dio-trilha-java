package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("942394293");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Michael Jackson");
        iphone.exibirPagina(null);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.atender();
        iphone.iniciarCorreioVoz();

    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    @Override
    public void tocar() {
       System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MUSICA DO " + musica + " SELECIONADA");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("PAGINA EXIBIDA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ADICIONADA");
    }

    @Override
    public void atender() {
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }
}
