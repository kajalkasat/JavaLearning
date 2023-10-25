package sortingTechniques;

public class SelectionSort {
    public static void main(String[] args) {

        int a[] = { 3, -2, 1, 7, 5, 9 };
        int n = a.length;

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        for (int e : a) 
        {
            System.out.print(e + " ");
        }

    }
}
