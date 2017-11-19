package ohtu;

public class Submission {
    private int week;
    private int[] exercises;
    private int hours;

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeek() {
        return week;
    }

    public int getHours() {
	return hours;
    }

    public void setHours(int newHours) {
	hours = newHours;
    }

    public int[] getExercises() {
	return exercises;
    }

    public void setExercises(int[] newEx) {
	exercises = newEx;
    }

    @Override
    public String toString() {
        String ret = "week " + week + ": exercises ";
	for (int i : exercises) {
	    ret += i + ", ";
	}
	ret += "total " + exercises.length + ", done in " + hours + " hours.";
	return ret;
    }
    
}
