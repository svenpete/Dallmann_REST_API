/**
 * ReservationRessource
 * <p>
 * Version 1.0
 * <p>
 * 14.08.2020
 */

package REST_API.Ressources;

import JDBC.JDBC;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import REST_API.DatabaseClasses.Device;

public class ReservationRessource {
    JDBC repo = new JDBC();

    @PUT
    @Path("updateReservationStatus")
    @Produces(MediaType.APPLICATION_JSON)

    public Device updateReservationStatus(Device d) {
        repo.updateReservationStatus(d);
        return d;
    }
}
