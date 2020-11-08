class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    ans += (left_max - height[left]);
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    ans += (right_max - height[right]);
                }
                right--;
            }
        }
        return ans;
    }

}
/*
public int trap(int[] height) {
    int ans = 0, current = 0;
    Deque<Integer> stack = new LinkedList<Integer>();
    for (;current < height.length;current++) {
        while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
            int top = stack.pop();
            if (stack.isEmpty())
                break;
            int distance = current - stack.peek() - 1;
            int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
            ans += distance * bounded_height;
        }
        stack.push(current);
    }
    return ans;
}

*/