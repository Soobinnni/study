
public class AlarmClock {
	private Time currentTime; //Time객체의 이름이자 참조변수 : currentTime
	private Time alarmTime; //Time객체의 이름이자 참조변수 : alartmTime
	public AlarmClock() {
		super();
	}
	public AlarmClock(Time currentTime, Time alarmTime) {
		this.currentTime = currentTime;
		this.alarmTime = alarmTime;
	}
	public Time getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(Time currentTime) {
		this.currentTime = currentTime;
	}
	public Time getAlarmTime() {
		return alarmTime;
	}
	public void setAlarmTime(Time alarmTime) {
		this.alarmTime = alarmTime;
	}
	@Override
	public String toString() {
		return "AlarmClock [getCurrentTime()=" + getCurrentTime() + ", getAlarmTime()=" + getAlarmTime() + "]";
	}
	
}
