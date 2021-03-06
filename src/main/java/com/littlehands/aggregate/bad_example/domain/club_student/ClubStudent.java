package com.littlehands.aggregate.bad_example.domain.club_student;

import com.littlehands.aggregate.bad_example.domain.club.ClubId;
import com.littlehands.aggregate.bad_example.domain.student.StudentId;
import lombok.Getter;

/**
 * ClubとStudentの紐付けを表すクラス
 */
@Getter
public class ClubStudent {

  private final ClubId clubId;
  private final StudentId studentId;

  public ClubStudent(ClubId clubId, StudentId studentId) {
    this.clubId = clubId;
    this.studentId = studentId;
  }
}
