class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // Skip non-alphanum characters from left side
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanum characters from right side
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters after lowercase
            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}