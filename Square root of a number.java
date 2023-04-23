/*

Problem Name : Square root of a number

Link : https://practice.geeksforgeeks.org/problems/square-root/0

*/


class Solution
{
    long floorSqrt(long x) {
        long i = 1;
        for(i = 1; i * i <= x; i++);
        return --i == 0 ? 1 : i;
    }
}