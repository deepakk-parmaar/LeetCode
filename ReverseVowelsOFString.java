class Solution {
    public String reverseVowels(String s) {
        int front = 0, back = s.length() - 1;
        char arr[] = s.toCharArray();
        while (front <= back) {
            if (!isVowel(arr[front])) {
                front++;
                continue;
            }
            if (!isVowel(arr[back])) {
                back--;
                continue;
            }
            swap(arr, front, back);
            front++;
            back--;
        }
        return new String(arr);
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private void swap(char arr[], int front, int back) {
        char temp = arr[front];
        arr[front] = arr[back];
        arr[back] = temp;
    }
}