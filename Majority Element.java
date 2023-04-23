/*

Problem Name : Majority Element

Link : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/0

*/


class Solution
{
    static int majorityElement(int a[], int size)
    {
        int maj_index = 0, count = 1;
        for (int i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        count  = 0;
        for(int i : a) {
            if(i == a[maj_index]) count++;
        }
        return count > size/2 ? a[maj_index] : -1 ;
    }
}