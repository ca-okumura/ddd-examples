package com.littlehands.aggregate_sample.bad_example.domain.student;

import lombok.Getter;

@Getter
public class Student {
  private StudentId studentId;
  private String studentName;

  public Student(String studentName) {
    this.studentId = new StudentId();
    this.studentName = studentName;
  }
}
