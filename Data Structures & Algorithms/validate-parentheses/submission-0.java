class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for (char para : s.toCharArray()) {
            if (para == '(' || para == '{' || para == '[') st.push(para);
            else {
                if (st.isEmpty()) return false;
                char ch = st.pop();
                if ((para == ')' && ch == '(') || (para == '}' && ch == '{') || (para == ']' && ch == '[')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}