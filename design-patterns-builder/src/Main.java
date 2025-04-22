public class Main {
    public static void main(String[] args) throws Exception {
        BuilderSanduiche builder = new BuilderSanduiche();
        Diretor diretor = new Diretor(builder);

        diretor.prepararMisto();
        Sanduiche misto = builder.finalizarSanduiche();

        diretor.prepararXSalada();
        Sanduiche x_salada = builder.finalizarSanduiche();
        
        diretor.prepararXTudo();
        Sanduiche x_tudo = builder.finalizarSanduiche();
        
        misto.mostrarIngredientes();
        x_salada.mostrarIngredientes();
        x_tudo.mostrarIngredientes();
    }
}
