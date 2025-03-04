package test;

public class Test {
	package test;

	import java.util.HashMap;
	import java.util.Map;

	import jakarta.ws.rs.Consumes;
	import jakarta.ws.rs.GET;
	import jakarta.ws.rs.PUT;
	import jakarta.ws.rs.Path;
	import jakarta.ws.rs.Produces;
	import jakarta.ws.rs.core.MediaType;

	@Path("/l")

	public class UserController {
	   static Map<String,User> users = new HashMap<>();
	   
	   @PUT 
	   @Path("/p")
	   @Consumes(MediaType.APPLICATION_JSON)
	   public void insert(User user) {
		   users.put(user.id,user);
		  
	   }
	   
	   @PUT 
	   @Path("/m")
	   @Consumes(MediaType.APPLICATION_JSON)
	   public void u(User user) {
		   users.replace(user.id, user);
	   }
	   
	   @GET
	   @Produces("application/json")
	   public Map<String,User> afficher() {
		   return users;
	   }
	   
	}
}
