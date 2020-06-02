package com.example.entity;


import javax.persistence.*;
import java.time.LocalDate;

/*Projekt pamiętnik
        0. Wszystkie dane mają zostać odczytane/zapisane w bazie danych przy użyciu Hibernate
        1. Stwórz program, który będzie symulował elektroniczny pamiętnik
        2. Program będzie wymagał od użytkownika wpisania danych - użyj klasy Scanner
        3. Po uruchomieniu program wymaga od użytkownika podania loginu i hasła
        4. Może być wielu użytkowników
        5. Jeśli login i hasło są poprawne, użytkownik zostanie poinformowany, że może wybrać jedną z opcji:
        - dodać wpis do pamiętnika
        - odczytać wpis z pamiętnika
        - zamknąć program
        6. Użytkownik może wybrać opcję wprowadzając np. wartość "1" żeby dodać wpis i "2" żeby odczytać wpis
        7. Jeśli użytkownik wpisze niepoprawną wartość, zostanie o tym poinformowany i będzie musiał ją wprowadzić ponownie
        8. Jeśli będzie chciał dodać wpis zostanie poproszony o wpisanie tytułu i treści wpisu
        9. Po dodaniu wpisu następuje powrót do menu z punktu 4
        10. Jeśli będzie chciał odczytać wpis, zostanie wyświetlona lista tytułów istniejących wpisów i użytkownik będzie musiał wybrać który wpis chce odczytać
        11. Każdy użytkownik ma dostęp wyłącznie do wpisów, które wcześniej sam dodał
        12. Po odczytaniu wpisu następuje powrót do menu z punktu 4
        13. Dla chętnych:
        - dodaj możliwość edycji wpisu
        - dodaj możliwość usunięcia wpisu*/
@Entity
@Table(name="table_diary")
public class Diary {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    String user;
    String title;
    String contents;
    LocalDate date;


    public Diary(){

    }

    @Override
    public String toString() {
        return "Diary{" +
                "user='" + user + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", date=" + date +
                '}';
    }
}
