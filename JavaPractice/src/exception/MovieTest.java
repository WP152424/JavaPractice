package exception;

public class MovieTest {

	public static void main(String[] args) {
		Movie[] movies = {
				new Movie("���ϸ���:Ŀ����Ʈ",15),
				new Movie("������� ���� ������",12)
		};
		int age=13;
		try{
			for(Movie movie : movies) {
				movie.buyTicket(age);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
		}
	}

}
