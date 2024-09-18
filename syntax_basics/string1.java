package syntax_basics;

public class string1 {
    public static void main(String[] args) {
        String a="one";
        String b="one";
        System.out.println("a==b "+a==b);
        //true because a and b points to same object that is one in the string pool and if we change value of one it will point to new object without removing prev from string pool
        String c=new String("one");
        String d=new String("one");
        System.out.println("new string a ==b "+c==d);
        //false because we are telling compiler to not use same object but make two different objects using new string
        System.out.println("compares values using equals "+c.equals(d));
        //.equals method compares the value rather than the objects, true;
        System.out.println("'a'+'b' "+'a'+'b');
        //gives 195 that is the sum of unicode of a and b
        System.out.println("a"+"b");
        //gives ab that is concate string a and string b
        System.out.println("'a'+1 "+'a'+1);
        //gives 98 that is sum of unicode of a +1
        System.out.println("a"+1);
        ///gives a1 because it converts 1 into "1"
    }
    
}
