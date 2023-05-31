package Controller;

import Model.GameDAO;
import Model.GameDTO;

public class JoinCon {
 
	public String join(GameDTO dto) {
		GameDAO dao = new GameDAO();
		int cnt = dao.insertMember(dto);
		
		String result;
		if (cnt > 0) {
			result = "성공";
		} else {
			result = "실패";
		}
		return result;
		
	}
	
}
