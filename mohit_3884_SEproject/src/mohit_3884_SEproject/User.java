/**
 * 
 */
package mohit_3884_SEproject;

/**
 * @author win
 *
 */
public abstract class User implements PremiumPlan {
	
	int userId;
	
	public abstract void viewDietPlan();
	public abstract void viewSchedule();
	public abstract void viewDietConstituents();
	public abstract void editPremiumPlan();

}
