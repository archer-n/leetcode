class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] record = new int[26];

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();

        int maxlength = a.length > b.length ? a.length : b.length;

        int d = (int)'a';
        for (int i = 0; i < maxlength; i++) {

            if (i < a.length) {
                int c = a[i];
                int index = c - d;
                record[index] = record[index] + 1;
            }

            if (i < b.length) {
                int c = b[i];
                int index = c - d;
                record[index] = record[index] - 1;
            }
        }

        for (int i = 0; i < record.length; i++) {
            if (record[i] > 0) {
                return false;
            }
        }

        return true;
    }
}
