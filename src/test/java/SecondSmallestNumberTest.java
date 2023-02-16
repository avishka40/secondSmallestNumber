import org.example.SecondSmallestNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class SecondSmallestNumberTest {

    @Test
    public void testFindSecondSmallest() {
        int[] nums1 = {3, 5, 1, 4, 6, 8};
        assertEquals(3, SecondSmallestNumber.findSecondSmallest(nums1));
        int[] nums2 = {7};
        try {
            SecondSmallestNumber.findSecondSmallest(nums2);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Input array must have at least two elements", e.getMessage());
        }

        int[] nums3 = {1, 1, 1, 1, 1, 1};
        assertEquals(1, SecondSmallestNumber.findSecondSmallest(nums3));

        int[] nums4 = {2, 2, 2, 3, 3, 3};
        assertEquals(3, SecondSmallestNumber.findSecondSmallest(nums4));

        int[] nums5 = {0, 1, 2, 3, 4, 5};
        assertEquals(1, SecondSmallestNumber.findSecondSmallest(nums5));
    }

}
