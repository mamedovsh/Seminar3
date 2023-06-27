//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать,
// как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

public class PhoneBook {
    private static HashMap<String, ArrayList>contacts = new HashMap();
    public static void addContact(String name, String phoneNumber){
        if(contacts.containsKey(name)){
            ArrayList phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name,phoneNumbers);
        }
        else {
            ArrayList phoneNumbers = new ArrayList();
            phoneNumbers.add(phoneNumber);
            contacts.put(name,phoneNumbers);
        }
    }
    public static void printContacts() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(contacts.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().size() - o1.getValue().size());
        for (Map.Entry<String, ArrayList> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
    public static void main(String[] args) {
        addContact("Иванов", "123-45-67");
        addContact("Петров", "111-11-11");
        addContact("Петров", "222-22-22");
        addContact("Сидоров", "333-33-33");
        addContact("Иванов", "987-65-43");

        printContacts();
        //System.out.println(contacts);

}
}

