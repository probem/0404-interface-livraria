public class App {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Roger", 23, "M");
        p[1] = new Pessoa("Zaca", 20, "M");

        l[0] = new Livro("Java", "Romario", 100, p[0]);
        l[1] = new Livro("JAVA POO", "Alexandre Azevedo", 400, p[1]);

        l[0].abrir();
        l[0].folhear(20);
        System.out.println(l[0].detalhes());

    }
}
