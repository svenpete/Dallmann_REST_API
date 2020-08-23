/**
 * Borrows
 * <p>
 * Version 1.0
 * <p>
 * 10.05.2020
 */

package REST_API.DatabaseClasses;

import java.util.Date;

public class Borrows {

    private Date loanDay;
    private Date loanEnd;
    private Date loanPeriod;
    private int workerNumber;
    private int inventoryNumber;
    private int projectNumber;

    /**
     * getter and setter
     */

    public Date getLoanDay() {
        return loanDay;
    }

    public void setLoanDay(Date loanDay) {
        this.loanDay = loanDay;
    }

    public Date getLoanEnd() {
        return loanEnd;
    }

    public void setLoanEnd(Date loanEnd) {
        this.loanEnd = loanEnd;
    }

    public Date getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Date loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public int getWorkerNumber() {
        return workerNumber;
    }

    public void setWorkerNumber(int workerNumber) {
        this.workerNumber = workerNumber;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }
}
