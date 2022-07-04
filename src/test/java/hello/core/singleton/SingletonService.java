package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonService {
    //1. static 영역에 객체를 딱 한개만 생성.
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회가능
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private으로 선언하여 외부에서 new 키워드를 사용한 객체 생성 불가
    private SingletonService() {

    }

    public void login() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
