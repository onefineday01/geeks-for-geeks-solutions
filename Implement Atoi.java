/*

Problem Name : Implement Atoi

Link : https://practice.geeksforgeeks.org/problems/implement-atoi/1

*/


class Solution
{
    int atoi(String str) {
        int number = -1, start = 0, len = str.length();
        boolean negative = false;
        if(str.charAt(0) == '-') {
            negative = true;
            start = 1;
        }
        for(int i = start; i < len; i++) {
            if(i == start) {
                number = 0;
            }
            switch(str.charAt(i)) {
                case '1' :
                case '2' :
                case '3' :
                case '4' :
                case '5' :
                case '6' :
                case '7' :
                case '8' :
                case '9' :
                case '0' :
                    number = number * 10 + (int)(str.charAt(i) - '0');
                    break;
                default:
                    return -1;
            }
        }
        if(negative) number = number * -1;
        return number;
    }
}
