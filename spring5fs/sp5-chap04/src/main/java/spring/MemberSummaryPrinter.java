package spring;

public class MemberSummaryPrinter extends MemberPrinter {
	
	@Override
	public void print(Member member) {
		System.out.printf("회원 정보: 이메일=%s, 이름=%s, \n", member.getId(), member.getEmail(),
				member.getName(), member.getRegisterDateTime());
	}
}
