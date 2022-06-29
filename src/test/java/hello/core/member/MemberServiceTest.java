package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join() {
        // given 주어지는 것
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when 어떨때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then 어떻게
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
