import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    private int id;
    private String name;
    private String speciality;
    private ArrayList<Appointment> appointments;

    public Doctor(String name, int id, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.appointments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void getAppointments() {
        System.out.println(appointments);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Your appointment has been booked.\n");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}

class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private ArrayList<Appointment> appointments;

    public Patient(int id, String name, int age, String gender, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.appointments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public String toString() {
        return String.format("Patient{id=%d, name='%s', age=%d, gender='%s', address='%s', phone='%s'}", id, name, age,
                gender, address, phone);
    }
}

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String time;

    public Appointment(Doctor doctor, Patient patient, String date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

class Hospital {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient);
    }

    public void displayDoctors() {
        System.out.println("\nList of Doctors: ");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void displayPatients() {
        System.out.println("\nList of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }
}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        System.out.println("\n");
        System.out.println("Welcome to the Hospital Management System!");

        do {
            System.out.println("Please select an option: ");
            System.out.println("1. Add a doctor");
            System.out.println("2. Add a patient");
            System.out.println("3. Search for a doctor");
            System.out.println("4. Search for a patient");
            System.out.println("5. Available Doctors");
            System.out.println("6. Registered Patients");
            System.out.println("7. Book an appointment");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the doctor's name:");
                    String doctorName = scanner.nextLine();
                    System.out.println("Please enter the doctor's ID:");
                    int doctorID = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline character
                    System.out.println("Please enter the doctor's specialization:");
                    String doctorSpecialization = scanner.nextLine();
                    Doctor newDoctor = new Doctor(doctorName, doctorID, doctorSpecialization);
                    hospital.addDoctor(newDoctor);
                    System.out.println("Doctor added successfully!\n");
                    break;
                case 2:
                    System.out.println("Please enter the patient's name:");
                    String patientName = scanner.nextLine();
                    System.out.println("Please enter the patient's id:");
                    int patientId = scanner.nextInt();
                    System.out.println("Please enter the patient's Age:");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the patient's Gender:");
                    String patientGender = scanner.nextLine();
                    System.out.println("Please enter the patient's Adress:");
                    String patientAddress = scanner.nextLine();
                    System.out.println("Please enter the patient's Phone Number:");
                    String patientPhone = scanner.nextLine();
                    Patient newPatient = new Patient(patientId, patientName, patientAge, patientGender, patientAddress,
                            patientPhone);

                    hospital.addPatient(newPatient);
                    System.out.println("Patient added successfully!\n");
                    break;
                case 3:
                    System.out.print("Please enter the doctor's ID: ");
                    int searchDoctorID = scanner.nextInt();
                    Doctor doctor = hospital.findDoctorById(searchDoctorID);
                    if (doctor == null) {
                        System.out.println("Doctor not found with ID " + searchDoctorID);
                    } else {
                        System.out.println("Doctor found with ID " + searchDoctorID + ":");
                        System.out.println(doctor);
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.out.print("Please enter the patient's ID: ");
                    int searchPatientID = scanner.nextInt();
                    Patient patient = hospital.findPatientById(searchPatientID);
                    if (patient == null) {
                        System.out.println("Patient not found with ID " + searchPatientID);
                    } else {
                        System.out.println("Patient found with ID " + searchPatientID + ":");
                        System.out.println(patient);
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    hospital.displayDoctors();
                    break;
                case 6:
                    hospital.displayPatients();
                    break;
                case 7:
                    System.out.println("Enter your patient id: ");
                    int getPatientId = scanner.nextInt();
                    Patient getPatient = hospital.findPatientById(getPatientId);
                    System.out.println("Enter doctor id to fix the appointment: ");
                    int getDoctorId = scanner.nextInt();
                    scanner.nextLine();
                    Doctor getDoctor = hospital.findDoctorById(getDoctorId);
                    System.out.println("Enter date of appointment: ");
                    String appoitmentDate = scanner.nextLine();
                    System.out.println("Enter time of appointment: ");
                    String appoitmentTime = scanner.nextLine();

                    Appointment newAppointment = new Appointment(getDoctor, getPatient, appoitmentDate, appoitmentTime);
                    getDoctor.addAppointment(newAppointment);

                    break;
                case 8:
                    System.out.println("Thank you for using the Hospital Management System. Goodbye!");
                    System.exit(0);
                    break;
                case 9:
                    System.out.println("Enter doctor id to know details: ");
                    int checkDoctorId = scanner.nextInt();
                    Doctor doctorStatus = hospital.findDoctorById(checkDoctorId);
                    doctorStatus.getAppointments();
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }
}