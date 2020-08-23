/**
 * Jdbc
 * <p>
 * Version 1.0
 * <p>
 * 10.05.2020
 */

package REST_API;

import REST_API.DatabaseClasses.Device;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 * Method to get a connection with the databse
 */

public class Jdbc {

    Connection con = null;

    public Jdbc() {
        String url = "jdbc:mysql://localhost:3306/restdb?useUnicode=true" +
                "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false" +
                "&serverTimezone=UTC";
        String username = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Method to request all devices out of the database
     * @return is returning the ArrayList devices with the inserted params
     */

    public List<Device> getDevices() {

        List<Device> devices = new ArrayList<>();
        String sql = "select *from device";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            /**
             * jumping into the next line of the table device until there is no line left
             */

            while (rs.next()) {
                Device d = new Device();
                d.setInventoryNumber(rs.getInt(1));
                d.setStatus(rs.getString(2));
                d.setDesignation(rs.getString(3));
                d.setSerialNumber(rs.getString(4));
                d.setGuarantee(rs.getString(5));
                d.setCategory(rs.getString(6));
                d.setNote(rs.getString(7));
                d.setReservationStatus(rs.getBoolean(8));
                devices.add(d);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return devices;
    }

    /**
     * Method to request a specific device depending on the inventoryNumber
     * @param inventoryNumber the id of an object from class Device
     * @return is returning the object d from class Device
     */

    public Device getDevice(int inventoryNumber) {
        String sql = "select *from device where inventory_number=" + inventoryNumber;
        Device d = new Device();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                d.setInventoryNumber(rs.getInt(1));
                d.setStatus(rs.getString(2));
                d.setDesignation(rs.getString(3));
                d.setSerialNumber(rs.getString(4));
                d.setGuarantee(rs.getString(5));
                d.setCategory(rs.getString(6));
                d.setNote(rs.getString(7));
                d.setReservationStatus(rs.getBoolean(8));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return d;
    }

    /**
     * Method to create a new device in database
     * @param d1 new device d1
     */

    public void create(Device d1) {
        String sql = "insert into device values(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, d1.getInventoryNumber());
            st.setString(2, d1.getStatus());
            st.setString(3, d1.getDesignation());
            st.setString(4, d1.getSerialNumber());
            st.setString(5, d1.getGuarantee());
            st.setString(6, d1.getCategory());
            st.setString(7, d1.getNote());
            st.setBoolean(8, d1.isReservationStatus());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Method to manipulate a specific device depending on the inventoryNumber
     */

    public void update(Device d1) {

        String sql = "update restdb.device set status=?," +
                " designation=?,serial_number=?, Guarantee=?," +
                " category=?, note=?, reservation_status=? where inventory_number=?";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, d1.getStatus());
            st.setString(2, d1.getDesignation());
            st.setString(3, d1.getSerialNumber());
            st.setString(4, d1.getGuarantee());
            st.setString(5, d1.getCategory());
            st.setString(6, d1.getNote());
            st.setBoolean(7, d1.isReservationStatus());
            st.setInt(8, d1.getInventoryNumber());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Method to delete a device depending on the inventoryNumber
     * @param inventoryNumber the id of an object from class Device
     */

    public void delete(int inventoryNumber) {
        String sql = "delete from device where inventory_number=?";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, inventoryNumber);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



