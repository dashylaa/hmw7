public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1(){
int start=0;
        while (start <=10)
        {  System.out.print(" "+ start +" " );
            System.out.print("");
        start++;}

    }

    private static void task2(){
        int start=10;
        while (start >=0) {
            System.out.println(" " + System.lineSeparator() + "");
            {System.out.print(start);
            start--;}




    }}
    private static void task3(){
        int population = 12_000_000;
        double death = (double) 17 / 1000;
        double birth = (double) 8 / 1000;
         int j=0;

        while (j< 10) {
            population = (int) (population + (population * death) - (population * birth));
            j++;
            System.out.println("Год " + j + ", численность населения составляет " + population);}}

    private static void task4() {
        int start = 0;
        int salary = 15000;
        int i = 0;
        for (; start < 12_500_000; i++ ) {

            salary = salary * 7 / 100 + salary;
            start = salary + start;
            if (start >= 12000000) ;
            else if (i%6==0)
            {System.out.println(i+ " месяцев "+ start);

        }
    }}
    private static void task5() {
        int start = 0;
        int salary = 15000;
        int i = 0;
        for (i=0;i<=108; i=i+6 ) {

            salary = salary * 7 / 100 + salary;
            start = salary + start;
            if (i%6==0)

                System.out.println(i + " месяцев " + start);


            }}

    private static void task6() {
        int friday = 1;
        for (int n = 7; n < 30; n++) {
            if (n % 7 == 1) {
                System.out.println("Пора сдавать отчет!Сегодня пятница "+n+" число");
            }


    }}
    private static void task7() {
        {
            for(int i = 2; i ==2; i++){
                for(int k = 1; k <=10; k++){
                    System.out.print(k * i + "  ");
                }
                System.out.println("");
            }
        }



    }}