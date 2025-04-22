public class BuilderSanduiche implements Builder {
  private String pao;
  private String queijo;
  private String molho;
  private boolean presunto;
  private boolean hamburguer;
  private boolean alface;
  private boolean tomate;
  private boolean cebola;
  private boolean picles;
  private boolean bacon;
  private boolean ovo;
  private boolean file_frango;
  private boolean banana_frita;

  public void limparChapa() {
    this.pao = null;
    this.queijo = null;
    this.molho = null;
    this.presunto = false;
    this.hamburguer = false;
    this.alface = false;
    this.tomate = false;
    this.cebola = false;
    this.picles = false;
    this.bacon = false;
    this.ovo = false;
    this.file_frango = false;
    this.banana_frita = false;
  }
  
  public void adicionarPao(String pao) {
    this.pao = pao;
  }

  public void adicionarQueijo(String queijo) {
    this.queijo = queijo;
  }

  public void adicionarMolho(String molho) {
    this.molho = molho;
  }

  public void adicionarPresunto() {
    this.presunto = true;
  }

  public void adicionarHamburguer() {
    this.hamburguer = true;
  }

  public void adicionarAlface() {
    this.alface = true;
  }

  public void adicionarTomate() {
    this.tomate = true;
  }

  public void adicionarCebola() {
    this.cebola = true;
  }

  public void adicionarPicles() {
    this.picles = true;
  }

  public void adicionarBacon() {
    this.bacon = true;
  }

  public void adicionarOvo() {
    this.ovo = true;
  }

  public void adicionarFileFrango() {
    this.file_frango = true;
  }

  public void adicionarBananaFrita() {
    this.banana_frita = true;
  }

  public Sanduiche finalizarSanduiche() {
    Sanduiche sanduiche = new Sanduiche(pao, queijo, molho, presunto, hamburguer, alface, tomate, cebola, picles, bacon, ovo, file_frango, banana_frita);
    limparChapa();
    return sanduiche;
  }
}
