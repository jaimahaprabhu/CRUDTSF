package apps.jmp.crud_app_tsf.EduDetails;

public class EducationDetailsData {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EducationDetailsData{" +
                "data=" + data +
                '}';
    }
}
