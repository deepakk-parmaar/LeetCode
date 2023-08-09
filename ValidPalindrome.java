class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        int front = 0;
        int rear = arr.length-1;
        while (front <= rear) {
            if (Character.isLetterOrDigit(arr[front])) {
                front++;
            }if (Character.isLetterOrDigit(arr[rear])) {
                rear--;
            } else {
                if (Character.toLowerCase(arr[front]) != Character.toLowerCase(arr[rear])) {
                    return false;
                }
                front++;
                rear--;
            }
        }
        return true;
    }
}