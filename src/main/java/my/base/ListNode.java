package my.base;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public String toString(){
        return "" + val + "->" + (this.next == null ? "NULL" : this.next);
    }
    
    public static ListNode generate(int[] vals) {
        ListNode tmp = new ListNode(0);
        ListNode cur = tmp;
        for(int val: vals){
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return tmp.next;
    }
}
