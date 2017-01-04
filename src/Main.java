import java.util.ArrayList;

import java.util.Scanner;

public class Main
{

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("[ 메뉴 ]");
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 삭제");
            System.out.println("3. 전체 사원 출력");
            System.out.println("4. 끝내기");
            System.out.println("번호 입력: ");

            int command = scanner.nextInt();

            switch (command)
            {
            case 1:
                {
                    int number, age, salary;
                    System.out.print("사원번호: ");
                    number = scanner.nextInt();
                    System.out.print("나이: ");
                    age = scanner.nextInt();
                    System.out.print("봉급: ");
                    salary = scanner.nextInt();

                    AddEmployee(new Employee(number, age, salary));
                }
                break;

            case 2:
                {
                    System.out.print("삭제할 사원번호: ");
                    int number = scanner.nextInt();

                    if (DeleteEmployee(number))
                        System.out.println("삭제 성공");
                    else
                        System.out.println("해당 번호의 사원이 없습니다.");
                }
                break;

            case 3:
                PrintAllEmployee();
                break;

            case 4:
                return;
            }
        }
    }

    /**
     * 사원 정보를 리스트에 추가하는 메서드
     * @param employee 추가할 사원 정보
     */
    private static void AddEmployee(Employee employee)
    {
        employees.add(employee);
    }

	/**
     * 리스트에서 사원 정보를 삭제하는 메서드
     * @param number 삭제할 리스트 상의 위치
     * @return 삭제에 성공하면 true, 실패하면 false
     */
    private static boolean DeleteEmployee(int number)
    {
        if(number < employees.size())
        {
            employees.remove(number);
            return true;
        }else
            return false;
    }

	/**
     * 모든 사원 정보를 출력하는 메서드
     */
    private static void PrintAllEmployee()
    {
        int sum_a = 0 , sum_s = 0;

        for(int i = 0; i < employees.size(); i++)
        {
            System.out.println("사원번호: " + employees.get(i).number);
            System.out.println("나이: " + employees.get(i).age);
            System.out.println("봉급: " + employees.get(i).salary);

            sum_a += employees.get(i).age;
            sum_s += employees.get(i).salary;
        }

        System.out.println("평균 나이: " + sum_a / employees.size());
        System.out.println("평균 봉급: " + sum_s / employees.size());
    }
}