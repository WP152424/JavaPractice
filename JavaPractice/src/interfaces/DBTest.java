package interfaces;

public class DBTest {

	public static void main(String[] args) {

		System.out.println("<< 변경 전 >>");

		IDBManager a1 = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);

		crud(a1);

		System.out.println("<< 변경 후 >>");

		IDBManager a2 = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);

		crud(a2);
	}
	private static void crud(IDBManager db){

		db.insert();

		db.search();

		db.update();

		db.delete();

		System.out.println();

	}
}
