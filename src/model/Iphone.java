package model;

public class Iphone implements Internet, Telefone, Ipod {

  @Override
  public void exibirPagina() {
    System.out.println("Exibe uma pagina");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adiciona uma nova aba");
  }

  @Override
  public void atulizarPagina() {
    System.out.println("Atualiza uma pagina");
  }

  @Override
  public void ligar() {
    System.out.println("Faz uma ligação");
  }

  @Override
  public void atender() {
    System.out.println("Atende uma ligação");
  }

  @Override
  public void iniciaCorreioVoz() {
    System.out.println("inicia correio de voz");
  }

  @Override
  public void selecionaMusica(String musica) {
    System.out.println("Você selecionou a musica" + musica);
  }

  @Override
  public void tocar() {
    System.out.println("Toma uma musica");
  }

  @Override
  public void pausar() {
    System.out.println("Pausa uma musica");
  }
}
