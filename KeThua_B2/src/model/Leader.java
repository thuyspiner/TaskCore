package model;

import java.util.Scanner;

public class Leader extends Employee {
    private int teamSize;
    private static final double base_salary = 10000000;

    public Leader() {
    }

    public Leader(int id, String name, int age, int teamSize) {
        super(id, name, age);
        this.teamSize = teamSize;
    }

    public void bonus() {
        double bonusMoney = (teamSize > 10) ? 0.5 : 0.1;
        double totalBonus = base_salary * bonusMoney;
        System.out.println("Tổng tiền thưởng: " + totalBonus);
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng đội làm việc: ");
        teamSize = scanner.nextInt();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Đội làm việc: " + teamSize);
        bonus();
    }
}

