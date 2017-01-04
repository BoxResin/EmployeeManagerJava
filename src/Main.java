import java.util.ArrayList;

public class Main
{

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        System.out.println("Hello World");
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
        int i;
        int size = employees.size();

        for(i = 0; i < size; i++)
        {
            if(employees.get(i).number == number)
            {
                employees.remove(i);
                break;
            }
        }

        if(i == size)
            return false;
        else
            return true;
    }

	/**
     * 모든 사원 정보를 출력하는 메서드
     */
    private static void PrintAllEmployee()
    {
        int sum_a = 0 , sum_s = 0;

        if(employees.size()>0)
        {

            for (int i = 0; i < employees.size(); i++)
            {
                System.out.println("\n사원번호: " + employees.get(i).number);
                System.out.println("나이: " + employees.get(i).age);
                System.out.println("봉급: " + employees.get(i).salary + "");


                sum_a += employees.get(i).age;
                sum_s += employees.get(i).salary;
            }

            System.out.println("\n평균 나이: " + sum_a / employees.size());
            System.out.println("평균 봉급: " + sum_s / employees.size());
        }else
            System.out.println("등록된 사원이 없습니다.");
    }
}