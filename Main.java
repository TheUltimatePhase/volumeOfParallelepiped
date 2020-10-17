import java.util.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Math;

class Main {
    public static int[] createVector(int[] intArraya, int[] intArrayn) {
        int[] finalVector = new int[3];
        for (int i = 0; i < 3; i++) {
            finalVector[i] = intArrayn[i] - intArraya[i];
        }
        return finalVector;
    }

    public static void main(String[] args) {
        int[] intArraya = new int[3];
        int[] intArrayb = new int[3];
        int[] intArrayc = new int[3];
        int[] intArrayd = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first point- ");
        String a = sc.nextLine();
        System.out.print("Enter second point- ");
        String b = sc.nextLine();
        System.out.print("Enter third point- ");
        String c = sc.nextLine();
        System.out.print("Enter fourth point- ");
        String d = sc.nextLine();
        String[] aSplit = a.split(", ");
        String[] bSplit = b.split(", ");
        String[] cSplit = c.split(", ");
        String[] dSplit = d.split(", ");
        int i = 0;
        for (String pleaseWork : aSplit) {
            intArraya[i] = Integer.parseInt(pleaseWork);
            i++;
        }
        i = 0;
        for (String pleaseWork : bSplit) {
            intArrayb[i] = Integer.parseInt(pleaseWork);
            i++;
        }
        i = 0;
        for (String pleaseWork : cSplit) {
            intArrayc[i] = Integer.parseInt(pleaseWork);
            i++;
        }
        i = 0;
        for (String pleaseWork : dSplit) {
            intArrayd[i] = Integer.parseInt(pleaseWork);
            i++;
        }
        int[] vector1 = createVector(intArraya, intArrayb);
        int[] vector2 = createVector(intArraya, intArrayc);
        int[] vector3 = createVector(intArraya, intArrayd);
        int[] crossProduct = new int[3];
        for (int j = 0; j < 3; j++) {
            crossProduct[j] = (vector1[(j + 1) % 3] * vector2[(j + 2) % 3])
                    - (vector2[(j + 1) % 3] * vector1[(j + 2) % 3]);
        }
        int finalSolution = 0;
        for (int k = 0; k < 3; k++) {
            finalSolution += Math.pow((vector3[k] * crossProduct[k]), 2);
        }
        System.out.println(finalSolution);
    }
}