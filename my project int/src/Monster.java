import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF\u200D";
    private final int x, y;
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    Monster(int sizeBoard) {
        this.y = r.nextInt(sizeBoard - 1);
        this.x = r.nextInt(sizeBoard);
    }

    public String getImage() {
        return image;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public boolean conflictPerson(int perX, int perY) {
        return perY - 1 == this.y && perX - 1 == this.x;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Ответьте на вопрос");
        int u = r.nextInt(1,7);

        if (u == 1) {
            System.out.println("Сколько есть сторон света?");
            int ans1 = sc.nextInt();
            int trueans1 = 4;
            if (ans1 == trueans1) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;
        } else if (u == 2) {
            System.out.println("Сколько морей омывают Россию?");
            int ans2 = sc.nextInt();
            int trueans2 = 15;
            if (ans2 == trueans2) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;
        } else if (u == 3) {
            System.out.println("Сколько всего городов с населением больше миллиона человек в России?");
            int ans3 = sc.nextInt();
            int trueans3 = 16;
            if (ans3 == trueans3) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;
        } else if (u == 4) {
            System.out.println("Когда началась Вторая Мировая война? (год)");
            int ans4 = sc.nextInt();
            int trueans4 = 1939;
            if (ans4 == trueans4) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;
        } else if (u == 5) {
            System.out.println("Сколько вублинов в игре My singing monsters?");
            int ans5 = sc.nextInt();
            int trueans5 = 19;
            if (ans5 == trueans5) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;
        } else if (u == 6) {
            System.out.println("Чему равна сумма всех внутренних углов треугольника? (градусная мера)");
            int ans6 = sc.nextInt();
            int trueans6 = 180;
            if (ans6 == trueans6) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;
        } else {
            System.out.println("Какой самый большой по населению город России?");
            String ans7 = sc.nextLine();
            String trueans7 = "Москва";
            if (ans7.equals(trueans7)) {
                System.out.println("Ты победил монстра!");
                return true;
            }
            System.out.println("Ты проиграл эту битву!");
            return false;

        }


    }
}
