package interface_com;

public class devlop implements Banking_client,Investment{
	
	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("all loans");
		
	}

	@Override
	public void mortageLoan() {
		// TODO Auto-generated method stub
		System.out.println("we have to give any properties");
		
	}

	@Override
	public void EducationLoan() {
		// TODO Auto-generated method stub
		System.out.println("we should submit certificates");
	}

	@Override
	public void GoldLoan() {
		// TODO Auto-generated method stub
		System.out.println("we should give gold");
		
	}
	public void agricultareLoan()
	{
		
	}
	@Override
	public void landinvestment() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args)
	{
		devlop d=new devlop();
		d.EducationLoan();
		d.GoldLoan();
		d.mortageLoan();
		d.loan();
		d.agricultareLoan();
		
		Banking_client  b=new devlop();
		b.GoldLoan();
		b.loan();
		b.EducationLoan();
		b.mortageLoan();
		Investment i=new devlop();
		i.landinvestment();
		
	}

	


	

    
	
}
