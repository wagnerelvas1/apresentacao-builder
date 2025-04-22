public class Main {
    public static void main(String[] args) throws Exception {
        Sanduiche misto = new Sanduiche("pão de forma", "queijo mussarela", null, false, false, false, false, false, false, false, false, false, false);
        Sanduiche x_salada = new Sanduiche("pão brioche", "queijo mussarela", null, true, true, true, true, false, false, false, true, false, false);
        Sanduiche x_tudo = new Sanduiche("pão brioche", "queijo mussarela", "maionese verde", true, true, true, true, true, true, true, true, true, true);
        
        System.out.println("\n\n\n\n");
        
        misto.mostrarIngredientes();
        x_salada.mostrarIngredientes();
        x_tudo.mostrarIngredientes();
    }
}
