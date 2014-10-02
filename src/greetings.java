public class greetings {
    public static void main(String[] args) {
        String[] names = new String[]{"Иван", "Петр", "Федор", "Сидор", "Кузьма"};
        String[] greetings = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            greetings[i] = ("Привет, " + names[i]);
        }
        for (String greeting : greetings) {
            System.out.println(greeting + "!");
        }
    }
}