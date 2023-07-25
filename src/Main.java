import main.League.Team;
import main.TeamPackage.Boss;
import main.TeamPackage.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Team a = new Team();
        Team b = new Team();

        a.name = "laker";
        b.name = "wolf";

        Boss boss1 = new Boss();
        a.boss = boss1;

        //首先创建两个member,
        //然后创建一个空的List
        //最后把两个Member加入List
        Member member1 = new Member();
        Member member2 = new Member();
        List<Member> teamMember = new ArrayList<>();
        teamMember.add(member2);
        teamMember.add(member1);

        a.teamMember = teamMember;

        a.location = "LA";
        a.logo = "lakerLogo";

        a.value = 1000000;

        System.out.println(a);







    }
}