# LeetCode

# 说明
这个repository用于记录我在LeetCode上的Coding学习过程。

Coding记录按下面的格式编写。
* #12 Integer to roman
* #13 Roman To Integer
* #28 Implement strStr()
* #35 Search insert position

每一个项目会给出题目、解题思路、我的代码、优化思路、更优代码等等。
例如：
#12 Integer to roman
LeetCode Link:
https://leetcode.com/problems/integer-to-roman/

Problem description:
Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.

Source code:
https://github.com/scottszb1987/LeetCodeInCSharp/blob/master/LeetCodeInCSharp/12_IntegerToRoman.cs

Detail:
-my solution:
Very straight forward solution.

```
var dic1 = new Dictionary<int, string> { { 1, "I" }, { 2, "II" }, { 3, "III" }, { 4, "IV" }, { 5, "V" }, { 6, "VI" }, { 7, "VII" }, { 8, "VIII" }, { 9, "IX" }, { 0, "" } };
var dic10 = new Dictionary<int, string> { { 1, "X" }, { 2, "XX" }, { 3, "XXX" }, { 4, "XL" }, { 5, "L" }, { 6, "LX" }, { 7, "LXX" }, { 8, "LXXX" }, { 9, "XC" }, { 0, "" } };
var dic100 = new Dictionary<int, string> { { 1, "C" }, { 2, "CC" }, { 3, "CCC" }, { 4, "CD" }, { 5, "D" }, { 6, "DC" }, { 7, "DCC" }, { 8, "DCCC" }, { 9, "CM" }, { 0, "" } };
var dic1000 = new Dictionary<int, string> { { 1, "M" }, { 2, "MM" }, { 3, "MMM" }, { 0, "" } };
return dic1000[num / 1000 % 10] + dic100[num / 100 % 10] + dic10[num / 10 % 10] + dic1[num % 10];
```

-the smarter solution, refer to lucifer27's solution: This is slower (O(N) or O(1)???since num has a upper limit???)

```
int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
string[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
string roman = "";
for (int i = 0; i < values.Length; i++)
{
    while (num >= values[i])
    {
        num -= values[i];
        roman += strs[i];
    }
}
return roman;
```