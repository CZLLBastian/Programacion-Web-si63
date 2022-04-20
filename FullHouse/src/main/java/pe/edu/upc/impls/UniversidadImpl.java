package pe.edu.upc.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import pe.edu.upc.entities.Universidad;
import pe.edu.upc.intfaces.IUniversidadDAO;

public class UniversidadImpl implements IUniversidadDAO {

	private Connection oCn;

//	public UniversidadImpl() {
//		oCn = Conexion.openConnection();
//	}

	public void insert(Universidad u) {

		try {

			String sql = "insert into universidad(fullNameUniversidad, adressUniversidad) values(?,?)";
			
			PreparedStatement ps = oCn.prepareStatement(sql);
			
			ps.setString(1, u.getFullNameUniversidad());
			ps.setString(2, u.getAdressUniversidad());
			ps.executeUpdate();
			ps.close();
			
		} catch (Exception e) {
			
			System.out.println("Error al insertar Universidad en el DAO");
			
		}

	}

	public List<Universidad> list() {
		List<Universidad> listaUniversidades =new ArrayList<Universidad>();
		try {
			String sql ="select * from universidad";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(sql);
			while(rs.next()){
				Universidad univ=new Universidad();
				univ.setIdUniversidad(rs.getInt("idUniversidad"));
				univ.setFullNameUniversidad(rs.getString("fullNameUniversidad"));
				univ.setAdressUniversidad(rs.getString("adressUniversidad"));
				listaUniversidades.add(univ);
			}
			
		} catch (Exception e) {
			System.out.println("Error al listar Universidad en DAO");
		}
		
		return listaUniversidades;
	}

}
