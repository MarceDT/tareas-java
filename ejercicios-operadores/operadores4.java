
public class operadores4 {
    public static void main(String[] args) {
 int a=33;
 if(! (( a > 10 ) && ( a < 20 ) )
 ){
System.out.println("True");
 }else{
    System.out.println("False");
 }
 if(! (( a > 10 ) || !( a < 20 ) )
 ){
System.out.println("True");
 }else{
    System.out.println("False");
 }
 
 int a1=20;
 int b1=a1;
 int c1=15;
 int d1=10;
 if(( ( a1 == b1 ) || ( b1 > c1 ) ) || ( c1 < d1 )){
 System.out.println("True");
 }
 else{
    System.out.println("False");
     }
 int a2=10;
 int b2=12;
 int c2=13;
 int d2=10;
 if(((a2==b2)||( b2>c2 )) || ( c2< d2 ) ||( a2 == c2 ) && ( c2 > b2 )){
    System.out.println("True");
 }else{
    System.out.println("False");
 }
 if(( ( a2 >= b2 ) || ( a2 < d2 ) ) && (( a2 >= d2) && (c2 > d2 ) )){
    System.out.println("True");
 }else{
    System.out.println("False");
 } 
 int m=8;
 int n=9;
 int r=5;
 int s=5;
 int t=4;
 int v=77;   
 if(! (( m > n && r > s) || ( ! ( t < v && s>m ) ))){
    System.out.println("True");
 }else{
    System.out.println("False");
 }
    }
}