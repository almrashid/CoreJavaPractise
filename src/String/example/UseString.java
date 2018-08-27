package String.example;

public class UseString {
    public static void main(String[] args) {


        String str=new String("Hello; Everyone");
        String str2="In class";
        String  l=str.toLowerCase();
        System.out.println(l);
        int size= str.length();
        str.toLowerCase();
        str.equalsIgnoreCase(str);
        System.out.println(str.equals(str2));
        str.charAt(0);
        System.out.println(str.compareTo(str2));//false -1; true 0
        System.out.println("Size of String str: "+ size);
        System.out.println(str.equalsIgnoreCase("Hello; everyone"));

        System.out.println(str.trim());
        System.out.println( str.split(""));
       String strnew=str.concat("-Welcome");
        System.out.println(strnew);
        String[] st=(str.split(" "));
        System.out.println(st);

        String s = "geekss@for@geekss";
        String[] arrOfStr = s.split("@", 3);

        for (String a : arrOfStr)
            System.out.println(a);


    }
}
