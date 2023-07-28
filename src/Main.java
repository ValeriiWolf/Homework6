// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    //task1();
    //task2();
    //task3();
    //task4();
    //task5();
    //task6();
    //task7();
    //task8();
    //task9();
    task10();
    }
    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void task3() {
        for (int i = 0; i <=17; i++) {
            if(i==0){
                System.out.println("i = " + i);
            }else if(i%2==0) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i+" год является високосным");
        }
    }

    public static void task6(){
        for(int i=7;i<100;i=i+7){
            System.out.println("i = " + i);
        }
    }

    public static void task7(){
        for (int i=1;i<1000;i=i*2){
            System.out.println("i = " + i);
        }
    }

    public static void task8(){
        int salary = 29000;
        int totalContribution = 0;
        for (int i = 1;i <= 12;i++){
            totalContribution = totalContribution + salary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalContribution+" рублей");
        }
    }

    public static void task9(){
        int salary = 29000;
        double totalContribution = 0;
        int salaryPenny = salary * 100;
        int totalPenny = 0;
        for (int i = 1;i <= 12;i++){
            totalPenny = totalPenny + totalPenny / 100;
            totalPenny = totalPenny + salaryPenny;
            totalContribution = totalPenny / 100.;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalContribution+" рублей");
        }
    }

    public static void task10(){
        System.out.println("таблица умножения на 2");
        int two=2;
        int rez=0;
        for(int i = 1;i < 11;i++){
            rez = two * i;
            System.out.println(+rez);
        }
    }
}