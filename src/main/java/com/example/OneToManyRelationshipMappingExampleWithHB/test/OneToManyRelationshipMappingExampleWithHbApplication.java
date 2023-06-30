package com.example.OneToManyRelationshipMappingExampleWithHB.test;

import com.example.OneToManyRelationshipMappingExampleWithHB.entity.Appointment;
import com.example.OneToManyRelationshipMappingExampleWithHB.entity.Patient;
import com.example.OneToManyRelationshipMappingExampleWithHB.util.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class OneToManyRelationshipMappingExampleWithHbApplication {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session= null;
		boolean flag= false;
		Patient patient = null;
		Appointment appointment=null;
		List<Appointment>appointments = null;

		try {
			sessionFactory= SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			patient = new Patient();
			patient.setPatient_name("VIJAY");
			patient.setPatient_age("23");

			appointment = new Appointment();
			appointment.setAppointment_time("10.00");
			appointment.setAppointment_date("22-06-2023");
			appointment.setDoctor_name("ajay");
			session.persist(appointment);
			appointments.add(appointment);



			appointment = new Appointment();
			appointment.setAppointment_time("03:00");
			appointment.setAppointment_date("23/07/2023");
			appointment.setDoctor_name("ajay");
			session.update(appointment);
			appointments.add(appointment);

			patient.setAppointments(appointments);
			session.update(patient);

			flag=true;
		}finally {
			if (transaction!=null){
				if (flag){
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
		}
		SessionFactoryRegistry.closeSessionFactory();
	}

}
