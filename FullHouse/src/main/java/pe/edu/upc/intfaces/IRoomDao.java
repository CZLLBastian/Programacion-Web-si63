package pe.edu.upc.intfaces;

import java.util.List;

import pe.edu.upc.entities.Room;


public interface IRoomDao {

	public void insert (Room r);
	
	public List<Room> list();
	
	public void delete (int idRoom);
	
}
