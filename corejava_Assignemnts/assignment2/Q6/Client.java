public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            FilePersistance fp=new FilePersistance();
            DatabasePersistance dp=new DatabasePersistance();
            fp.persist();
            dp.persist();
            
	}

}