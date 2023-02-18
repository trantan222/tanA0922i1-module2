package File.ReadFile;

public class country {
    private int id ;
    private String code;
    private String name;

    public country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    public country(String [] arr){
        this.id = Integer.parseInt(arr[0]);
        this.code = arr[1];
        this.name = arr[2];

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
