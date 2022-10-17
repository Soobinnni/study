
public class ArgPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] age= new int[10];
		age[0]=1;
		age[1]=10;
		age[2]=20;
		age[3]=30;
		age[4]=40;
		age[5]=50;
		age[6]=60;
		age[7]=70;
		age[8]=80;
		age[9]=90;
		System.out.println(age);
		
		int[] newAge;
		newAge=age;
		System.out.println(newAge);
		
		System.out.println("newAg[0]=24;으로 바꾸기 전 : "+newAge[0]);
		
		newAge[0]=24;
		System.out.println("바꾼 후 age[0] : "+age[0]);
		System.out.println("바꾼 후 newAge[0] : "+newAge[0]);
		
	}

}
