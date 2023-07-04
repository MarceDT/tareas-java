
public class ciclos6 {
    public static void main(String[] args) {
  for(int c=1;c<=100;c++){
    if (c%3==0) {
        System.out.print("fizz *");
    }
    if (c%5==0) {
        System.out.print("buzz *");
    }
    if (c%5==0 && c%5==0) {
        System.out.print("fizzbuzz *");
    }else{
        System.out.print(c+ "*");
    }
  }
    }
}