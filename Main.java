public class Main {
    public static void main(String[] args)
    {
        Course course1=new Course();
        course1.id=1;
        course1.Name="Java";

        Course course2=new Course();
        course2.id=2;
        course2.Name="C# + Angular";

        Profile profile=new Profile();
        profile.Name="İkbal Delibaş";
        profile.email="ikbal53@hotmail.com";
        profile.password="123";

        Course[] courses = {course1,course2};

        CourseManager courseManager=new CourseManager();
        System.out.println("Kurslarımız: ");
        courseManager.showCourses(courses);

        ProfileManager profileManager=new ProfileManager();
        profileManager.editProfile();


    }
}
