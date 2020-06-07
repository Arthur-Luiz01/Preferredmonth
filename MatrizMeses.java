import java.util.Scanner;

class MesesAnos {
   public static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {
        String[] meses = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        int[][] MesesAnos = new int[12][5];
        char continuar = 's';
        char resposta = 'n';
        while (continuar == 's') {
            while (resposta == 'n') {
                for (int i = 0; i < MesesAnos.length; i = i + 1) {
                    for (int j = 0; j < MesesAnos[0].length; j = j + 1) {
                        System.out.printf("Seu mês preferido foi Mês [%d] do Ano [%d]: ?", i + 1, j + 1);
                        System.out.println(" ");
                        resposta = a.next().charAt(0);
                        if (resposta == 's') {
                            MesesAnos[i][j] += 1;
                            j = MesesAnos.length;
                            i = MesesAnos.length;
                        }
                    }
                }
            }
            System.out.println("Há outro candidato para se entrevistar ?");
            continuar = a.next().charAt(0);
            if (continuar == 's') 
                resposta = 'n';
        }
        System.out.println("ANO 12 13 14 15 16 \nMÊS");
        for (int i = 0; i < MesesAnos.length; i = i + 1) {
            System.out.print(meses[i] + " ");
            for (int j = 0; j < MesesAnos[0].length; j = j + 1) {
                System.out.print(" "+MesesAnos[i][j]+" ");
            }
            System.out.println("");
        }
    }
 
}