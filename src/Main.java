public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode next = solution.middleNode(node1);
        while (next != null) {
            System.out.println(next.val);
            next = next.next;
        }

        System.out.println("-----------------------------------------------------");

        ListNode node11 = new ListNode(6);
        ListNode node10 = new ListNode(5, node11);
        ListNode node9 = new ListNode(4, node10);
        ListNode node8= new ListNode(3, node9);
        ListNode node7 = new ListNode(2, node8);
        ListNode node6 = new ListNode(1, node7);

        ListNode next2 = solution.middleNode(node6);
        while (next2 != null) {
            System.out.println(next2.val);
            next2 = next2.next;
        }

        System.out.println("-----------------------------------------------------");

        ListNode node20 = new ListNode(9);
        ListNode node19 = new ListNode(8, node20);
        ListNode node18 = new ListNode(7, node19);
        ListNode node17 = new ListNode(6, node18);
        ListNode node16 = new ListNode(5, node17);
        ListNode node15 = new ListNode(4, node16);
        ListNode node14 = new ListNode(3, node15);
        ListNode node13 = new ListNode(2, node14);
        ListNode node12 = new ListNode(1, node13);

        ListNode next3 = solution.middleNode(node12);
        while (next3 != null) {
            System.out.println(next3.val);
            next3 = next3.next;
        }
    }
}
