package com.spring.calculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "numbers")
public class Number {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Min(value=0, message = "Skaičius negali būti neigiamas.")
    @Column(name = "num1")
    private int num1;
    @Min(value=0, message = "Skaičius negali būti neigiamas.")
    @Column(name = "num2")
    private int num2;
    @Column(name = "operation")
    private String operation;
    @Column(name = "result")
    private double result;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    public Number(int id, int num1, int num2, String operation, double result) {
        this.id = id;
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = result;
    }

    public Number(int num1, int num2, String operation, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = result;
    }
    public Number() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Number{" +
                "id=" + id +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", operation='" + operation + '\'' +
                ", result=" + result +
                '}';
    }
}
