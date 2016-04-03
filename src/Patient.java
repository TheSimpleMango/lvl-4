public class Patient {
	boolean caredFor = false;
	boolean living = true;

	public boolean feelsCaredFor() {
		return caredFor;
	}

	public void checkPulse() {
		caredFor = true;
	}

	public Object isAlive() {
		return living;
	}

	public void kill() {
		living = false;
	}

}