public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(array1[i]);
        }
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        int[] array3 = {1, 5, 23, 63, 59};
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < (array1.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < (array2.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] array3 = {1, 5, 23, 63, 59};
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i < (array3.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = (array1.length - 1); i > -1; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = (array2.length - 1); i > -1; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] array3 = {1, 5, 23, 63, 59};
        for (int i = (array3.length - 1); i > -1; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println("Было:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < (array1.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Прибавили 1 к нечетным числам:");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2 !=0) {
                array1[i]++;
            }
            System.out.print(array1[i]);
            if (i < (array1.length - 1)) {
                System.out.print(", ");
            }
        }
    }

}