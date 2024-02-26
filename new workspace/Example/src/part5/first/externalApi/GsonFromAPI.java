package part5.first.externalApi;

import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        String str = "{\"name\"=\"John\", \"age\"=30}";
        Gson gson = new Gson();

        Person person = gson.fromJson(str, Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
