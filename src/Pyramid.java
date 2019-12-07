public class Pyramid {
    public static void main(String[] args) {
        int pyramidLength = 7;
        int halfPyramid = (pyramidLength/2) + 1;
        
        for (int i = 0; i < pyramidLength ; i++) {
            int numOfSpaces = halfPyramid - i;
            for (int j = 0; j < halfPyramid + i ; j++) {
                if (j <= numOfSpaces) {
                    System.out.print(" ");
                } else {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print("+");
                        } else {
                            System.out.print("-");
                        }
                    } else {
                        if (j % 2 == 0) {
                            System.out.print("+");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
    
    static void printHalfPyramid() {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
