package interfaces;

public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	public static IDBManager getDBObject(String database){
		if(ORACLE_DATABASE.equalsIgnoreCase(database)) return new OracleDB();
		if(SYBASE_DATABASE.equalsIgnoreCase(database)) return new SybaseDB();
		else return null;

	}
}
