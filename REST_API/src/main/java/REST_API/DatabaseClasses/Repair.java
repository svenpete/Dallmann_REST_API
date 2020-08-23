package REST_API.DatabaseClasses;

public class Repair {

    private String time;
    private String date;
    private String comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDeviceDocumentationNumber() {
        return deviceDocumentationNumber;
    }

    public void setDeviceDocumentationNumber(String deviceDocumentationNumber) {
        this.deviceDocumentationNumber = deviceDocumentationNumber;
    }
}
