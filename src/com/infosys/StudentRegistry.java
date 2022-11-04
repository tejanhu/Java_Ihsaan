package com.infosys;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentRegistry {

	public static void main(String[] args) {

		Taalib student = new Taalib("Greg", 500, 54);
		Taalib student2 = new Taalib("Greg", 500, 72);
		Taalib student3 = new Taalib("Hubert", 501, 84);
		Taalib student4 = new Taalib("Gerald", 502, 92);

		Set<Taalib> studentSet = new HashSet<Taalib>();

		studentSet.add(student);

		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);

		System.out.println(studentSet);

		Map<Integer, String> studentRecord = new TreeMap<Integer, String>();
		for (Taalib pupil : studentSet) {
			if (!pupil.calculateGrade().equals("N/A")) {
				studentRecord.put(pupil.getRollNumber(), pupil.calculateGrade());
			}
		}
		int count = 0, size = 0;
		List<String> grades = new ArrayList<>();
		grades.addAll(studentRecord.values());
		for (Integer rollNumber : studentRecord.keySet()) {
			count++;
			System.out.println("Student " + count + ":");
			System.out.println("Roll number: " + rollNumber);
			System.out.println(grades.get(size));
			size++;
		}
	}

}
