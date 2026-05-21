 class Constructors {
    public static void main(String[] args) {
        
      // char[] ch = {'j','a','v','a'};
      //String s1 = new String(ch);

        //byte[] b = {97,98,99};
       //String s2 = new String(b);

       //System.out.println(s1 + " " + s2);

       String s1 = "java";
       String s2 = s1.toString();
       String s3 = s1.toLowerCase();
       String s4 = s1.toUpperCase();
       System.out.println(s1 == s2);
       System.out.println(s1 == s3);
       System.out.println(s1 == s4);

    }    
        
}
