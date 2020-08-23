/**
 * WorkerRessource
 * <p>
 * Version 1.0
 * <p>
 * 19.08.2020
 */


package REST_API.Ressources;


import REST_API.DatabaseClasses.Worker;
import REST_API.JDBC2.JDBC;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

public class WorkerRessource {
    JDNC repo = new JDBC();

    @POST
    @Path("newWorker")
    @Produces(MediaType.APPLICATION_JSON)

    public String createNewWorker(Worker w) {
        repo.createWorker(w);
        return "New ressource:http://localhost:8080/REST_API_war/\" +\n" +
                "                \"restapi/newWorker/\" + w.getWorkerNumber";
    }

    @PUT
    @Path("updateWorker")
    @Produces(MediaType.APPLICATION_JSON)

    public Worker updateWorker(Worker w) {
        repo.updateWorker(w);
        return w;
    }

    @DELETE
    @Path("deleteWorker")
    @Produces(MediaType.APPLICATION_JSON)

    public Worker deleteWorker(@PathParam("worker_id") int worker_id) {
        Worker w = repo.getWorker(worker_id);
        if (w.getWorkerNumber() != 0)
            repo.deleteWorker(worker_id);
        return w;
    }


}

