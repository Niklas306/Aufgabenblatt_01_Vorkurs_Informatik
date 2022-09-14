import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] zahlenMenge = {1, 3, 41, 435, 4323, 5, 20};

        System.out.println("----------");
        inverse(zahlenMenge);
        System.out.println("----------");
        rufeMinSucheAuf(zahlenMenge);
        System.out.println("----------");
        rufeMaxSucheAuf(zahlenMenge);
        System.out.println("----------");
        rufeFuenfteilbarAuf(zahlenMenge);
        System.out.println("----------");
    }

    public static int minSuche(Integer[] r, int s) {
        int wmerker = r[s];
        int imerker = s;
        int i = s;
        int n = r.length;
        while (i < n) {
            if (r[i] < wmerker) {
                wmerker = r[i];
                imerker = i;
            }
            i++;
        }
        return imerker;
    }

    public static void rufeMinSucheAuf(Integer[] zahlen) {
        Integer[] zahlenMenge = zahlen;
        int n = zahlenMenge.length;
        int i = 0;

        int k;
        while (i < n - 1) {
            k = minSuche(zahlenMenge, i);
            int merker = zahlenMenge [i];
            zahlenMenge[i] = zahlenMenge[k];
            zahlenMenge[k] = merker;
            i++;
        }
        i = 0;
        while (i < n) {
            System.out.println("MinSuche: " + zahlenMenge[i]);
            i++;
        }
    }

    public static int maxSuche(Integer[] r, int s) {
        int wmerker = r[s];
        int imerker = s;
        int i = s;
        int n = r.length;
        while (i < n) {
            if (r[i] > wmerker) {
                wmerker = r[i];
                imerker = i;
            }
            i++;
        }
        return imerker;
    }

    public static void rufeMaxSucheAuf(Integer[] zahlen) {
        Integer[] zahlenMenge = zahlen;
        int n = zahlenMenge.length;
        int i = 0;

        int k;
        while (i < n - 1) {
            k = maxSuche(zahlenMenge, i);
            int merker = zahlenMenge [i];
            zahlenMenge[i] = zahlenMenge[k];
            zahlenMenge[k] = merker;
            i++;
        }
        i = 0;
        while (i < n) {
            System.out.println("MaxSuche: " + zahlenMenge[i]);
            i++;
        }
    }
    public static boolean fuenfteilbar(Integer[] array, int index) {
        int merker = array[index];
        if (merker % 5 == 0) {
            return true;
        }
        return false;
    }

    public static void rufeFuenfteilbarAuf(Integer[] zahlen) {
        Integer[] zahlenMenge = zahlen;
        int n = zahlenMenge.length;
        int i = 0;

        while (i < n) {
            if (fuenfteilbar(zahlenMenge, i) == true) {
                System.out.println("Fünfteilbar: " + zahlenMenge[i]);
            }
            i++;
        }
    }

    public static void inverse(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println(list);
    }
}
