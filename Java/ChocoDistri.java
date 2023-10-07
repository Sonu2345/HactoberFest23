import java.util.ArrayList;
import java.util.Arrays;


public class Main {
/*
    Recursive function to generate all subsets of size m from array a
    and store them in the subsets vector
*/

    public static void generateSubsets(int[] a, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> subsets, int m) {
        //Checking for index out of bound.
        if(index == a.length){
            
            // Base case: if current subset has size m, add it to subsets and return
            if (current.size() == m) {
                subsets.add(new ArrayList<>(current));
                return;
            }
            return;
        }
        
        // Recursive step: generate subsets by including and excluding each element starting from index
            
        //Dont Take Current
        generateSubsets(a, index + 1, current, subsets, m);
        
        //Take Current
        current.add(a[index]);
        generateSubsets(a, index + 1, current, subsets, m);
        current.remove(current.size() - 1);
        
    }

    public static int chocolateDistribution(int [] a, int n, int m){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        generateSubsets(a, 0, current, subsets, m);

        int minDiff = Integer.MAX_VALUE;
        
        /*
            Taking difference between maximum and minimum element from all
            possible subsets and storing the minimum difference possible.
        */
        ArrayList<Integer> minDist = new ArrayList<>();
        for (ArrayList<Integer> subset : subsets) {
            // Sort the subset and compute the difference between the last and first elements
            Integer[] subsetArray = subset.toArray(new Integer[0]);
            Arrays.sort(subsetArray);
            int diff = subsetArray[m - 1] - subsetArray[0];
            if (diff < minDiff) {
                minDiff = diff;
                minDist = subset;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        
        // Hardcore array for testing purposes
        int[] a = {6,8,11,21,90,49};
                
        int numPackets = 6;
        int numStudents = 4;

        int Res=chocolateDistribution(a,numPackets,numStudents);

        // Print the minimum difference and the corresponding subset
        System.out.println("Minimum difference: " + Res);
    }
}
