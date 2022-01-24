package es.lvo;

public class Main {

    public static void main(String[] args) {
        int numero;

        for (int i = 0; i <= 15; i++){
            numero = (int) (Math.random() * 3);
            System.out.print("Partido " + i + " : ");

            if (numero == 0){
                System.out.println("X");
            } else if (numero == 1){
                System.out.println("1");
            } else if (numero == 2){
                System.out.println("2");
            }
        }
    }
}
