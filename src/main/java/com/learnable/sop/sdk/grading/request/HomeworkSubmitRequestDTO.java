package com.learnable.sop.sdk.grading.request;

import java.util.List;

public class HomeworkSubmitRequestDTO {
    private Integer taskId;
    private List<String> imageList;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }
}
