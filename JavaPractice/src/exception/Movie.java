package exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title,int limitAge) {
		this.title=title;
		this.limitAge=limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	public void buyTicket(int age) throws Exception {
		if(limitAge<=age)
			System.out.println(title+" 즐감하세요.");
		else
			throw new Exception(this.title+"은/는 "+this.limitAge+"세 이상 관람가입니다.");
	}
	
}
