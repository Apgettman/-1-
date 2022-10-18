package oop1object;

public class Main {
    // ДЗ 1, задание 1,2
    public static void main(String[] args) {

        int currenYear = 2022;

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.yearOfBirth = 35;
        maksim.job = "бренд-менеджером";

        Human anna = new Human();
        anna.name = "Аня";
        anna.town = "Москва";
        anna.yearOfBirth = 29;
        anna.job = "методистом образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калиниград";
        katya.yearOfBirth = 28;
        katya.job = "продакт-менеджером";

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 27;
        artem.job = "директора по развитию бизнеса";

        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.town
                + ". Я родился в " + (currenYear - maksim.yearOfBirth) + " году. Я работаю на должности " + maksim.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.town
                + ". Я родилась в " + (currenYear - anna.yearOfBirth) + " году. Я работаю на должности " + anna.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.town
                + ". Я родилась в " + (currenYear - katya.yearOfBirth) + " году. Я работаю на должности " + katya.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town
                + ". Я родился в " + (currenYear - artem.yearOfBirth) + " году. Я работаю на должности " + artem.job
                + ". Будем знакомы!");
    }
}