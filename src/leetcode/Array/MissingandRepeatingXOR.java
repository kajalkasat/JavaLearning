package leetcode.Array;
/*
    1. xor of all nums
    2. xor of 1 to n
    3. find rightmost setbit in xor
    4. xor of nums and setbit : to get 2 baskets
    5. xor of i and setbit : to get 2 baskets
*/
public class MissingandRepeatingXOR
{
    static int x,y;
    static void missingandRepeatingXOR(int nums[])
    {
        int xor_nos = 0;
        int n = nums.length;
        int setBit = 0;
        for(int i=0;i<n;i++)
        {
            xor_nos ^= nums[i];
        }

        for(int i=1;i<=n;i++)
        {
            xor_nos ^= i;
        }

        setBit = xor_nos & ~(xor_nos-1); // rightmost set bit

        for(int i=0;i<n;i++)
        {
            if((nums[i]&setBit) != 0)
            {
                x = x ^ nums[i];
            }
            else
                y = y ^ nums[i];
        }

        for(int i=1;i<=n;i++)
        {
            if((i&setBit) != 0)
            {
                x = x ^ i;
            }
            else
                y = y ^ i;
        }
    }
    public static void main(String[] args) {
        
        int nums[] = { 1, 3, 4, 5, 1, 6, 2 };

        missingandRepeatingXOR(nums);
        System.out.println("missing : "+x);
        System.out.println("repeating : "+y);

    }
}