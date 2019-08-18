package com.pan.bishi.tengxun;

public class Main1 {
    public static void main(String[] args) {
        String s = "[3|B]";
        System.out.println(reComplex(s));
    }

    public static String reComplex(String str) {
        int start = str.lastIndexOf("[");
        if (start == -1) {
            return str;
        }
        int end = str.indexOf("]");
        String sss = str.substring(start + 1, end);
        String method = method(sss);
        String qian = str.substring(0, start);
        String hou = str.substring(end + 1);
        String result = qian + method + hou;

        return reComplex(result);
    }

    public static String method(String sub) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] split = sub.split("\\|");
        int count = Integer.parseInt(split[0]);
        for (int i = 0; i < count; i++) {
            stringBuilder.append(split[1]);
        }
        return stringBuilder.toString();
    }

}
