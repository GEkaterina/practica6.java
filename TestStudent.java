
public class TestStudent
{
    public static void sort(Student[] arr)
    {
        Student temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int k = 0; k < arr.length-1; k++)
            {
                if (arr[k].getScore() > arr[k+1].getScore())
                {
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
    }


    public static void main(String[]args)
    {
        Student[] s1 = new Student[4];
        s1[0] = new Student(1546, 90, "Иванова");
        s1[1] = new Student(65772, 49, "Смирнов");
        s1[2] = new Student(35766, 74, "Маслов");
        s1[3] = new Student(47668, 85, "Птушкина");


        for (int i = 0; i < s1.length; i++)
            System.out.println(s1[i]);
        sort(s1);
        System.out.println("\nОтсортированный список: ");
        for (int i = 0; i < s1.length; i++)
            System.out.println(s1[i]);
    }
}