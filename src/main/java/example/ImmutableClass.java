package example;

import java.util.HashMap;
import java.util.Map;

final class ImmutableClass {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;


    ImmutableClass(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;

        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

class Student {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "firts");
        map.put("2", "Second");
        map.put("3", "third");

        ImmutableClass im = new ImmutableClass("ABC", 101, map);
        System.out.println(im.getName());
        System.out.println(im.getRegNo());
        System.out.println(im.getMetadata());
        map.put("4", "third");
        ImmutableClass ima = new ImmutableClass("ABC", 101, map);

        System.out.println(ima.getMetadata());
    }
}
