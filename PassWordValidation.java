/*Password validation
 * minimum length is 9 maximum length is 28
 * starts with alphabet
 * ends with special character 
 * minimum 3 alphabets, 2 lower case ,1 upper case ,2 numbers and one special character 
 */
import java.util.*;
class PassWordValidation{
  public static void inputPassword(String s){
    int invalid=0;
    String s1=s.toLowerCase();
    if(s.length()>=9&&s.length()<=28){
      String str="!@#$%^&*()";
      String temp=""+s.charAt(s.length()-1);
      if(Character.isAlphabetic(s.charAt(0))&&str.contains(temp)){
        int lower=0;
        int upper=0;
        int alpha=0;
        int number=0;
        for(int i=0;i<s.length();i++){
          if(Character.isAlphabetic(s.charAt(i))){
            alpha++;
          }if(Character.isUpperCase(s.charAt(i))){
            upper++;
          }if(Character.isLowerCase(s.charAt(i))){
            lower++;
          }if(Character.isDigit(s.charAt(i))){
            number++;
          }
        }if((alpha>=3)&&(upper>=1)&&(lower>=2)&&(number>=2)){
        }else{
          invalid=1;
        }
        for(int l=0;l<=s1.length()-3;l++){
          if(s1.charAt(l)==s1.charAt(l+1)&&s1.charAt(l)==s1.charAt(l+2)){
            invalid=1;
            break;
          }
        }
        if(invalid==1){
          System.out.println("Invalid");
        }else{
          System.out.println("Valid");
        }
      }else{
        System.out.println("Invalid");
      }
      }
    else{
      System.out.println("Invalid");
    }
  }
  
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s=in.next();
    inputPassword(s);
    in.close();
  }
  
} 