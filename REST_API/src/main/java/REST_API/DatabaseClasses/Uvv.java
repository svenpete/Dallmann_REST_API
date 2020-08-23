package REST_API.DatabaseClasses;

public class Uvv {

    private String time;
    private String date;
    private boolean status;
    private int deviceDocumentationNumber;

    /**
     * getter and setter
     */

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getDeviceDocumentationNumber() {
        return deviceDocumentationNumber;
    }

    public void setDeviceDocumentationNumber(int deviceDocumentationNumber) {
        this.deviceDocumentationNumber = deviceDocumentationNumber;
    }
}
