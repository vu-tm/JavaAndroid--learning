package com.mycompany.baitapoop;

import java.util.Scanner;
import java.util.Random;

/**
 * Một nông trại chăn nuôi có 3 loại gia súc: bò, cừu, và dê. 
 * Mỗi loại gia súc đều có thể sinh con, cho sữa và phát ra tiếng kêu riêng của chúng. 
 * Khi đói, các gia súc sẽ phát ra tiếng kêu để đòi ăn. 
 * Sau một thời gian chăn nuôi, người chủ nông trại muốn thống kê xem trong nông trại 
 * có bao nhiêu gia súc ở mỗi loại, tổng số lít sữa mà tất cả các gia súc của ông đã cho.
 * 
 * Áp dụng kế thừa, xây dựng chương trình cho phép người chủ nông trại nhập vào 
 * số lượng gia súc ban đầu ở mỗi loại.
 * 
 * a. Một hôm người chủ nông trại đi vắng, tất cả gia súc trong nông trại đều đói. 
 *    Hãy cho biết những tiếng kêu nghe được trong nông trại.
 * 
 * b. Chương trình sẽ đưa ra thống kê các thông tin người chủ mong muốn (nêu trên) 
 *    sau một lứa sinh và một lược cho sữa của tất cả gia súc. Biết rằng:
 *    - Tất cả gia súc ở mỗi loại đều sinh con.
 *    - Số lượng sinh của mỗi gia súc là ngẫu nhiên.
 *    - Tất cả gia súc ở mỗi loại đều cho sữa.
 *    - Số lít sữa mỗi gia súc cho là ngẫu nhiên nhưng trong giới hạn sau:
 *        + Bò: 0 – 20 lít.
 *        + Cừu: 0 – 5 lít.
 *        + Dê: 0 – 10 lít.
 */
abstract class GiaSuc {

    String type;

    //<Phạm vi truy cập> <Tên lớp>(){}
    public GiaSuc(String type) {
        this.type = type;
    }

    public abstract String TiengKeu();

    public abstract int CountCon(Random rnd);

    public abstract double ChoSua(Random rnd);

}

class Bo extends GiaSuc {

    public Bo() {
        super("Bo");
    }

    @Override
    public String TiengKeu() {
        return "O o o";
    }

    @Override
    public int CountCon(Random rnd) {
        return rnd.nextInt(4);
    }

    @Override
    public double ChoSua(Random rnd) {
        return rnd.nextInt(21) + rnd.nextDouble();
    }
}

class Cuu extends GiaSuc {

    public Cuu() {
        super("Cuu");
    }

    @Override
    public String TiengKeu() {
        return "BE Be be";
    }

    @Override
    public int CountCon(Random rnd) {
        return rnd.nextInt(4);
    }

    @Override
    public double ChoSua(Random rnd) {
        return rnd.nextInt(11) + rnd.nextDouble();
    }
}

class De extends GiaSuc {

    public De() {
        super("De");
    }

    @Override
    public String TiengKeu() {
        return "E e e";
    }

    @Override
    public int CountCon(Random rnd) {
        return rnd.nextInt(10);
    }

    @Override
    public double ChoSua(Random rnd) {
        return rnd.nextInt(6) + rnd.nextDouble();
    }
}

public class NongTrai {

    public void run() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Nhap so luong bo ban dau: ");
        int boCount = sc.nextInt();
        System.out.print("Nhap so luong cuu ban dau: ");
        int cuuCount = sc.nextInt();
        System.out.print("Nhap so luong de ban dau: ");
        int deCount = sc.nextInt();

        Bo bo = new Bo();
        Cuu cuu = new Cuu();
        De de = new De();

        // a) Tat ca gia suc phat ra tieng keu
        System.out.println("Tieng keu gia suc: ============");
        for (int i = 0; i < boCount; i++) {
            System.out.print(bo.TiengKeu() + " ");
        }
        for (int i = 0; i < cuuCount; i++) {
            System.out.print(cuu.TiengKeu() + " ");
        }
        for (int i = 0; i < deCount; i++) {
            System.out.print(de.TiengKeu() + " ");
        }

        // b) Xuat thong tin moi
        int boBefore = boCount;
        int cuuBefore = cuuCount;
        int deBefore = deCount;

        int boAfter = 0;
        int cuuAfter = 0;
        int deAfter = 0;

        int conBoCount = bo.CountCon(rnd);
        int conCuuCount = cuu.CountCon(rnd);
        int conDeCount = de.CountCon(rnd);

        for (int i = 0; i < boBefore; i++) {
            boAfter = boBefore + conBoCount;
        }
        for (int i = 0; i < cuuBefore; i++) {
            cuuAfter = cuuBefore + conCuuCount;
        }
        for (int i = 0; i < deBefore; i++) {
            deAfter = deBefore + conDeCount;
        }

        System.out.println();
        System.out.println("Bo sinh ra " + conBoCount + " con");
        System.out.println("Cuu sinh ra " + conCuuCount + " con");
        System.out.println("De sinh ra  " + conDeCount + " con");

        System.out.println();
        System.out.println("So luong bo sau khi de: " + boAfter);
        System.out.println("So luong cuu sau khi de: " + cuuAfter);
        System.out.println("So luong de sau khi de: " + deAfter);

        System.out.println();
        System.out.printf("Bo cho %.2f lit sua\n", bo.ChoSua(rnd));
        System.out.printf("Cuu cho %.2f lit sua\n", cuu.ChoSua(rnd));
        System.out.printf("De cho %.2f lit sua\n", de.ChoSua(rnd));

        double totalMilk = 0.0;
        for (int i = 0; i < boCount; i++) {
            totalMilk += bo.ChoSua(rnd);
        }
        for (int i = 0; i < cuuCount; i++) {
            totalMilk += cuu.ChoSua(rnd);
        }
        for (int i = 0; i < deCount; i++) {
            totalMilk += de.ChoSua(rnd);
        }

        System.out.printf("Tong so lit sua thu duoc: %.2f lit\n", totalMilk);
    }
}
