package design;

public class AddTwoNums {
    public static void main (String[] args) {
        int[] num = {2, 4, 3};
        int[] num2 = {5, 6, 4};
        ListNode l1 = constructLink(num);
        ListNode l2 = constructLink(num2);
        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    private static ListNode constructLink (int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode root = new ListNode(nums[0]);
        ListNode next = root;
        for (int i = 1; i < nums.length; i++) {
            next.next = new ListNode(nums[i]);
            next = next.next;
        }
        return root;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
