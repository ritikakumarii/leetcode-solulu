class Solution {
    public String arrangeWords(String text) {
        text = text.substring(0,1).toLowerCase()+text.substring(1);
        HashMap<Integer,List<String>>  map = new HashMap<>();
        String[] words = text.split(" ");
         for (String word : words) {

            if (!map.containsKey(word.length())) {
                map.put(word.length(), new ArrayList<>());
            }

            map.get(word.length()).add(word);
        }
       StringBuilder ans = new StringBuilder();
        for (int len = 1; len <= text.length(); len++) {

            if (map.containsKey(len)) {

                for (String word : map.get(len)) {
                    ans.append(word).append(" ");
                }
            }
        }
        ans.deleteCharAt(ans.length() - 1);
        ans.setCharAt(0, Character.toUpperCase(ans.charAt(0)));

        return ans.toString();
    }
}