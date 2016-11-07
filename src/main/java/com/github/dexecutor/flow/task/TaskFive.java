package com.github.dexecutor.flow.task;

import com.github.dexecutor.core.task.ExecutionResult;
import com.github.dexecutor.core.task.ExecutionResults;
import com.github.dexecutor.core.task.Task;

public class TaskFive extends Task<String, Boolean> {

	private static final long serialVersionUID = 1L;
	
	public static final String NAME = "TaskFive";

	public TaskFive() {
		setId(NAME);
	}

	@Override
	public Boolean execute() {
		boolean result = true;
		System.out.println("Executing " + getId() + " , result : " + result);
		return result;
	}

	@Override
	public boolean shouldExecute(ExecutionResults<String, Boolean> parentResults) {
		ExecutionResult<String, Boolean> first = parentResults.getFirst();
		return Boolean.FALSE.equals(first.getResult());
	}
}
