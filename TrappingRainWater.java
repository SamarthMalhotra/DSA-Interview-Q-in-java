import java.util.*;

public class TrappingRainWater {
  public static long trapped(int arr[]) {
    int n = arr.length;

    int leftMax[] = new int[n];
    leftMax[0] = arr[0];
    // Calculate the left maximum well
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
    }
    int rightMax[] = new int[n];
    rightMax[n - 1] = arr[n - 1];
    // Calculate the right maximam well
    for (int j = n - 2; j >= 0; j--) {
      rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
    }
    // Calculate the volume
    int trappedWater = 0;
    long volume = 0;
    for (int i = 0; i < arr.length; i++) {
      trappedWater = Math.min(rightMax[i], leftMax[i]);
      int totalVolume = trappedWater - arr[i];
      if (totalVolume > 0) {
        volume += totalVolume;
      }
    }
    return volume;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    // Input taken in Array
    System.out.println("Enter the Elements in Array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    // Calling the trapped function
    long volume = trapped(arr);
    System.out.println("Total Volume of Above the bulding is :" + volume);
    sc.close();
  }

}