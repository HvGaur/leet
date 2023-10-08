class Solution{
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;

        int carry = 0;

        while(l1 != null || l2 != null)
        {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            int sum = a + b + carry;
            carry = sum/10;
            cur_value = sum % 10;

            ListNode newnode = new ListNode(cur_value);
            l3.next = newnode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
        }

        if(carry > 0)
        {
            ListNode newnode = new ListNode(carry);
            l3.next = newnode;
            l3 = l3.next;
        }
        return dummy.next;
    }
}