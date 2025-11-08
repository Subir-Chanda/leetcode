class Solution {
    public int maxArea(int[] height) {
        int first=0;
        int last=height.length-1;
        int area=0;
        while(first<last){
            if(Integer.min(height[first],height[last])*(last-first)>area){
                area=Integer.min(height[first],height[last])*(last-first);
            }
            if(height[first]<=height[last]){
                first++;
            }
            else{
                last--;
            }
        }
        return area;
        
    }
}