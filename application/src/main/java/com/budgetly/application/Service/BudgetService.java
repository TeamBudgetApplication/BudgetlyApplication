package com.budgetly.application.Service;

import java.util.List;

import com.budgetly.application.entities.Budget;

public interface BudgetService {
	
	public List<Budget> retrieveUserBudgets(int customerId);
	
	public Budget retrieveUserBudgetById(int budgetId);
	
	public Budget deleteBudget(int budgetId);
	
	public Budget saveBudget(Budget budget);
	

}
