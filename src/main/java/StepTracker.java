import java.util.ArrayList;
public class StepTracker 
{
private int totalSteps;
private int minimum;
private int days;
private int activeDays;
public StepTracker(int num){
 minimum = num;
 days = 0;
 activeDays = 0;
 totalSteps = 0;
 }
 public void addDailySteps(int num){
  totalSteps += num;
  if(num >= minimum){
   activeDays += 1;
  }
  days += 1;
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  return (double)totalSteps/days;
 }
} 
