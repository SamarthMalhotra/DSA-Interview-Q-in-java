public class FastExp {
    // This Approach is important bacause it can it's time complexity is O(logn).
    public static int logic(int n, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println("The Power of 3 :" + logic(3, 5));
    }
}
