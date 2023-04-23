/*

Problem Name : A Simple Fraction

Link : https://practice.geeksforgeeks.org/problems/a-simple-fraction0921/0

*/


class Solution
{
    public String  fractionToDecimal(int numerator, int denominator)
    {
        if (numerator == 0) return "0";
        StringBuilder res = new StringBuilder();
        res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
        long num = Math.abs((long)numerator), den = Math.abs((long)denominator);
        res.append(num / den);
        num %= den;
        if (num == 0) return res.toString();
        res.append(".");
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                res.insert(map.get(num), "(");
                res.append(")");
                break;
            } else map.put(num, res.length());
        }
        return res.toString();
    }
}