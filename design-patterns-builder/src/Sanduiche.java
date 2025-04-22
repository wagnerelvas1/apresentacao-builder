public class Sanduiche {
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

  public Sanduiche(String pao, String queijo, String molho, boolean presunto, boolean hamburguer, boolean alface, boolean tomate, boolean cebola, boolean picles, boolean bacon, boolean ovo, boolean file_frango, boolean banana_frita) {
    this.pao = pao;
    this.queijo = queijo;
    this.molho = molho;
    this.presunto = presunto;
    this.hamburguer = hamburguer;
    this.alface = alface;
    this.tomate = tomate;
    this.cebola = cebola;
    this.picles = picles;
    this.bacon = bacon;
    this.ovo = ovo;
    this.file_frango = file_frango;
    this.banana_frita = banana_frita;
  }

  public void mostrarIngredientes() {
    System.out.printf("Ingredientes do Sanduíche:\n%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
    this.pao != null ? this.pao+"\n" : "", 
    this.queijo != null ? this.queijo+"\n" : "", 
    this.molho != null ? this.molho+"\n" : "", 
    this.presunto ? "presunto\n" : "", 
    this.hamburguer ? "hamburguer\n" : "", 
    this.alface ? "alface\n" : "", 
    this.tomate ? "tomate\n" : "", 
    this.cebola ? "cebola\n" : "", 
    this.picles ? "picles\n" : "", 
    this.bacon  ? "bacon \n" : "",
    this.ovo  ? "ovo\n" : "",
    this.file_frango ? "filé de frango\n" : "", 
    this.banana_frita ? "banana frita\n" : "");
  }
}
