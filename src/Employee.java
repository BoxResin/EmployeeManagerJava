/**
 * 사원 정보 클래스
 */
public class Employee
{
    public int number;
    public int age;
    public int salary;

    public Employee(int number, int age, int salary)
    {
        this.number = number;
        this.age = age;
        this.salary = salary
    }

    public void PrintEmployee()
    {
        System.out.println("사원번호 : " + this.number);
        System.out.println("나이 : " + this.age);
        System.out.println("봉급 : " + this.salary);
        System.out.println();
    }
}