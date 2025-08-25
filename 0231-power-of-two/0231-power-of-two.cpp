class Solution {
public:
    bool isPowerOfTwo(int n) {
       long int p=1;
        while(n>=p)
        {
            if(p==n)
            {
                return 1;
            }
            p=p*2;
        }
    return 0;
    }
};