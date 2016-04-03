import java.util.ArrayList;

public class Doctor {
	boolean performsSurgery = false;
	boolean makesHouseCalls = false;
	boolean evil = false;
	Hospital hospital;
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public Doctor() {

	}

	public Doctor(String string) {
		if (string.equals("666")) {
			evil = true;
		}
	}

	public Doctor(String string, Hospital hospital) {
		if (string.equals("666")) {
			evil = true;
		}
		this.hospital = hospital;
	}

	public Object performsSurgery() {
		return performsSurgery;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() >= 3) {
			throw new DoctorFullException();
		} else {
			patients.add(patient);
		}
	}

	public Object makesHouseCalls() {
		return makesHouseCalls;
	}

	public ArrayList<Patient> getPatients() {
		ArrayList<Patient> patient = patients;
		return patient;
	}

	public void doMedicine() {
		for (Patient patient : patients) {
			patient.caredFor = true;
		}
		if (evil) {
			for (Patient patient : patients) {
				patient.living = false;
			}
		}
	}

	public Object isEvil() {
		return evil;
	}

	public void joinTheDarkSide() {
		evil = true;
	}

	public Object getHospital() {
		return hospital;
	}

}
