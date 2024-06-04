public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[]{2, 4, 6, 7};

        System.out.println("Задание 2");
        for (int index = 0; index < array1.length; index++) {
            if (index == array1.length - 1) {
                System.out.println(array1[index]);
                break;
            }
            System.out.print(array1[index] + ", ");
        }

        for (int index = 0; index < array2.length; index++) {
            if (index == array2.length - 1) {
                System.out.println(array2[index]);
                break;
            }
            System.out.print(array2[index] + ", ");
        }

        for (int index = 0; index < array3.length; index++) {
            if (index == array3.length - 1) {
                System.out.println(array3[index]);
                break;
            }
            System.out.print(array3[index] + ", ");
        }

        System.out.println("Задание 3 ");
        for (int index = array1.length-1; index > -1; index--) {
            if (index == 0) {
                System.out.println(array1[index]);
                break;
            }
            System.out.print(array1[index] + ", ");
        }

        for (int index = array2.length-1; index > -1 ; index--) {
            if (index == 0) {
                System.out.println(array2[index]);
                break;
            }
            System.out.print(array2[index] + ", ");
        }

        for (int index = array3.length-1; index > -1; index--) {
            if (index == 0) {
                System.out.println(array3[index]);
                break;
            }
            System.out.print(array3[index] + ", ");
        }

        System.out.println("Задание 4 ");
        for (int index = 0; index < array1.length; index++) {
            if ((index == array1.length - 1) && (array1[index]%2 != 0)) {
                array1[index] +=1;
                System.out.println(array1[index]);
                break;
            }
            if ((index == array1.length - 1) && (array1[index]%2 == 0)) {
                System.out.println(array1[index]);
                break;
            }
            if ((array1[index]%2 == 0)) {
                System.out.print(array1[index] + ", ");
            }else {
                array1[index] +=1;
                System.out.print(array1[index] + ", ");
            }
        }
    }
}