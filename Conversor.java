public class Conversor{

	public static void ola(String nome){
		System.out.println("Bom dia " + nome);

	}	

	public static void Km_Milha(float km){
		float milha=km*0.62137;
		System.out.println(km + "km em milhas: " + milha);

	}

	public static void main(String[] args){
		System.out.println("Ola mundo!!");
		ola("Ricardo");

	}

}
