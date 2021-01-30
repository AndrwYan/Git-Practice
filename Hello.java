//每k个一组反转链表
//思路：头插法

public class Solution{
	public ListNode ReverseKGroup(ListNode head,int k) {
		if(Head==null||head.next==null||k==1) return head;
		ListNode res=new ListNode(0);
		res.next=head;
		int length=0;
		ListNode pre=res,cur=head,tmp=null;

		while(head!=null){
			length++;
			head=head.next;
		}
		for(int i=0;i<length/k;i++){
			for(int j=olj<k;j++){
				tmp=cur.next;
				cur.next=tmp.next;
				tmp.next=pre.next;
				pre.next=tmp;

			}
			pre=cur;
			cur=cur.next;
	}
	return head;

}













































