package interfaces;

public class SybaseDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Sybase DB저장");
		
	}

	@Override
	public void search() {
		System.out.println("Sybase DB조회");
		
	}

	@Override
	public void update() {
		System.out.println("Sybase DB변경");
		
	}

	@Override
	public void delete() {
		System.out.println("Sybase DB삭제");
		
	}

}
