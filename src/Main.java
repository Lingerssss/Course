import main.League.Team;
import main.TeamPackage.Boss;
import main.TeamPackage.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //新建一个球队List来存储所有球队的信息
        List<Team> teamList = new ArrayList<>();

        //新建了一个球队Team a;
        Team a = new Team();
        Team b = new Team();


        a.name = "laker";
        b.name = "wolf";

        Boss boss1 = new Boss();
        boss1.name = "YaoMing";
        a.boss = boss1;

        //首先创建两个member,
        //然后创建一个空的List
        //最后把两个Member加入List
        Member member1 = new Member();
        member1.name = "Curry";
        Member member2 = new Member();
        member2.name = "James";
        List<Member> teamMember = new ArrayList<>();
        teamMember.add(member2);
        teamMember.add(member1);

        a.teamMember = teamMember;

        a.location = "LA";
        a.logo = "lakerLogo";

        a.value = 1000000;
        b.teamMember = new ArrayList<>();
        b.boss = new Boss();

        //将a加入teamList
        teamList.add(a);
        teamList.add(b);


        //打印所有球队信息
        System.out.println("TeamSize = " + teamList.size());

        for (int i = 0; i < teamList.size(); i++) {
            var team = teamList.get(i);
            Print(team);
        }
    }

    private static void Print(Team team) {
        System.out.println("Team's name is " + team.name);
        System.out.println("TeamMember contains: ");
        for( Member member: team.teamMember){
            System.out.println(member.name);
        }

        System.out.println("Team's logo is "+ team.logo);
        System.out.println("Team's value is " + team.value);
        System.out.println("Team's location is " + team.location);
        System.out.println("Team's boss is " + team.boss.name);
        System.out.println("\n");
    }


//        Team b = new Team();
//
//        a.name = "laker";
//        b.name = "wolf";
//
//        Boss boss1 = new Boss();
//        a.boss = boss1;
//
//        //首先创建两个member,
//        //然后创建一个空的List
//        //最后把两个Member加入List
//        Member member1 = new Member();
//        Member member2 = new Member();
//        List<Member> teamMember = new ArrayList<>();
//        teamMember.add(member2);
//        teamMember.add(member1);
//
//        a.teamMember = teamMember;
//
//        a.location = "LA";
//        a.logo = "lakerLogo";
//
//        a.value = 1000000;
//
//        System.out.println();


}