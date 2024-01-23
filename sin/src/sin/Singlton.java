package sin;

public final class Singlton {
		Singlton(){
			
		}
		public static Singlton s=new Singlton();
		public static Singlton getInstance() {
			return s;
		}

}
