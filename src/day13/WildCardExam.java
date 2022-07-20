package day13;

public class WildCardExam {
	
	public static void registerCourse (Course<?> course) {
		System.out.println(course.getName() + " 수강생 : ");

		for(int i=0; i<= course.getStudents().length; i++) {
			Person person = (Person)course.getStudents()[i];
			System.out.println(person.getName() + ",");
		}
		
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : ");
		
		for(int i=0; i<= course.getStudents().length; i++) {
			Student person = (Student)course.getStudents()[i];
			System.out.println(person.getName() + ",");
		}
		
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : ");
		
		for(int i=0; i<= course.getStudents().length; i++) {
			Student person = (Student)course.getStudents()[i];
			System.out.println(person.getName() + ",");
		}
		
	}
	

	public static void main(String[] args) {
		//와일드카드 : ?
		//Course<?>
		//Course<? extends 상위 타입>
		//Course<? super 하위 타입>
		
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HightStudent("고등학생"));
		
		registerCourse(personCourse);


		Course<Student> personCourseStudent = new Course<Student>("학생과정", 5);
//		personCourseStudent.add(new Person("일반인"));
//		personCourseStudent.add(new Worker("직장인"));
		personCourseStudent.add(new Student("학생"));
		personCourseStudent.add(new HightStudent("고등학생"));
		
		registerCourse(personCourseStudent);
		
		Course<Worker> personCourseWorker = new Course<Worker>("직장인과정", 5);
//		personCourseWorker.add(new Person("일반인"));
		personCourseWorker.add(new Worker("직장인"));
//		personCourse.add(new Student("학생"));
//		personCourse.add(new HightStudent("고등학생"));
		
		registerCourse(personCourse);
		
		Course<Worker> workerCourse = new Course<Worker>("직장인",5);
		workerCourse.add(null);
	}

}
