package pl.AdrianFleszar;

import java.util.Scanner;

public class TerminalOperation implements DataBaseOperation{

    @Override
    public Long add(Eps eps){


        System.out.println("Write part number: ");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();

        System.out.println("Write project number: ");
        Scanner scanner1 = new Scanner(System.in);
        int projectNumber = scanner1.nextInt();

        System.out.println("Write project name: ");
        Scanner scanner2 = new Scanner(System.in);
        String projectName = scanner2.nextLine();

        System.out.println("Write parts status: ");
        Scanner scanner3 = new Scanner(System.in);
        String partStatus = scanner3.nextLine();

        //Eps eps1 = new Eps(id, projectNumber, projectName, partStatus);
        return id;

    }
}
