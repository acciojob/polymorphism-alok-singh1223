package academy.javaprogramming;

public class Main {
static class Product{
   public Product(){
       System.out.println("This is a Product class");
   }

   public int product(int x,int y){
       return (x*y);
   }

   public int product(int x, int y, int z){
       return (x*y*z);
   }

   public double product(double x,double y){
       return (x*y);
   }
}
    public static void main(String[] args) {
	// write your code here
        Product p=new Product();
        System.out.println(p.product(3,5));
        System.out.println(p.product(3,5,8));
        System.out.println(p.product(2.135,8.175));

    }
}
