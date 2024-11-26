import java.util.Scanner;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = "The title is: " + s;
    }

    void printTitle() {
        System.out.println(title);
    }
}

public class Solution2 {
    public static void main(String[] args) {
        MyBook new_novel = new MyBook();

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do titulo: ");
        String nome = scan.nextLine();

        new_novel.setTitle(nome);
        new_novel.printTitle();
    }
}
