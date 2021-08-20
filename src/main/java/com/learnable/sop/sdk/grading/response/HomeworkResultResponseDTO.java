package com.learnable.sop.sdk.grading.response;

import java.util.List;

public class HomeworkResultResponseDTO {
    /**
     * 批改状态：1：未开始批阅2：批阅中3：批阅完成
     */
    private Integer taskStatus;
    private List<StudentStatusResponseDTO> studentStatusList;

    public List<StudentStatusResponseDTO> getStudentStatusList() {
        return studentStatusList;
    }

    public void setStudentStatusList(List<StudentStatusResponseDTO> studentStatusList) {
        this.studentStatusList = studentStatusList;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

}
