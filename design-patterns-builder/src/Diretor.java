public class Diretor {
  private BuilderSanduiche builder;

  public Diretor(BuilderSanduiche builder) {
    this.builder = builder;
  }

  public void prepararMisto() {
    builder.limparChapa();
    builder.adicionarPao("pão de forma");
    builder.adicionarQueijo("queijo mussarela");
    builder.adicionarPresunto();
  }

  public void prepararSmash() {
    builder.limparChapa();
    builder.adicionarPao("pão brioche");
    builder.adicionarQueijo("queijo cheddar");
    builder.adicionarHamburguer();
    builder.adicionarCebola();
  }

  public void prepararXSalada() {
    builder.limparChapa();
    builder.adicionarPao("pão brioche");
    builder.adicionarQueijo("queijo mussarela");
    builder.adicionarPresunto();
    builder.adicionarHamburguer();
    builder.adicionarAlface();
    builder.adicionarTomate();
    builder.adicionarOvo();
  }

  public void prepararXBacon() {
    builder.limparChapa();
    builder.adicionarPao("pão brioche");
    builder.adicionarQueijo("queijo mussarela");
    builder.adicionarPresunto();
    builder.adicionarHamburguer();
    builder.adicionarAlface();
    builder.adicionarTomate();
    builder.adicionarOvo();
    builder.adicionarBacon();
  }

  public void prepararXTudo() {
    builder.limparChapa();
    builder.adicionarPao("pão brioche");
    builder.adicionarQueijo("queijo mussarela");
    builder.adicionarMolho("maionese verde");
    builder.adicionarPresunto();
    builder.adicionarHamburguer();
    builder.adicionarAlface();
    builder.adicionarTomate();
    builder.adicionarCebola();
    builder.adicionarPicles();
    builder.adicionarBacon();
    builder.adicionarOvo();
    builder.adicionarFileFrango();
    builder.adicionarBananaFrita();
  }

}
