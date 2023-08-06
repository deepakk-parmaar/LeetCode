import java.util.PriorityQueue;

public class MedianOf2SortedArray {
    
    public double findMedianSortedArray(int[] nums1, int nums2[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        double nums3[] = new double[nums1.length+nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            pq.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            pq.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length + nums1.length; i++) {
            nums3[i] = pq.poll();
        }
        if (nums3.length % 2 == 0) {
            int n = nums3.length;
            return (nums3[n/2]+nums3[n/2-1])/2;
        }else {
            return nums3[nums3.length / 2];
        }
    }

    public static void main(String[] args) {
        
    }
}