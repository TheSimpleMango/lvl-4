import java.util.List;

public class Hospital {
	private List<Doctor> doctors;
	private List<Patient> patients;

	public Hospital() {
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		List<Doctor> doctor = doctors;
		return doctor;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		List<Patient> patient = patients;
		return patient;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub

	}

}

class Doctor {
	boolean performsSurgery = false;
	boolean makesHouseCalls = false;
	private List<Patient> patients;

	public Object performsSurgery() {
		return performsSurgery;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() == 3) {
			throw new DoctorFullException();
		} else {
			patients.add(patient);
		}
	}

	public Object makesHouseCalls() {
		return makesHouseCalls;
	}

	public List<Patient> getPatients() {
		List<Patient> patient = patients;
		return patient;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub

	}

}

class DoctorFullException extends Exception {

}

class GeneralPractitioner extends Doctor {
	@Override
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
}

class Surgeon extends Doctor {
	@Override
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}
}

class Patient {
	boolean caredFor = false;

	public Object feelsCaredFor() {
		return caredFor;
	}

	public void checkPulse() {
		caredFor = true;
	}

}
