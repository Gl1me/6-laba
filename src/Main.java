import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Лермонтов М.Ю.", 1, "Поэт", 2000, 123456);
        readers[1] = new Reader("Крылов И.А.", 2, "Баснописец", 1999, 567684);
        readers[2] = new Reader("Лесков Н.С.", 3, "Писатель", 2002, 333333);
        readers[3] = new Reader("Блок А.А.", 4, "Писатель", 2003, 487944);
        readers[4] = new Reader("Пушкин А.С.", 5, "Драматург", 2004, 598554);
        for (Reader r : readers) {
            System.out.println("Введите кол-во книг:");
            int a = scan.nextInt();
            r.takeBook(a);
            System.out.println("Введите названия книг:");
            String s = scan.next();
            r.takeBook(s);
            System.out.println("Введите кол-во книг:");
            int a1 = scan.nextInt();
            r.returnBook(a1);
            System.out.println("Введите названия книг:");
            String s1 = scan.next();
            r.returnBook(s1);
        }
    }
}

class Reader {
    String FIO;
    int bilet;
    String faculty;
    int date;
    int phone;

    Reader(String FIO, int bilet, String faculty, int date, int phone) {
        this.FIO = FIO;
        this.bilet = bilet;
        this.faculty = faculty;
        this.date = date;
        this.phone = phone;
    }

    void takeBook(int n) {
        if (n < 0) System.out.print("Ошибка. Просьба ввести корректное число книг.\n");
        else if (n % 10 == 1 && n % 100 != 11) System.out.printf("%s взял %d книгу\n", this.FIO, n);
        else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20))
            System.out.printf("%s взял %d книги\n", this.FIO, n);
        else System.out.printf("%s взял %d книг\n", this.FIO, n);
    }

    void takeBook(String... books) {
        System.out.printf("%s взял книги: ", this.FIO);
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
        }
        System.out.println();
    }


    void returnBook(int n) {
        if (n < 0) System.out.print("Ошибка. Просьба ввести корректное число книг.\n");
        else if (n % 10 == 1 && n % 100 != 11) System.out.printf("%s вернул %d книгу\n", this.FIO, n);
        else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20))
            System.out.printf("%s вернул %d книги\n", this.FIO, n);
        else System.out.printf("%s вернул %d книг\n", this.FIO, n);
    }

    void returnBook(String... books) {
        System.out.printf("%s вернул книги: ", this.FIO);
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
        }
        System.out.println();
    }
}