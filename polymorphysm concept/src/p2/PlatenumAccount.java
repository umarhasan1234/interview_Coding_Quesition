package p2;

public class PlatenumAccount extends GoldAccount {
	@Override
     public void chequeBooks() {
    	 System.out.println("Unlimited issue ");
     }
	@Override
     public void rateOfInterest() {
		System.out.println("6% per year");
    	 
     }
	
	public static void main(String[] args) {
		GoldAccount g=new GoldAccount();
		g.onlineBanking();
		g.chequeBooks();
		g.rateOfInterest();
		
		PlatenumAccount p=new PlatenumAccount();
		p.onlineBanking();
		p.chequeBooks();
		p.rateOfInterest();
	}
}
