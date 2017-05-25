package interfaces;

public class OracleDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Oracle DB저장");
	}

	@Override
	public void search() {
		System.out.println("Oracle DB조회");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB변경");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB삭제");
		
	}

}
