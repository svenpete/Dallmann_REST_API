/**
 * Worker
 * <p>
 * Version 1.0
 * <p>
 * 09.08.2020
 */

package REST_API.DatabaseClasses;

public class Worker {

    private int worker_id;
    private String password;
    private String eMail;
    private String user_identification;
    private String name;
    private String surName;
    private int roleNumber;

    /**
     * getter and setter
     */

    public int getWorkerNumber() {
        return worker_id;
    }

    public void setWorkerNumber(int workerNumber) {
        this.worker_id = worker_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getUserIdentification() {
        return user_identification;
    }

    public void setUserIdentification(String user_identification) {
        this.user_identification = user_identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }
}
