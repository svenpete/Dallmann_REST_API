package REST_API.DatabaseClasses;

public class Rights {

    private int roleNumber;
    private boolean bookingDevice;
    private boolean editDevice;
    private boolean addDevice;
    private boolean viewDevice;
    private boolean deleteDevice;
    private boolean addUser;
    private boolean deleteUser;
    private boolean editUser;
    private boolean deleteBooking;
    private boolean editBooking;

    /**
     * getter and setter
     */

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public boolean isBookingDevice() {
        return bookingDevice;
    }

    public void setBookingDevice(boolean bookingDevice) {
        this.bookingDevice = bookingDevice;
    }

    public boolean isEditDevice() {
        return editDevice;
    }

    public void setEditDevice(boolean editDevice) {
        this.editDevice = editDevice;
    }

    public boolean isAddDevice() {
        return addDevice;
    }

    public void setAddDevice(boolean addDevice) {
        this.addDevice = addDevice;
    }

    public boolean isViewDevice() {
        return viewDevice;
    }

    public void setViewDevice(boolean viewDevice) {
        this.viewDevice = viewDevice;
    }

    public boolean isDeleteDevice() {
        return deleteDevice;
    }

    public void setDeleteDevice(boolean deleteDevice) {
        this.deleteDevice = deleteDevice;
    }

    public boolean isAddUser() {
        return addUser;
    }

    public void setAddUser(boolean addUser) {
        this.addUser = addUser;
    }

    public boolean isDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(boolean deleteUser) {
        this.deleteUser = deleteUser;
    }

    public boolean isEditUser() {
        return editUser;
    }

    public void setEditUser(boolean editUser) {
        this.editUser = editUser;
    }

    public boolean isDeleteBooking() {
        return deleteBooking;
    }

    public void setDeleteBooking(boolean deleteBooking) {
        this.deleteBooking = deleteBooking;
    }

    public boolean isEditBooking() {
        return editBooking;
    }

    public void setEditBooking(boolean editBooking) {
        this.editBooking = editBooking;
    }
}
