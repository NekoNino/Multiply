public class Testing {



    public static void main (String []args) {

        for (int i = 1; i <= 10; i++) {

            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("______________________");

        for (int i = 1; i <= 10; i++) {

            System.out.print(i + " ");

            for (int m = 1; m <= 10; m++ ) {


                System.out.print(i * m + " ");
            }

            System.out.println();
        }
    }

}
