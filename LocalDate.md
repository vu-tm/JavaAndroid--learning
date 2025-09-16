# Thư viện LocalDate trong Java

#### Khai báo
```java
import java.time.LocalDate;
```
<br>

#### Lấy ngày hiện tại
```java
LocalDate.now();
```
<br>

```java
import java.time.LocalDate;
import java.time.Month;

class LocalDateExample {
    public static void main(String[] args) {

        // Current date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2020-01-04

        //Specific date
        LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);
        System.out.println(localDate2); // 2017-05-15
    }
}
```

#### Lấy ngày, tháng, năm từ LocalDate
```java
import java.time.LocalDate;
class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Year : " + localDate.getYear()); // Year : 2020
        System.out.println("Month : " + localDate.getMonth().getValue()); // Month : 1
        System.out.println("Day of Month : " + localDate.getDayOfMonth()); // Day of Month : 4
        System.out.println("Day of Week : " + localDate.getDayOfWeek()); // Day of Week : SATURDAY
        System.out.println("Day of Year : " + localDate.getDayOfYear()); // Day of Year : 4
    }
}
```
<br>

#### Cộng và trừ ngày tháng năm
```java
import java.time.LocalDate;
class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        // LocalDate's plus methods
        System.out.println("Addition of days : " + localDate.plusDays(5)); // Addition of days : 2020-01-09
        System.out.println("Addition of months : " + localDate.plusMonths(15)); // Addition of months : 2021-04-04
        System.out.println("Addition of weeks : " + localDate.plusWeeks(45)); // Addition of weeks : 2020-11-14
        System.out.println("Addition of years : " + localDate.plusYears(5)); // Addition of years : 2025-01-04

        // LocalDate's minus methods
        System.out.println("Subtraction of days : " + localDate.minusDays(5)); // Subtraction of days : 2019-12-30
        System.out.println("Subtraction of months : " + localDate.minusMonths(15)); // Subtraction of months : 2018-10-04
        System.out.println("Subtraction of weeks : " + localDate.minusWeeks(45)); // Subtraction of weeks : 2019-02-23
        System.out.println("Subtraction of years : " + localDate.minusYears(5)); // Subtraction of years : 2015-01-04

    }
}
```
<br>

#### Convert String sang LocalDate
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class LocalDateExample {
    public static void main(String[] args) {

        // ISO Date
        LocalDate localDate = LocalDate.parse("2020-05-03",
                DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate); // 2020-05-03

        // yyyy/MM/dd pattern
        LocalDate localDate1 = LocalDate.parse("2020/05/12",
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate1); // 2020-05-12

        // MMM dd, yyyy pattern
        LocalDate localDate2 = LocalDate.parse("May 05, 2020",
                DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        System.out.println(localDate2); // 2020-05-05

        // dd-MMM-yyyy pattern
        LocalDate localDate3 = LocalDate.parse("12-Jan-2020",
                DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println(localDate3); // 2020-01-12

        // dd-LL-yyyy pattern
        LocalDate localDate4 = LocalDate.parse("12-01-2020",
                DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println(localDate4); // 2020-01-12

    }
}
```
<br>

#### Convert LocalDate sang String
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class LocalDateExample {
    public static void main(String[] args) {

        // ISO Date
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(localDate.format(dateFormatter)); // 2020-01-04

        // yyyy/MM/dd pattern
        DateTimeFormatter dateFormatter1 = DateTimeFormatter
                .ofPattern("yyyy/MM/dd");
        System.out.println(localDate.format(dateFormatter1)); // 2020/01/04

        // MMMM dd, yyyy pattern
        DateTimeFormatter dateFormatter2 = DateTimeFormatter
                .ofPattern("MMMM dd, yyyy");
        System.out.println(localDate.format(dateFormatter2)); // January 04, 2020

        // dd-MMM-yyyy pattern
        DateTimeFormatter dateFormatter3 = DateTimeFormatter
                .ofPattern("dd-MMM-yyyy");
        System.out.println(localDate.format(dateFormatter3)); // 04-Jan-2020

        // dd-LL-yyyy pattern
        DateTimeFormatter dateFormatter4 = DateTimeFormatter
                .ofPattern("dd-LL-yyyy");
        System.out.println(localDate.format(dateFormatter4)); // 04-01-2020

    }
}
```
<br>

#### Kiểm tra năm nhuận
```java
import java.time.LocalDate;
import java.time.Month;

class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate localDate2 = LocalDate.of(2016, Month.JANUARY, 1);

        if(localDate1.isLeapYear()){
            System.out.println(localDate1.getYear()+ " is a leap year");
        }else{
            System.out.println(localDate1.getYear()+ " is not a leap year");
        }

        if(localDate2.isLeapYear()){
            System.out.println(localDate2.getYear()+ " is a leap year");
        }else{
            System.out.println(localDate2.getYear()+ " is not a leap year");
        }

    }
}
```
<br>

