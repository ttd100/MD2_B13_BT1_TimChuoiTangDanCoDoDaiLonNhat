public class IncreasingString {
    public static void main(String[] args) {
        String result = getIncreasingString("Welcome");
        System.out.println(result);
    }
    public static String getIncreasingString(String string){
        String temp = "";
        String last = "";
        for (String s : string.split("")){
            if (temp.isEmpty()){
                temp += s ;
                last = s;
            }
            if (last.compareTo(s)<0){
                temp += s;
            }
            last = s;
        }
        return temp;
    }
}