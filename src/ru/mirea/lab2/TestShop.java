package ru.mirea.lab2;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        String command = "";
        String inputedComputerName = "No pc name";

        command = scanner.next();
        while(!(command.equals("END")))
        {
            System.out.print("Название компьютера: ");
            inputedComputerName = scanner.next();
            switch (command)
            {
                case "add":
                    shop.AddComputer(inputedComputerName);
                    System.out.println("Компьютер: " + inputedComputerName + " добавлен в магазин");
                    break;
                case "delete":
                    shop.DeleteComputer(inputedComputerName);
                    break;
                case "find":
                    shop.FindComputer(inputedComputerName);
                    break;
            }

            command = scanner.next();
        }
        inputedComputerName = scanner.next();
    }
}
