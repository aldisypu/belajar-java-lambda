package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
  public static void main(String[] args) {

    Supplier<String> supplier = () -> "Aldi Syah Putra";

    System.out.println(supplier.get());

  }
}
