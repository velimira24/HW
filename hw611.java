import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class hw611 {
    public static void main(String[] args) {
        laptop lap1 = new laptop("16R5", "Honor");
        lap1.setRAM(16);
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setColour("black");
        lap1.setYear(2020);
        lap1.setGraphicController("RadeonGraphic");

        laptop lap2 = new laptop("16R5", "Honor");
        lap2.setRAM(16);
        lap2.setHDD(700);
        lap2.setOS("Windows");
        lap2.setColour("white");
        lap2.setYear(2020);
        lap2.setGraphicController("RadeonGraphic");

        laptop lap3 = new laptop("U1530EM", "Haier");
        lap3.setRAM(4);
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setColour("green");
        lap3.setYear(2022);
        lap3.setGraphicController("Intel UHD Graphics 600");

        laptop lap4 = new laptop("16 RLEF-X 53013ESY", "Huawei");
        lap4.setRAM(16);
        lap4.setHDD(800);
        lap4.setOS("Windows");
        lap4.setColour("white");
        lap4.setYear(2021);
        lap4.setGraphicController("Intel Iris Xe Graphicsc");

        laptop lap5 = new laptop("16 RLEF-X 53013ESI", "Huawei");
        lap5.setRAM(16);
        lap5.setHDD(800);
        lap5.setOS("Windows");
        lap5.setColour("black");
        lap5.setYear(2022);
        lap5.setGraphicController("Intel Iris Xe Graphicsc");

        laptop lap6 = new laptop("IdeaPad 5", "Lenovo");
        lap6.setRAM(8);
        lap6.setHDD(700);
        lap2.setOS("Windows");
        lap6.setColour("white");
        lap6.setYear(2021);
        lap6.setGraphicController("Intel Iris Xe Graphics");

        HashSet<laptop> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5));
        HashSet<laptop> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print(
                "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("colour", temp);
            }
            System.out.print(
                    "Введите цифру, соответствующую необходимому критерию:\n 1 - Оперативная память \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - Цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getRam() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("colour")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    laptop lap = (laptop) it.next();
                    if (lap.getColour().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            laptop lap = (laptop) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }
}