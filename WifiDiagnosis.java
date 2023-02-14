//Student: Ryan Tran
//Professor: Professor Grinberg
//Course: CMSC 203 CRN 30376
//Assignment: Project 1, Wi-Fi Diagnosis
// Summary of Description: an application that is used to help solve possible problems to restores someone’s internet connection.
//Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source.
import java.util.Scanner;

public class WifiDiagnosis {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String answer;

System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
System.out.println("First step: Reboot your computer");
System.out.println("Reply if this fixed the issue with (yes or no)");
answer = scanner.nextLine();

if (!answer.equals("yes") && !answer.equals("no")) {
  System.out.println("Invalid answer");
} else if (answer.equals("yes")) {
  System.out.println("Problem fixed");
} else {
  System.out.println("Second step: Reboot your router");
  System.out.println("Reply if this fixed the issue with (yes or no)");
  answer = scanner.nextLine();

  if (!answer.equals("yes") && !answer.equals("no")) {
    System.out.println("Invalid answer");
  } else if (answer.equals("yes")) {
    System.out.println("Problem fixed");
  } else {
    System.out.println("Third step: Make sure the cables to your router are properly connected and cable modem is getting power");
    System.out.println("Reply if this fixed the issue with (yes or no)");
    answer = scanner.nextLine();

    if (!answer.equals("yes") && !answer.equals("no")) {
      System.out.println("Invalid answer");
    } else if (answer.equals("yes")) {
      System.out.println("Problem fixed");
    } else {
      System.out.println("Fourth step: Move your computer closer to your router");
      System.out.println("Reply if this fixed the issue with (yes or no)");
      answer = scanner.nextLine();

      if (!answer.equals("yes") && !answer.equals("no")) {
        System.out.println("Invalid answer");
      } else if (answer.equals("yes")) {
        System.out.println("Problem fixed");
      } else {
        System.out.println("Fifth step: Contact your ISP");
      }
    }
  }
}
System.out.println("You have solved the problem.");
System.out.println("Programmer: Ryan Tran");
}
}