package com.company.leetcode.q22_GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/description/
public class Solution {

  public List<String> generateParenthesis(int n) {
    ArrayList<String> ret = new ArrayList<>();
    process(ret, "", 0, 0, n);
    return ret;
  }

  private void process(ArrayList<String> ret, String current, int open, int close, int max) {
    if (current.length() == max * 2) {
      ret.add(current);
      return;
    }

    if (open < max) {
      process(ret, current + "(", open + 1, close, max);
    }
    if (close < open) {
      process(ret, current + ")", open, close + 1, max);
    }
  }
}
