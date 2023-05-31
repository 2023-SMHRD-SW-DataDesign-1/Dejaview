package hong;

import java.util.ArrayList;

import Model.GameDTO;

public class ranking_DAO {

	public ArrayList<GameDTO> rankingLIst(GameDTO dto) {
		
		getCon();
		ArrayList<GameDTO> rankingLIst =new ArrayList<GameDTO>();
		
		try {
			String sql = "select * from Member orderby score ";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				int gold = rs.getInt(2);
				
				GameDTO dto = new GameDTO(id, score);
				rankingLIst.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			getClose();
		}
	
		
		
		
		return rankingLIst;
		
	}
}
