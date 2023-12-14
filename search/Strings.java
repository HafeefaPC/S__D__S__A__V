package search;

public class Strings {
  public static void main(String[] args){
    String name = "hafefa";
    char t ='a';
    boolean ans = search(name , t);
    System.out.println(ans);
  }

   static boolean search(String n , char u){
    if(n.length() ==0){
        return false;
    }

    for(int i =0;i< n.length(); i++){
        if( u == n.charAt(i)){
            return true;
        }
    }
    return false;
  }

  static boolean search2(String n , char u){
    if(n.length() ==0){
        return false;
    }

    for(char ch:n.toCharArray()){
        if( ch == u){
            return true;
        }
    }
    return false;
  }
}
