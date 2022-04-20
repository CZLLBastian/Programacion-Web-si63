package pe.edu.upc.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import pe.edu.upc.entities.Distrito;
import pe.edu.upc.intfaces.IDistritoDao;

public class DistritoImpl implements IDistritoDao {

	private Connection oCn;

//	public DistritoImpl() {
//		oCn = Conexion.openConnection();
//	}

	@Override
	public void insert(Distrito d) {
		try {
			String sql = "insert into distrito(nomDistrito) values(?)";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ps.setString(1, d.getNomDistrito());
			ps.executeUpdate();
			ps.close();

		} catch (Exception e) {
			System.out.println("Error al insertar persona en el DAO");
		}

	}

	@Override
	public List<Distrito> list() {
		List<Distrito> listaDistritos = new ArrayList<Distrito>();
		try {
			String sql = "select * from distrito";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);

			while (rs.next()) {
				Distrito dist = new Distrito();
				dist.setIdDistrito(rs.getInt("idDistrito"));
				dist.setNomDistrito(rs.getString("nomDistrito"));
				listaDistritos.add(dist);
			}
		} catch (Exception e) {
			System.out.println("Error al listar persona en DAO");
		}
		return listaDistritos;
	}

}
