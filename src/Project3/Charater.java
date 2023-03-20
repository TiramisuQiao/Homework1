package Project3;
import java.util.Random;
public class Charater implements ChacaterInterface {
	//claim the name,height and weight of one character
	private String name; 
	private float height;
	private float weight;
	private float health;
	private float morality;
	public float percentage;
	public void buildNewcharacter(String name,float height,float weight) {
		//initialize the name,height and weight of one character
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.health=(float)1.00;
		this.morality=(float)0.00;
	}
	public void heal(float percentage) {
		this.percentage=percentage;
		//heal the character
		if(percentage >= 0.00 && percentage <= 1.00) {
			float tempHealth=health*(1+percentage);
			if(tempHealth>1.00) {
				health=1.00f;//to defend the health is over 1.00
				
			}else {
				health=tempHealth;
			}
		}else {
			System.out.println("Please input again,the input should between 0.00 and 1.00");//to defend the input is not between 0.00 and 1.00
		}
	}
	public void injure(float percentage) {
		this.percentage=percentage;
		//injure the character
		if(percentage >= 0.00 && percentage <= 1.00) {
			float tempHealth=health*(1-percentage);
			if(tempHealth<0.00) {
				health=0.00f;//to defend the health is less than 0.00
			}else {
				health=tempHealth;
			}
		}else {
			System.out.println("Please input again,the input should between 0.00 and 1.00");//to defend the input is not between 0.00 and 1.00
		}
	}
	public void change(float percentage) {
		Random r = new Random();
		this.percentage=percentage;
		//random the percentage;
		float randomPer = r.nextFloat(); // 生成[0,1.0]区间的小数
		if(percentage >= 0.00) {
			morality=0.2f;
		}else {
			morality=-0.2f;
		}
		float tempMorality = morality*(1+randomPer);
		if(tempMorality>= -1.00 && tempMorality <= 1.00) {
			morality=tempMorality;
		}else if(tempMorality<-1.00) {
			morality = -1.00f;//to defend the morality is less than -1.00
		}else{
			morality = 1.00f;//to defend the morality is over 1.00
		}
	}
	public String tochString() {
		String ans = new String();//to store the information of the character
		ans =" name:"+name+"\n height:"+height+"\n weight:"+weight;
		ans+="\n health:"+health+"\n morality:"+morality;
		return ans;//return the information of the character
	}
}
