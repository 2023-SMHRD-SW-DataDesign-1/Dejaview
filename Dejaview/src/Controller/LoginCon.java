package Controller;

import Model.GameDTO;
import Model.GameDAO;

public class LoginCon {
	
	public String login(GameDTO GameDTO) {
	System.out.println("id : " + GameDTO.getId());
	System.out.println("pw : " + GameDTO.getPw());
	
	// DB에 접속해서 값 추가하기
	GameDAO dao = new GameDAO();
	String name = dao.login(GameDTO);
	
	return name;
	}
}
