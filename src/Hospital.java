import java.util.ArrayList;
import java.util.Date;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private ArrayList<Zombie> zombies = new ArrayList<Zombie>();

	public Hospital() {
		//
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		ArrayList<Doctor> doctor = (ArrayList<Doctor>) doctors.clone();
		return doctor;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		int docI = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(docI).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				docI++;
				i--;
			}
		}
	}

	public void add(Object object) {
		if (object instanceof Doctor) {
			Doctor x = (Doctor) object;
			doctors.add(x);
		} else if (object instanceof Patient) {
			Patient y = (Patient) object;
			patients.add(y);
		}
	}

	public void makeDoctorsWork() {
		for (Doctor doctor : doctors) {
			doctor.doMedicine();
		}
		for (Patient patient : patients) {
			System.out.println(patient.living);
		}
		int x = 1;
		for (int i = 0; i < patients.size(); i++) {
			Patient p = patients.get(i);
			if (!p.living) {
				zombies.add(new Zombie(new Date().toString()));
				patients.remove(p);
				x++;
			}
		}
		System.out.println(x);
		System.out.println("////");
		for (Patient patient : patients) {
			System.out.println(patient.living);
		}
		for (Zombie zombie : zombies) {
			System.out.println(zombie);
		}
	}

	public ArrayList<Zombie> getZombies() {
		return zombies;
	}

}