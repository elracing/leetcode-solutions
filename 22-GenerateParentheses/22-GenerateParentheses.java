// Last updated: 4/28/2026, 10:47:02 AM
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        int openCount = 0;
        int closedCount = 0;
        List<String> result = new ArrayList<>();
        addParenthesis(result, "", 0, 0, n);
        return result;

    }


    private void addParenthesis(List<String> result, String cur, int openCount, int closedCount, int max) {
        if (cur.length() == max * 2) {
            result.add(cur);
            return;
        }

        if (openCount < max) {
            addParenthesis(result, cur + "(", openCount + 1, closedCount, max );

        }

        if (closedCount < openCount) {
            addParenthesis(result, cur + ")", openCount, closedCount + 1, max );
        }


    }
}