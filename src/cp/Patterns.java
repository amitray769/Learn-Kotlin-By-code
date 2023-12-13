package cp;

public class Patterns {
    public static void main(String[] args) {
        pattern7SecondWay();
    }

    /**
     * pattern type
     * *****
     * *****
     * *****
     * *****
     * *****
     **/
    private static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * pattern type
     * *
     * **
     * ***
     * ****
     * *****
     **/
    private static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * pattern type
     * 1
     * 12
     * 123
     * 1234
     * 12345
     **/
    private static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * pattern type
     * 1
     * 22
     * 333
     * 4444
     * 55555
     **/
    private static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * pattern type
     * *****
     * ****
     * ***
     * **
     * *
     **/
    private static void pattern5() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * pattern type
     * 12345
     * 1234
     * 123
     * 12
     * 1
     **/
    private static void pattern6() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * pattern type
     * <p>
     * *
     * ***
     * *****
     * *******
     * *********
     **/
    private static void pattern7() {
        int[] oddNum = {1, 3, 5, 7, 9};
        int count = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) {
                    for (int k = 0; k < oddNum[count]; k++) {
                        System.out.print("*");
                        j += count;
                    }
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
            count++;
        }
    }

    /**
     * pattern type
     * <p>
     * *
     * ***
     * *****
     * *******
     * *********
     **/
    private static void pattern7SecondWay() {
        int[] oddNum = {1, 3, 5, 7, 9};
        int count = 0;

        for (int i = 1; i <= 5; i++) {

            //print spaces here
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            //print "*" here
            for (int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }

            //print spaces here
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
            count++;
        }
    }


}



