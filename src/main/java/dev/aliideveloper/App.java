package dev.aliideveloper;


public class App {
    public static void main(String[] args) {
        Account cuenta1= new Account("ali",0);

        System.out.println(cuenta1.getBalance());
        cuenta1.deposit(100);
        System.out.println(cuenta1.getOwner());
        try {
            cuenta1.withdraw(50);                  // esto debería fallar
            System.out.println("ERROR: no lanzó excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("OK, excepción: " + e.getMessage());
        }catch (IllegalStateException e){
            System.out.println("OK, excepcio: " + e.getMessage());
        }
        System.out.println(cuenta1.getBalance());
    }



}

