package com.scott.annotionprocessor;

/**
 * <p>Author:    shijiale</p>
 * <p>Date:      2017-12-13 12:52</p>
 * <p>Email:     shilec@126.com</p>
 * <p>Describe:</p>
 */

public interface ITask {

    String getSourceUrl();

    String getSourcePath();

    String getDestUrl();

    String getDestPath();

    String getSesstionId();

    long getLength();

    long getStartOffset();

    long getEndOffset();

    String getTaskId();

    String getGroupId();

    String getGroupName();

    long getCompleteTime();

    long getCompleteLength();

    int getState();

    TaskType getType();

    String getUserId();

    String getName();

    long getSpeed();
}
