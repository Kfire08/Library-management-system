import java.io.IOException;
import java.util.Scanner;
interface ManagementLibrary
{
   public void Add();
   public void iss();
   public void ret();
   public void detail();
   public void exit();
}
public class Project {
    public static void main(String args[]) throws IOException {
            System.out.println("PRESS 1 FOR ENGINEERING LIBRARY");
            System.out.println("PRESS 2 FOR MANAGEMENT LIBRARY");
            Scanner o = new Scanner(System.in);
            int l = o.nextInt();;
            if(l==1){
            char r;
            try{
            do {
            System.out.println("\n*******************************LOVELY PROFESSIONAL UNIVERSITY********************************");
            System.out.println("                                      ENGINEERING LIBRARY");
            System.out.println("\nPRESS 1 TO ADD A BOOK");
            System.out.println("PRESS 2 TO ISSUE A BOOK \n\nNOTE:USE OPTION 3 AND 4 ONLY IF YOU HAVE USED OPTION 2\n");
            System.out.println("PRESS 3 TO RETURN A BOOK ");
            System.out.println("PRESS 4 TO PRINT COMPLETE ISSUE DETAILS");
            System.out.println("PRESS 5 TO EXIT");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("\nENTER THE NUMBER CORRESPONDING TO YOUR REQUIREMENT");
            int a = obj1.nextInt();
            switch (a) {
                case 1:
                    Library aa = new Engineering();
                    aa.Add();
                    break;
                case 2:
                    Library bb = new Engineering();
                    bb.iss();
                    break;
                case 3:
                    Library cc = new Engineering();
                    cc.ret();
                    break;
                case 4:
                    Library is = new Engineering();
                    is.detail();
                    break;
                case 5:
                    Library add = new Engineering();
                    add.exit();
                    break;
                default:
                    System.out.println("INVALID OPTION, PLEASE CHOOSE FROM THE AVAILABLE OPTIONS");
            }
            System.out.println("\nDO YOU WANT TO SELECT NEXT OPTION (ENTER Y/N)");
            r = obj1.next().charAt(0);
        } while (r == 'y' || r == 'Y');
        	if (r == 'n' || r == 'N') {
            Library z = new Engineering();
            z.exit();
        }
    }
    catch(Exception e){
    	System.out.println(e);
    }
    }
    if(l==2){
    	    char r;
            try{
            do {
            System.out.println("\n*******************************LOVELY PROFESSIONAL UNIVERSITY********************************");
            System.out.println("                                       MANAGEMENT LIBRARY");
            System.out.println("\nPRESS 1 TO ADD A BOOK");
            System.out.println("PRESS 2 TO ISSUE A BOOK \n\nNOTE:USE OPTION 3 AND 4 ONLY IF YOU HAVE USED OPTION 2\n");
            System.out.println("PRESS 3 TO RETURN A BOOK ");
            System.out.println("PRESS 4 TO PRINT COMPLETE ISSUE DETAILS");
            System.out.println("PRESS 5 TO EXIT");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("\nENTER THE NUMBER CORRESPONDING TO YOUR REQUIREMENT");
            int a = obj1.nextInt();
            switch (a) {
                case 1:
                    ManagementLibrary aa = new Management();
                    aa.Add();
                    break;
                case 2:
                    ManagementLibrary bb = new Management();
                    bb.iss();
                    break;
                case 3:
                    ManagementLibrary cc = new Management();
                    cc.ret();
                    break;
                case 4:
                    ManagementLibrary is = new Management();
                    is.detail();
                    break;
                case 5:
                    ManagementLibrary add = new Management();
                    add.exit();
                    break;
                default:
                    System.out.println("INVALID OPTION, PLEASE CHOOSE FROM THE AVAILABLE OPTIONS");
            }
            System.out.println("\nDO YOU WANT TO SELECT NEXT OPTION (ENTER Y/N)");
            r = obj1.next().charAt(0);
        } while (r == 'y' || r == 'Y');
        	if (r == 'n' || r == 'N') {
            ManagementLibrary z = new Management();
            z.exit();
        }
    }
    catch(Exception e){
    	System.out.println(e);
    }
    }
    }
}
abstract class Library {
    static String str, b, date;
    static int a, c;
    void Add() {
        System.out.println("\nENTER BOOK NAME, PRICE AND NUMBER OF BOOKS");
        Scanner obj2 = new Scanner(System.in);
        String str = obj2.nextLine();
        float price = obj2.nextInt();
        int bookno = obj2.nextInt();
        System.out.println("\nDETAILS OF THE ADDED BOOK" + "\nNAME:" + str + "\nPRICE:" + price + "\nNUMBER OF BOOKS:" + bookno);
    }
    void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("\nBOOK NAME (ENTER NAMES SEPERATED BY ',' IF DIFFERENT BOOKS ARE ISSUED ");
        str = obj3.nextLine();
        System.out.println("BOOK ID");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("ISSUE DATE");
        b = obj3.nextLine();
        System.out.println("TOTAL NUMBER OF BOOKS ISSUED");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.println("RETURN DATE");
        date = obj3.nextLine();
    }
    int getid() {
        return a;
    }
    abstract void ret();
    abstract void detail();
    void exit() {
        System.exit(0);
    }
}
class Engineering extends Library{
	    void ret() {
        System.out.println("\nENTER STUDENT NAME AND BOOK_ID");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookid = c.nextInt();
        if (a == bookid) {
            System.out.println("\nDETAILS OF THE BOOKS RETURNED");
            System.out.println("BOOK NAME:" + Engineering.str);
            System.out.println("BOOK ID:" + Engineering.a);
            System.out.println("ISSUE DATE:" + Engineering.b);
            System.out.println("TOTAL NUMBER OF BOOKS ISSUED:" + Engineering.c);
            System.out.println("RETURN DATE: " + Engineering.date);
        } else {
            System.out.println("WRONG BOOK ID,PLEASE ENTER CORRECT BOOK ID");
        }
    }
    void detail() {
        System.out.println("\nBOOK NAME:" + Library.str);
        System.out.println("BOOK ID:" + Library.a);
        System.out.println("ISSUE DATE:" + Library.b);
        System.out.println("TOTAL NUMBER OF BOOKS ISSUED:" + Library.c);
        System.out.println("RETURN DATE: " + Library.date);
    }
}
class Management implements ManagementLibrary{
	    static String str, b, date;
    static int a, c;
    public void Add() {
        System.out.println("\nENTER BOOK NAME, PRICE AND NUMBER OF BOOKS");
        Scanner obj2 = new Scanner(System.in);
        String str = obj2.nextLine();
        float price = obj2.nextInt();
        int bookno = obj2.nextInt();
        System.out.println("\nDETAILS OF THE ADDED BOOK" + "\nNAME:" + str + "\nPRICE:" + price + "\nNUMBER OF BOOKS:" + bookno);
    }
    public void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("\nBOOK NAME (ENTER NAMES SEPERATED BY ',' IF DIFFERENT BOOKS ARE ISSUED ");
        str = obj3.nextLine();
        System.out.println("BOOK ID");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("ISSUE DATE");
        b = obj3.nextLine();
        System.out.println("TOTAL NUMBER OF BOOKS ISSUED");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.println("RETURN DATE");
        date = obj3.nextLine();
    }
    int getid() {
        return a;
    }
    public void ret() {
        System.out.println("\nENTER STUDENT NAME AND BOOK_ID");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookid = c.nextInt();
        if (a == bookid) {
            System.out.println("\nDETAILS OF THE BOOKS RETURNED");
            System.out.println("BOOK NAME:" + Management.str);
            System.out.println("BOOK ID:" + Management.a);
            System.out.println("ISSUE DATE:" + Management.b);
            System.out.println("TOTAL NUMBER OF BOOKS ISSUED:" + Management.c);
            System.out.println("RETURN DATE: " + Management.date);
        } else {
            System.out.println("WRONG BOOK ID,PLEASE ENTER CORRECT BOOK ID");
        }
    }
    public void detail() {
        System.out.println("\nBOOK NAME:" + Management.str);
        System.out.println("BOOK ID:" + Management.a);
        System.out.println("ISSUE DATE:" + Management.b);
        System.out.println("TOTAL NUMBER OF BOOKS ISSUED:" + Management.c);
        System.out.println("RETURN DATE: " + Management.date);
    }
    public void exit() {
        System.exit(0);
    }
}