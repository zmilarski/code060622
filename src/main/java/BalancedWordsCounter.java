public class BalancedWordsCounter {

    public static Integer count(String input) {
        Integer count = 0;
        int size = input.length();
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size - i; j++) {
                if (i == 1 && !Character.isLetter(input.charAt(j))) {
                    throw new RuntimeException();
                }
                if (sortCheck(input.substring(j, j + i))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean sortCheck(String word) {
        int size = word.length();
        StringBuilder sorted = new StringBuilder(word);
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sorted.charAt(j) > (sorted.charAt(j + 1))) {
                    char temp = sorted.charAt(j);
                    sorted.setCharAt(j, sorted.charAt(j + 1));
                    sorted.setCharAt(j + 1, temp);

                }
            }
        }
        int letterCount = 1;
        for (int i = 1; i < size; i++) {
            if (sorted.charAt(i) == sorted.charAt(i - 1)) {
                letterCount++;
            } else {
                break;
            }
        }
        if (size % letterCount != 0) {
            return false;
        }
        int x = 0;
        while (x + letterCount <= size) {
            if (sorted.charAt(x) != sorted.charAt(x + letterCount - 1)) {
                return false;
            }
            if (x + letterCount == size) {
                return true;
            }
            if ((sorted.charAt(x + letterCount - 1) == sorted.charAt(x + letterCount))) {
                return false;
            }
            x = x + letterCount;
        }
        return false;
    }

}
