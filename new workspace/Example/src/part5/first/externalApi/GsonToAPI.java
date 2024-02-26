package part5.first.externalApi;

import com.google.gson.Gson;

public class GsonToAPI {
    public static void main(String[] args) {
        Person p = new Person("John", 30);
        Gson gson = new Gson();
        gson.toJson(p);
        System.out.println(p);
    }
}
