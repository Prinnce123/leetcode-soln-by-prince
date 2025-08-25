class Solution {
public:
    bool isPowerOfThree(int n) {
       long int p=1;
        while(n>=p)
        {
            if(p==n)
            {
                return 1;
            }
            p=p*3;
        }
    return 0;   
    }
};