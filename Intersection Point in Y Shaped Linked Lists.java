/*

Problem Name : Intersection Point in Y Shaped Linked Lists

Link : https://practice.geeksforgeeks.org/problems/eae1fbd0ac8f213a833d231e26ba4d829e79dd9c/1

*/


class Intersect
{
	int intersectPoint(Node head1, Node head2)
	{
        Node list1 = head1, list2 = head2;
        int l1 = 0, l2 = 0;
        while(list1 != null) {
            list1 = list1.next;
            l1++;
        }
        while(list2 != null) {
            list2 = list2.next;
            l2++;
        }
        int diff = Math.abs(l1-l2);
        list1 = head1;
        list2 = head2;
        while(diff-- > 0) {
            if(l1 > l2) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
        }
        while(list1 != null) {
            if(list1 == list2) {
                return list1.data;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return 0;
	}
}
