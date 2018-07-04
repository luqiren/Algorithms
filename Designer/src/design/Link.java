package design;

public class Link {
    public static void main (String[] args) {
        int[] num = {2, 4, 3};
        int[] num2 = {5, 6, 4};
        ListNode l1 = construct(num);
        ListNode l2 = construct(num2);
        ListNode r = mergeTwoLists(l1, l2);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }
    private static ListNode construct (int[] nums) {
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
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode p = l1, q = l2;
        ListNode result = new ListNode(0);
        if (p.val > q.val) {
            result.val = q.val;
            q = q.next;
        } else {
            result.val = p.val;
            p = p.next;
        }
        ListNode curr = result;
        while (p != null && q != null) {
            if (p.val > q.val) {
                curr.val = q.val;
                q = q.next;
            } else {
                curr.val = p.val;
                p = p.next;
            }
            curr = curr.next;

        }
        if (p != null) curr = p;
        if (q != null) curr = q;
        return result;
    }
}
