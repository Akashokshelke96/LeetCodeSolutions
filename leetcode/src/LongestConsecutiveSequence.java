import java.util.HashSet;

    public class LongestConsecutiveSequence {
        public static void main(String[] args) {
            int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
            int n = arr.length;
            System.out.println(findLongestConseqSeq(arr));
        }
        static int findLongestConseqSeq(int arr[])
        {
            HashSet<Integer> order = new HashSet<Integer>();
            int answer = 0;
            int n = arr.length;

            //adding all elements to hashset to pickout repetetions
            for (int i = 0; i < n; i++)
                order.add(arr[i]);

            // going through the array to check to if the hashset contains a value 1 less than the array item in consideration
            for (int i = 0; i < n; i++)
            {
                // to start it from begining we use ! since it was not working otherwise.... to make it start from begining
                if (!order.contains(arr[i] - 1))
                {   int j = arr[i];
                    while (order.contains(j))
                        j++;
                    // updating the length if one is longer than another
                    if (answer < j - arr[i])
                        answer = j - arr[i];
                }
            }
            return answer;
        }
    }
