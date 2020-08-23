/**
 * HistoryRessource
 * <p>
 * Version 1.0
 * <p>
 * 10.05.2020
 */

package REST_API.Ressources;

import JDBC.JDBC;
import REST_API.DatabaseClasses.History;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

public class HistoryRessource {
    JDBC repo = new JDBC();

    @GET
    @Path("history/{inventoryNumber}")
    @Produces(MediaType.APPLICATION_JSON)

    public List<History> getHistory (@PathParam("inventoryNumber") int inventoryNumber) {

        return repo.getHistory();
    }









}
