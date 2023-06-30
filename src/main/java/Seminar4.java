import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Seminar4 {
    static Scanner iScanner = new Scanner(System.in);

    public static String GetData(String message) {
        System.out.println(message);
        return iScanner.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<String[]> humans = new ArrayList<>();
        System.out.println("Введите данные в формате ФИО, возраст, пол: ");
        while (true) {
            String a = iScanner.nextLine();
            if (a.equals("q")) break;
            humans.add(a.split(" "));
        }
        for (String[] i : humans) {
            System.out.printf("%s %s.%s. %s %s", i[0], i[1].toUpperCase().charAt(0),
                    i[2].toUpperCase().charAt(0), i[3], i[4]);
//        }
//        ArrayList <String> surname = new ArrayList<>();
//        ArrayList <String> name = new ArrayList<>();
//        ArrayList <String> lastname = new ArrayList<>();
//        ArrayList <Integer> age = new ArrayList<>();
//        ArrayList <Boolean> gender = new ArrayList<>();
//
//        for (String[] i: humans){
//            surname.add(i[0]);
//            name.add(i[1]);
//            lastname.add(i[2]);
//            age.add(Integer.valueOf(String.valueOf(Integer.parseInt(i[3]))));
//            gender.add(i[4].toLowerCase().contains("M"));
////            System.out.printf("%s %s.%s. %s %s" , i[0],i[1].toUpperCase().charAt(0),
////                    i[2].toUpperCase().charAt(0), i[3], i[4]);
//
//            ArrayList<Integer> indexes = new ArrayList<>();
//            for (int i =0; i < age.size(); i++){
//                for (int j = 0; j < age.size() -1; j++){
//                    if(age.get(j) < age.get(j+1)){
//
//                    }
//                }
//            }

            String a = iScanner.nextLine();
            if (a.equals("q")) {
                System.exit(0);
            } else {
                humans.sort(new Comparator<String[]>() {
                    @Override
                    public int compare(String[] t0, String[] t1) {
                        return Integer.parseInt(t0[3]) - Integer.parseInt(t1[3]);

                    }
                });
//                for (String[] i : humans) {
//                    System.out.printf("%s %s.%s. %s %s", i[0], i[1].toUpperCase().charAt(0),
//                            i[2].toUpperCase().charAt(0), i[3], i[4]);
                }
            }
        }
    }


