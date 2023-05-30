import java.util.ArrayList;

public class GoblinDAO {

	private ArrayList<GoblinDTO> gList = new ArrayList<>();

	public void getGoblinData() {

		gList.add(new GoblinDTO("고블린", 10, 1, 100));
		gList.add(new GoblinDTO("황금고블린", 10, 1, 200));

	}

	public ArrayList<GoblinDTO> getGoblinList() {

		getGoblinData();
		return gList;

	}

}
