package compare_to;

public class compare 
{
   public static void main(String[] args) {
	   String a = "cat";
	   String b = "car";
	   System.out.println(a.compareTo(b));
   }
}
/*
 *     String a = "a"; 
 *     String b = "b"; 
 *     System.out.println(a.compareTo(b));
 *     输出值-1
 *     
 *     两个字符串首字母不同，则该方法返回首字母的asc码的差值
       String a = "abc";
       String b = "bcdfg";
       System.out.println(a.compareTo(b));
       输出-1
       
       参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值
       String a = "abc";
       String b = "abedfg";
       System.out.println(a.compareTo(b));
       输出-2
       
       两个字符串不一样长，可以参与比较的字符又完全一样，则返回两个字符串的长度差值
       String a = "abc";
       String b = "abcdefg";
       System.out.println(a.compareTo(b)); 
       输出-4
 */
