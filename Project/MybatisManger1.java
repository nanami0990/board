public class MybatisManger1 {
    
	//SqlSessionFactory 객체는 데이터베이스와의 연결과 SQL의 실행에 대한 모든 것을 가진 가장 중요한 객체
//	인터페이스는 SqlSession. 인터페이스를 통해 명령어를 실행하고 매퍼를 얻으며 트랜잭션을 관리 할 수 있다.
//  SqlSession의 인스턴스를 만드는 방법을 배워보자. 
//	SqlSession은 SqlSessionFactory 인스턴스를 사용해서 만든다. 
//	SqlSessionFactory는 몇가지 방법으로 SqlSession인스턴스를 생성하기 위한 메소드를 포함하고 있다. 
	
private static SqlSessionFactory instance;

	
	
private MybatisManger() {
    
}

public static SqlSessionFactory getInstance() {
        Reader reader = null;
        
        try {
            String resource = "mybatisboard/com/config/config.xml";
            reader = Resources.getResourceAsReader(resource);
            instance = new SqlSessionFactoryBuilder().build(reader);

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("에러남");
        
        }finally {
            try {
                if (reader !=null) {
                    reader.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("에러남");
                
            }
        }
        
        
        
        
        return instance;
        
}









}

