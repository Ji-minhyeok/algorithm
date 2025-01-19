import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int age = Integer.parseInt(input[0]); // 나이
            String name = input[1]; // 이름
            members.add(new Member(age, name));
        }
        
        members.sort(Comparator.comparingInt(Member::getAge));
        
        for (Member member : members) {
            System.out.println(member.getAge() + " " + member.getName());
        }

        scanner.close();
    }
}

class Member {
    private int age;
    private String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
