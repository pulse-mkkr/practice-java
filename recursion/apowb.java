// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class apowb {
   public apowb() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("enter the base number : ");
      int var2 = var1.nextInt();
      System.out.print("Enter the power number : ");
      int var3 = var1.nextInt();
      int var4 = paw(var2, var3);
      System.out.println(var4);
      var1.close();
   }

   public static int paw(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         System.out.println("invalid");
         return 0;
      } else if (var0 == 0) {
         return 0;
      } else if (var1 == 0) {
         return 1;
      } else {
         int var2 = var0 * paw(var0, var1 - 1);
         return var2;
      }
   }
}
