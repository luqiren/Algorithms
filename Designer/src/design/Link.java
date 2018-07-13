package design;

public class Link {
    public static void main (String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int[] num2 = {1, 3, 4};
        ListNode l1 = construct(num);
        ListNode l2 = construct(num2);
        ListNode r = reverseList(l1);
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
        ListNode result;
        if (p.val > q.val) {
            result = new ListNode(q.val);
            q = q.next;
        } else {
            result = new ListNode(p.val);
            p = p.next;
        }
        ListNode curr = result;
        while (p != null && q != null) {
            if (p.val > q.val) {
                curr.next = new ListNode(q.val);
                q = q.next;
            } else {
                curr.next = new ListNode(p.val);
                p = p.next;
            }
            curr = curr.next;
        }
        if (p != null) curr.next = p;
        if (q != null) curr.next = q;
        return result;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode curr = head.next;
        ListNode next = curr.next;
        pre.next = null;
        while(next != null) {
            curr.next = pre;
            pre = curr;
            curr = next;
            next = next.next;
        }
        curr.next = pre;
        return curr;
    }
}
