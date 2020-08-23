/**
 * Location
 * <p>
 * Version 1.0
 * <p>
 * 10.05.2020
 */


package REST_API.DatabaseClasses;


public class Location {

    private String time;
    private String date;
    private String gps;
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

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public int getDeviceDocumentationNumber() {
        return deviceDocumentationNumber;
    }

    public void setDeviceDocumentationNumber(int deviceDocumentationNumber) {
        this.deviceDocumentationNumber = deviceDocumentationNumber;
    }
}
