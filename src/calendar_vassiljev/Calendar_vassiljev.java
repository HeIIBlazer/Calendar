//
package calendar_vassiljev;

import java.util.Scanner;

public class Calendar_vassiljev {
    static enum Color{
    Зеленой, 
    Красной, 
    Желтой, 
    Белой, 
    Черной,
    }
    static enum Animal{
    Крысы, 
    Коровы, 
    Тигра, 
    Зайца, 
    Дракон, 
    Змеи, 
    Лошади, 
    Овцы, 
    Обезьяны, 
    Курицы, 
    Собаки, 
    Свиньи
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите год:");
    int color= 0;
    int animal=0;
    int year =scanner.nextInt();
    int x=(((year- 1984) % 60) / 12);
    int y=(((year- 1984) % 60) % 12);
    System.out.print(x);
    switch (x){
        case 0:
            color = 0;
            break;
        case 1:
            color=1;
            break;
        case 2:
            color=2;
            break;
        case 3:
            color=3;
            break;
        case 4:
            color=4;
            break;        
    }
    switch(y){
        case 0:
            animal =0;
            break;
        case 1:
            animal=1;
            break;
        case 2:
            animal=2;
            break;
        case 3:
            animal=3;
            break;
        case 4:
            animal=4;
            break;
        case 5:
            animal=5;
            break;
        case 6:
            animal=6;
            break;
        case 7:
            animal=7;
            break;
        case 8:
            animal=8;
            break;
        case 9:
            animal=9;
            break;
        case 10:
            animal=10;
            break;
        case 11:
            animal=11;
            break;         
    }
    //System.out.print(animal);
    //System.out.print(color);
    System.out.printf("Год %s %s %n", Animal.values()[animal], Color.values()[color]);
    }
}
