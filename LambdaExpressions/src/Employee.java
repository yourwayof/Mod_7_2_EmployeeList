import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Employee
{
    private String name;
    private Integer salary;
    private Date workStart;
    private LocalDate workStartLocalDateFormat;

    public Employee(String name, Integer salary, Date workStart)
    {
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        this.workStartLocalDateFormat = workStart.toInstant().atZone(zoneId).toLocalDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public LocalDate getCorrectDateWorkStart() {return workStartLocalDateFormat;}

    public void setWorkStartLocalDateFormat(LocalDate localDate){this.workStartLocalDateFormat = localDate;}

    public String toString()
    {
        return name + " - " + salary + " - " +
            (new SimpleDateFormat("dd.MM.yyyy")).format(workStart);
    }
}
