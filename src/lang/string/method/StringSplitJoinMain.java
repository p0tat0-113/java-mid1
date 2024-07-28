package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String string : splitStr) {
            System.out.println(string);
        }

        String temp = "";
        for (String string : splitStr) {
            temp += string + "-";//이렇게 하면 마지막에도 -가 붙어버림.
        }
        System.out.println(temp);

        temp = "";
        for(int i = 0; i < splitStr.length; i++){//join이 없으면 이지랄을 해야한다.
            temp += splitStr[i];
            if(i != splitStr.length-1){
                temp+="-";
            }
        }
        System.out.println(temp);

        //join()
        System.out.println(String.join("!","A","B","C"));
        System.out.println(String.join("-", splitStr));
    }
}
