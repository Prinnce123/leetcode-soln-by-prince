class Solution {
public:
    int maxArea(vector<int>& height) {
     int l=0,r=height.size()-1,area=0,ans=0;
        while(l<r)
        {
          int b = r-l;
          int h = min(height[l],height[r]);
          area=b*h;
          ans=max(ans,area);
          if(height[l]>height[r])
          {
            r--;
          }
          else {
            l++;
          }
        }
        return ans;
        
    }

};