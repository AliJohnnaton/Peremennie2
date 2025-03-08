public class Main {
    public static void firstTask() {
        byte firstByte = 1;
        short firstShort = 129;
        int firstInt = 32768;
        long firstLong = 2147483648L;
        float firstFloat = 2.4f;
        double firstDouble = 4.12345678;
        System.out.println("Задание 1" +
                "\nЗначение переменной firstByte с типом byte равно " + firstByte +
                "\nЗначение переменной firstShort с типом short равно " + firstShort +
                "\nЗначение переменной firstInt с типом int равно " + firstInt +
                "\nЗначение переменной firstLong с типом long равно " + firstLong +
                "\nЗначение переменной firstFloat с типом float равно " + firstFloat +
                "\nЗначение переменной firstDouble с типом double равно " + firstDouble);
    }

    public static void secondTask() {
        float secondFloat = 27.12f;
        long secondLong = 987678965549L;
        double secondDouble = 2.786;
        int secondInt = 569;
        int secondInt2 = -159;
        short secondShort = 27897;
        byte secondByte = 67;
        System.out.println("\nЗадание 2" +
                "\nЯ не понял что требуеться от меня в задании, так как по ТЗ, я должен просто инициализировать переменные, поэту воть, ГОТОВО!");
    }

    public static void thirdTask() {
        int lyudmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        System.out.println("\nЗадание 3" +
                "\nНа каждого ученика рассчитано " + paper / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna) + " листов бумаги");
    }

    public static void fourthTask() {
        System.out.println("\nЗадание 4");//4 Задание
        int bottles = 16;
        int startTime = 2;
        int bottlePerMin = bottles / startTime;
        int firstTime = bottlePerMin * 20;
        System.out.println("За 20 минут машина произвела " + firstTime + " штук бутылок");
        int bottlePerHour = bottlePerMin * 60;
        int secondTime = bottlePerHour * 24;
        System.out.println("За сутки машина произвела " + secondTime + " штук бутылок");
        int thirdTime = secondTime * 3;
        System.out.println("За 3 дня машина произвела " + thirdTime + " штук бутылок");
        int fourthTime = secondTime * 30;
        System.out.println("За 1 месяц машина произвела " + fourthTime + " штук бутылок");
    }

    public static void fifthTask() {
        System.out.println("\nЗадание 5");
        int allCans = 120;
        int whiteColor = 2;
        int brownColor = 4;
        int oneClass = whiteColor + brownColor;
        int classes = allCans / oneClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + classes * whiteColor + " банок белой краски и " + classes * brownColor + " банок коричневой краски");
    }

    public static void sixthTask() {
        System.out.println("\nЗадание 6");
        int oneBanana = 80;
        int allBanana = oneBanana * 5;
        int milk100 = 105;
        int allMilk = milk100 * 2;
        int oneIcecream = 100;
        int allIcecreams = oneIcecream * 2;
        int oneEgg = 70;
        int allEggs = oneEgg * 4;
        int blender = allEggs + allBanana + allIcecreams + allMilk;
        System.out.println(blender / 1000 + "кг. " + blender % 1000 + "г.");
    }

    public static void seventhTask() {
        System.out.println("\nЗадание 7");
        float fullMass = 7.0f;
        float firstStage = 0.25f;
        float secondStage = 0.5f;
        int minDays = (int) (fullMass / secondStage);
        int maxDays = (int) (fullMass / firstStage);
        int midDays = (minDays + maxDays) / 2;
        System.out.println("При потере в 250г. займёт " + maxDays + "д., при потере 500г. займёт " + minDays + "д., в среднем " + midDays + "д.");
    }

    public static int upper(int count, int per) {
        return count + (count * per / 100);
    }

    public static void eightTask() {
        System.out.println("\nЗадание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int upPercent = 10;
        int yearStart = (masha + denis + kristina) * 12;
        int masha2 = upper(masha, upPercent);
        int denis2 = upper(denis, upPercent);
        int kristina2 = upper(kristina, upPercent);
        int yearEnd = (masha2 + denis2 + kristina2) * 12;
        System.out.println("Маша получала " + masha + " рублей в месяц, а теперь получает " + masha2 + " рублей в месяц");
        System.out.println("Годовой доход вырос на " + ((masha2 - masha) * 12) + " рублей");
        System.out.println("Денис получал " + denis + " рублей в месяц, а теперь получает " + denis2 + " рублей в месяц");
        System.out.println("Годовой доход вырос на " + ((denis2 - denis) * 12) + " рублей");
        System.out.println("Кристина получала " + kristina + " рублей в месяц, а теперь получает " + kristina2 + " рублей в месяц");
        System.out.println("Годовой доход вырос на " + ((kristina2 - kristina) * 12) + " рублей");
        System.out.println("Изначальный общий годовой доход на них состовлял " + yearStart + " рублей, а теперь " + yearEnd + " рублей, разница " + (yearEnd - yearStart) + " рублей");
    }

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eightTask();
    }
}