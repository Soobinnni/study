
public interface RemoteControllable extends Controllable {
	void remoteOn();
	void remoteOff();
	
	//RemoteControllable 인터페이스는 remoteOn()메서드, remoteOff()메서드 외에
	//부모 인터페이스인 Controllable의 turnOn()메서드, turnOff()메서드도 사용할 수 있다.
}
