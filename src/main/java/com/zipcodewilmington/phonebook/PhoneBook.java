public class PhoneBook {
    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        List<String> numbers = new ArrayList<>();
        this.phonebook = map;
        this.phonebook = new HashMap<>(map);

    }

    public PhoneBook() {
        this(null);
        this.phonebook = new HashMap<>();

    }

    public void add(String name, String phoneNumber) {
        @@ -47,8 +47,9 @@ public List<String> lookup(String name) {
        }

        public String reverseLookup(String phoneNumber)  {
            List<String> numbers = new ArrayList<>();
            for(Map.Entry m: phonebook.entrySet()){
                if(m.getValue().equals(phoneNumber)){
                    if(m.getValue().toString().contains(phoneNumber)){
                        return m.getKey().toString();
                    }
                }
                @@ -58,8 +59,12 @@ public String reverseLookup(String phoneNumber)  {

                    public List<String> getAllContactNames() {
                        List<String> names = new ArrayList<>();
                        names.addAll(phonebook.keySet());
                        return names;
//      names.addAll(phonebook.keySet());
//      return names;
                        for(Map.Entry m: phonebook.entrySet()){
                            names.add(m.getKey().toString());
                        }
                        return names;
                    }

                    public Map<String, List<String>> getMap() {