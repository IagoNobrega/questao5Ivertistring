public class InverterString {
    public static void main(String[] args) {
        String original = "Estágio Ribeirão Preto";
        String invertida = inverterString(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (fim > inicio) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
