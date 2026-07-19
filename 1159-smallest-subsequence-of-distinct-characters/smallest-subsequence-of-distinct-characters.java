class Solution {
    public String smallestSubsequence(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (set.contains(ch)) {
                continue;
            }

            while (sb.length() > 0 &&
                   sb.charAt(sb.length() - 1) > ch &&
                   map.get(sb.charAt(sb.length() - 1)) > i) {

                char last = sb.charAt(sb.length() - 1);

                sb.deleteCharAt(sb.length() - 1);
                set.remove(last);
            }

            sb.append(ch);
            set.add(ch);
        }

        return sb.toString();
    }
}