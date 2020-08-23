package REST_API.Ressources;

/**
 * DeviceRessource
 * <p>
 * Version 1.0
 * <p>
 * 10.05.2020
 */
/*
package REST_API.Ressources;

import JDBC.JDBC;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import REST_API.DatabaseClasses.Device;
import java.util.List;

/**
 * Methods to handle requests from a client
 * @Path creating an URI for the DeviceRessource and the specific request
 */

public class DeviceRessource {
    JDBC repo = new JDBC();

    /**
     * Method to request all devices and sending them to the client
     *
     * @return is returning the arrayList from Device.getDevices to the client
     */

    @GET
    @Path("allDevices")
    @Produces(MediaType.APPLICATION_JSON)

    public List<Device> getAllDevices() {
        return repo.getAllDevices();

    }

    /**
     * Method to request a specific device depending on the inventoryNumber
     *
     * @param inventory_number id of the requested device
     * @return is returning the requested object to the client
     */

    @GET
    @Path("device/{inventory_number}")
    @Produces(MediaType.APPLICATION_JSON)

    public Device getDeviceByInventoryNumber
    (@PathParam("inventory_number") int inventory_number) {
        return repo.getDevice(inventory_number);
    }

    /**
     * Method to request a specific device depending on the designation
     *
     * @param designation name of the requested device
     * @return is returning the requested object to the client
     */

    @GET
    @Path("device/{designation}")
    @Produces(MediaType.APPLICATION_JSON)

    public List<Device> getDevicesByDesignation(@PathParam("designation") String designation) {

        return repo.getDevices(designation);
    }

    /**
     * Method to create a new device in database
     *
     * @return
     */

    @POST
    @Path("newDevice")
    @Consumes(MediaType.APPLICATION_JSON)

    public String createNewDevice(Device d) {
        repo.createDevice(d);
        return "New ressource:http://localhost:8080/REST_API_war/\" +\n" +
                "                \"restapi/devices/device/\" + d1.getInventoryNumber()";
    }

    /**
     * Method to manipulate a specific device depending on the inventory_number
     */

    @PUT
    @Path("updateDevice")
    @Consumes(MediaType.APPLICATION_JSON)

    public Device updateDevice(Device d) {
        repo.updateDevice(d);
        return d;
    }

    /**
     * Method to delete a specific device depending on the inventory_number
     *
     * @param inventory_number the id of an object from class Device
     */

    @DELETE
    @Path("deleteDevice/{inventory_number}")
    @Consumes(MediaType.APPLICATION_JSON)

    public Device deleteDevice(@PathParam("inventory_number") int inventory_number) {
        Device d = repo.getDevice(inventory_number);
        if (d.getInventoryNumber() != 0)
            repo.deleteDevice(inventory_number);
        return d;
    }
}



































