package library.members;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
    private List<Member> members;

    public MemberList() {
        this.members = new ArrayList<>();
    }
    public void addMember(Member member) {
        members.add(member);
    }
    public void removeMember(Member member) {
        members.remove(member);
    }
    public Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }
    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
