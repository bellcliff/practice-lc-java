package my.basic;

import my.base.ListNode;
import my.basic.RotateList;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotateListTest {
    
    @Test
    public void testcase() {
        ListNode head = ListNode.generate(new int[]{1,2,3,4,5});
        assertEquals(head.toString(), "1->2->3->4->5->NULL");
        ListNode newHead = new RotateList().rotateRight(head, 2);
        //assertNotNull(newHead);
        assertEquals(newHead.toString(), "3->4->5->1->2->NULL");
    }

    @Test
    public void testcase2() {
        ListNode head = ListNode.generate(new int[]{1,2,3,4,5});
        assertEquals(head.toString(), "1->2->3->4->5->NULL");
        ListNode newHead = new RotateList().rotateRightAsCircle(head, 2);
        //assertNotNull(newHead);
        assertEquals(newHead.toString(), "3->4->5->1->2->NULL");
    }
}
