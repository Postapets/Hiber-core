package ru.sfedu.crm.lab3.model.JoinedTable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Class Worker
 */

@Entity(name = "JT_Worker")
@Table(schema = "lab3", name ="JT_Worker" )
@PrimaryKeyJoinColumn(name = "user_id")
public class Worker extends User{
    private String position;
    private long employmentDate;
    private long leaveDate;

    public Worker() {}

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(long employmentDate) {
        this.employmentDate = employmentDate;
    }

    public long getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(long leaveDate) {
        this.leaveDate = leaveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return employmentDate == worker.employmentDate && leaveDate == worker.leaveDate && Objects.equals(position, worker.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position, employmentDate, leaveDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                "position='" + position + '\'' +
                ", employmentDate=" + employmentDate +
                ", leaveDate=" + leaveDate +
                '}';
    }
}