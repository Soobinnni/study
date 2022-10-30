import com.controller.*;
import com.vo.*;

public class HospitalMain {

	public static void main(String[] args) {
		HospitalInfoController controller = new HospitalInfoController();

		// 저장된 list값을 유지하기 위해 변수로 주소값을 가지고 있음
		controller.inputData(); // 프로젝트에 저장된 병원정보 csv파일을 가져와 java클래스에 대입하는 메소드(기능)
		// 대입된 내용을 출력해주는 메소드(기능)
		controller.printHospitalData();

	}

}
