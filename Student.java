
public class Student
{
    private int IDNumber;
    private int score;
    private String Surname;

    Student ()
    {
    }
    public Student ( int ID,int s, String S)
    {
        IDNumber = ID;
        score = s;
        Surname = S;
    }
    public void setIDNumber(int ID)

    {
        IDNumber = ID;
    }
    public int getIDNumber()
    {
        return IDNumber;
    }
    public String getSurname()
    {
        return Surname;
    }
    public void setSurname(String S)
    {
        Surname = S;
    }
    public int getScore()
    {
        return score;
    }
    public void setScore(int s)
    {
        score = s;
    }

    public String toString()
    {
        return "Студент: " + Surname + "; Балл: " + score + "; ID: " + IDNumber;
    }

}

