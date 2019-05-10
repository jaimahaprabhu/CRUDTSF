package apps.jmp.crud_app_tsf.PersonDetails;

public class PersonalDetailsData {
    private Data data;

    public PersonalDetailsData() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PersonalDetailsData{" +
                "data=" + data +
                '}';
    }
}
