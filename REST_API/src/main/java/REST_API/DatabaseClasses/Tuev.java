package REST_API.DatabaseClasses;

public class Tuev {

    private String time;
    private String date;
    private boolean status;
    private String deviceDocumentationNumber;

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

    public String getDeviceDocumentationNumber() {
        return deviceDocumentationNumber;
    }

    public void setDeviceDocumentationNumber(String deviceDocumentationNumber) {
        this.deviceDocumentationNumber = deviceDocumentationNumber;
    }
}
