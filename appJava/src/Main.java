public class Main {
    public static void main(String[] args) {
        byte edad = 18;
        int numeroGrande = 1000;
        double age = 15.5;

        System.out.println(numeroGrande);
        System.out.println(age);

        boolean isActive = true;
        char curso = 'A';

        System.out.println(isActive);
        System.out.println(curso);

        String text = "Hola Mundo!";

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);
        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mundo")); //Cuenta desde en la variable text lo que hay ante de mundo desde 0

        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());

        String malo = "   chanchito feliz  ";
        System.out.println(malo.trim()); // evita los espacios que se introducen en el string de malo
        System.out.println(malo);


        //Carácteres de escape

        String letras = "C:\\Hola \"Mundo\">";
        System.out.println(letras);

    }


}