package com.scott.transer.operation;

import com.scott.transer.task.ITask;

import java.util.List;

/**
 * <p>Author:    shijiale</p>
 * <p>Date:      2017-12-13 17:06</p>
 * <p>Email:     shilec@126.com</p>
 * <p>Describe:</p>
 */

public interface ITaskOperationCallback {

    void onFinished(List<ITask> tasks);

    void onFinished(ITask task);

    void onFinished();
}