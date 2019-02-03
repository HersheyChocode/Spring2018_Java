package w17day1;
import apcs.*;
import java.util.ArrayList;
public class ClassIDSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Snickers", "Hershey", "Choco", "Skittles", "Whoppers"};
		ArrayList<Student>students = new ArrayList<Student>();

		for(String s: names) {
			students.add(new Student(s));
		}

		students.add(new Student(55555, "Hershey", 23));
		students.add(new Student(66666, "Hershey", 23));
		for(Student s: students) {
			s.display();
		}
		//SelectionSort(students);
		InsertionSort(students);
		System.out.println("\n Sorted");
		for(Student s: students) {
			s.display();
		}
	}

	public static void SelectionSort(ArrayList<Student> students) {
		int min = 0;
		for(int i = 0; i< students.size() -1; i++) {
			for(int j = i+1; j<students.size(); j++) {
				String minName = students.get(min).name;
				String currentName = students.get(j).name;
				int minGPA = students.get(min).gpa;
				int currentGPA = students.get(j).gpa;
				int minID = students.get(min).id;
				int currentID = students.get(j).id;
				if(minGPA > currentGPA) {
					Student temp = students.get(min);
					students.set(min, students.get(j));
					students.set(j, temp);
				}else if(minGPA == currentGPA) {
					if(minName.compareToIgnoreCase(currentName) > 0) {
						/*int temp = arr[min];
					arr[min] = arr[j];
					arr[j]=temp;*/
						Student temp = students.get(min);
						students.set(min, students.get(j));
						students.set(j, temp);
					} else if(minName.compareToIgnoreCase(currentName) == 0) {
						if(minID > currentID) {
							Student temp = students.get(min);
							students.set(min, students.get(j));
							students.set(j, temp);
						}
					}
				}
			}
			min++;
		}
	}


	public static void InsertionSort(ArrayList<Student> students) {
		for(int i = 1; i<students.size(); i++) {
			int j = i;
			while(j>0&&students.get(j).gpa<(students.get(j-1).gpa)) {
				Student temp = students.get(j);
				students.set(j, students.get(j-1));
				students.set(j-1, temp);
				j = j-1;
			}if(students.get(j).gpa==(students.get(j-1).gpa)) {
				if(students.get(j).name.compareToIgnoreCase(students.get(j-1).name)>0) {
					Student temp = students.get(j);
					students.set(j, students.get(j-1));
					students.set(j-1, temp);
				}else {
					if(students.get(j).id<(students.get(j-1).id)) {
						Student temp = students.get(j);
						students.set(j, students.get(j-1));
						students.set(j-1, temp);
					}
				}
			}
			/*while(j>0&&arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j = j-1;
			}*/
		}

	}
}