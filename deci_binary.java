/* A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
Example 1:
Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32
Example 2:
Input: n = "82734"
Output: 8
Example 3:
Input: n = "27346209830709182346"
Output: 9
 
Constraints:
    • 1 <= n.length <= 105
    • n consists of only digits.
    • n does not contain any leading zeros and represents a positive integer


*/

class Solution1 {
    public int minPartitions(String n) {
        int largest = 0;
        for (int i=n.length()-1;i>=0;i--){
            //int num = Integer.parseInt(n[i]);
            if(Integer.parseInt(String.valueOf(n.charAt(i))) > largest){
                largest  = Integer.parseInt(String.valueOf(n.charAt(i)));
            }
        }
        return largest;
    }
}
class Solution2 {
    public int minPartitions(String n) {
        int largest = 0;
        char nn [] = n.toCharArray();
        //System.out.println( "Hello hello!" );
        Arrays.sort(nn);
        System.out.println("largest : " + Arrays.toString(nn));
        largest = Integer.parseInt(String.valueOf(nn[nn.length-1]));
        return largest;
    }