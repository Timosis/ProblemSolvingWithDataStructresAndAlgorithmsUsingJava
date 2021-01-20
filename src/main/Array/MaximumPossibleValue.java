package main.Array;

public class MaximumPossibleValue {
    public static int MaximumPossibleValue(int num){
        if(num == 0){
            return 50;
        }
        int result = 0;
        if (num > 0){
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) < '5'){
                    var part1 = s.substring(0,i);
                    var part2 = s.substring(i, s.length());
                    result = Integer.parseInt(part1 + "5" + part2);
                    break;
                }
            }
        }else{
            String s = String.valueOf(num * -1);
            for (int i = 0; i < s.length() ; i++) {
                if (s.charAt(i) > '5'){
                    var part1 = s.substring(0,i);
                    var part2 = s.substring(i,s.length());
                    result = Integer.parseInt(part1 + '5' + part2) * -1;
                    break;
                }
            }
        }

        return result;
    }
}
