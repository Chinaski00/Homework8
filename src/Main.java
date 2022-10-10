public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] oneMassive = new int[3];
        double[] twoMassive = {1.57, 7.654, 9.986};
        long[] treeMassive = {221341, 251241, 123123};

        //Задача 2
        oneMassive[0] = 1;
        oneMassive[1] = 2;
        oneMassive[2] = 3;
        System.out.println(oneMassive[0] + ", " + oneMassive[1] + ", " + oneMassive[2]);
        System.out.println(twoMassive[0] + ", " + twoMassive[1] + ", " + twoMassive[2]);
        System.out.println(treeMassive[0] + ", " + treeMassive[1] + ", " + treeMassive[2]);

        //Задача 3
        System.out.println(oneMassive[2] + ", " + oneMassive[1] + ", " + oneMassive[0]);
        System.out.println(twoMassive[2] + ", " + twoMassive[1] + ", " + twoMassive[0]);
        System.out.println(treeMassive[2] + ", " + treeMassive[1] + ", " + treeMassive[0]);

        //Задача 4
        for (int i = 0; i < 3; i++) {
            if (oneMassive[i] % 2 == 0){
                System.out.println(oneMassive[i]);
            } else {
                oneMassive[i]++;
                System.out.println(oneMassive[i]);
            }
        }
    }
}